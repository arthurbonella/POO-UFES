package Organizador;


import Tempo.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Encapsula as classes LinkedList facilitando o seu uso e tipificando os objetos para
 * inclusão como instâncias da classes extendidas de ItemAgenda

 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
 */
public class Agenda {

	private List<ItemAgenda> itens_agenda;
	/**
	 * Construtor para lista encadeada do tipo ItemAgenda
	 */
	public Agenda() {
		itens_agenda = new LinkedList<ItemAgenda>();
	}
	/**
	 * Método para acessar os itens da agenda
	 * 
	 * @return itens da agenda
	 */
	public List<ItemAgenda> getItensDaAgenda() {
		return this.itens_agenda;
	}
	/**
	 * Metodo usado para inserir um novo item para os itens da agenda
	 *  
	 * @param _novo_item insere um novo item nos itens da agenda
	 */
	public void insereItem(ItemAgenda _novo_item) {
		this.itens_agenda.add(_novo_item);
	}
	/**
	 * Método que percorre os itens da agenda e armazena as metas em uma LinkedList e organizamos as prioridades
	 * pelo metodo sort() da coleção Collections
	 * 
	 * 
	 * 
	 * 
	 * @return metas ordenadas por prioridade
	 */
	public List<Meta> metasPorPrioridade() {

		int i;

		List<Meta> metas_ordenadas = new LinkedList<Meta>();

		for (i = 0; i < this.itens_agenda.size();i++) {
			metas_ordenadas.add((Meta) this.itens_agenda.get(i));
		}
		Collections.sort(metas_ordenadas);
		return metas_ordenadas;
	}
	/**
	 * Método que percorre os itens da agenda e armazena os lembretes em uma LinkedList e organiza com o metodo sort()
	 * 
	 * 
	 * 
	 * @return lembretes ordenados em uma linkedlist
	 */
	public List<Lembrete> lembretesPorAntecedencia() {
		int i;
		List<Lembrete> lembretes_ordenados = new LinkedList<Lembrete>();
		for (i = 0; i < this.itens_agenda.size();i++) {
			lembretes_ordenados.add((Lembrete) this.itens_agenda.get(i));
		}
		Collections.sort(lembretes_ordenados);
		return lembretes_ordenados;
	}
	/**
	 * Método que percorre os itens da agenda e armazena os eventos em uma linkedlist e depois organiza com sort()
	 * 
	 * 
	 * 
	 * @return eventos ordenados por local
	 */
	public List<Evento> eventosPorLocal() {
		int i;
		List<Evento> eventos_ordenados = new LinkedList<Evento>();
		for (i = 0; i < this.itens_agenda.size();i++) {
				eventos_ordenados.add((Evento) this.itens_agenda.get(i));
		}
		return eventos_ordenados;
	}
	/**
	 * Método que retorna todos os itens da agenda
	 * 
	 * @return todos os itens da agenda
	 */
	public List<ItemAgenda> todosItens() {
		return this.getItensDaAgenda();
	}
	/**
	 * Método que retorna os itens da agenda que estejam entre um intervalo de datas
	 * 
	 * @param _inicial Data inicial passada pelo usuario
	 * @param _final Data final passada pelo usuario
	 * @return retorna os itens em que o inicio e fim esteja dentro das datas informadas
	 */
	public List<ItemAgenda> todosItensEmIntervalo(Data _inicial, Data _final) {
		int i;
		List<ItemAgenda> itens_entre_data_informada = new LinkedList<ItemAgenda>();
		for (i = 0; i < this.itens_agenda.size(); i++) {
			if (this.itens_agenda.get(i).getDuracao().getDataInicio().compareTo(_inicial) != -1 && 
					this.itens_agenda.get(i).getDuracao().getDataFim().compareTo(_final) != 1) {
				itens_entre_data_informada.add(this.itens_agenda.get(i));
			}
		}
		return itens_entre_data_informada;
	}
	/**
	 * Método que retorna todos os itens da agenda em forma de String
	 * 
	 * @return String com todos os itens da agenda
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(this.itens_agenda);
		return info.toString();
	}
}

