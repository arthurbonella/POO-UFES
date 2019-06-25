package Organizador;


import Tempo.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Agenda {
	
	private List<ItemAgenda> itens_da_agenda;
	
	public Agenda() {
		itens_da_agenda = new LinkedList<ItemAgenda>();
	}
	
	public List getItensDaAgenda() {
		return this.itens_da_agenda;
	}
	
	public void insereItem(ItemAgenda _novo_item) {
		this.itens_da_agenda.add(_novo_item);
	}
	
	public List informaMetasPorPrioridade() {
		int i;
		List<Meta> metas_ordenadas = new LinkedList<Meta>();
		for (i = 0; i < this.itens_da_agenda.size();i++) {
			if (this.itens_da_agenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Meta")) {
				metas_ordenadas.add((Meta) this.itens_da_agenda.get(i));
			}
		}
		Collections.sort(metas_ordenadas);
		return metas_ordenadas;
	}
	public List informaLembretesPorMinDeAntecedencia() {
		int i;
		List<Lembrete> lembretes_ordenados = new LinkedList<Lembrete>();
		for (i = 0; i < this.itens_da_agenda.size();i++) {
			if (this.itens_da_agenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Lembrete")) {
				lembretes_ordenados.add((Lembrete) this.itens_da_agenda.get(i));
			}
		}
		Collections.sort(lembretes_ordenados);
		return lembretes_ordenados;
	}
	public List informaEventosPorLocal() {
		int i;
		List<Evento> eventos_ordenados = new LinkedList<Evento>();
		for (i = 0; i < this.itens_da_agenda.size();i++) {
			if (this.itens_da_agenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Evento")) {
				eventos_ordenados.add((Evento) this.itens_da_agenda.get(i));
			}
		}
		Collections.sort(eventos_ordenados);
		return eventos_ordenados;
	}
	public List informaTodosOsItens() {
		return this.getItensDaAgenda();
	}
	public List informaItensNoIntervaloDeData(Data _inicial, Data _final) {
		int i;
		List<ItemAgenda> itens_entre_data_informada = new LinkedList<ItemAgenda>();
		for (i = 0; i < this.itens_da_agenda.size(); i++) {
			if (Data.compareTo(this.itens_da_agenda.get(i).getPeriodo().getDataInicio(), _inicial) != -1 && 
					Data.compareTo(this.itens_da_agenda.get(i).getPeriodo().getDataFim(), _final) != 1) {
				itens_entre_data_informada.add(this.itens_da_agenda.get(i));
			}
		}
		return itens_entre_data_informada;
	}
	
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(this.itens_da_agenda);
		return info.toString();
	}
}

