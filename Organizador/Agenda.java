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

	public List<ItemAgenda> getItensDaAgenda() {
		return this.itens_da_agenda;
	}

	public void insereItem(ItemAgenda _novo_item) {
		this.itens_da_agenda.add(_novo_item);
	}

	public List<Meta> informaMetasPorPrioridade() {

		int i;

		List<Meta> metas_ordenadas = new LinkedList<Meta>();

		for (i = 0; i < this.itens_da_agenda.size();i++) {
			metas_ordenadas.add((Meta) this.itens_da_agenda.get(i));
		}
		Collections.sort(metas_ordenadas);
		return metas_ordenadas;
	}
	public List<Lembrete> informaLembretesPorMinDeAntecedencia() {

		int i;
		List<Lembrete> lembretes_ordenados = new LinkedList<Lembrete>();
		for (i = 0; i < this.itens_da_agenda.size();i++) {
			lembretes_ordenados.add((Lembrete) this.itens_da_agenda.get(i));
		}
		Collections.sort(lembretes_ordenados);
		return lembretes_ordenados;
	}
	public List<Evento> informaEventosPorLocal() {
		int i;
		List<Evento> eventos_ordenados = new LinkedList<Evento>();
		for (i = 0; i < this.itens_da_agenda.size();i++) {
			eventos_ordenados.add((Evento) this.itens_da_agenda.get(i));
		}
		Collections.sort(eventos_ordenados);
		return eventos_ordenados;
	}
	public List<ItemAgenda> informaTodosOsItens() {
		return this.getItensDaAgenda();
	}
	public List<ItemAgenda> informaItensNoIntervaloDeData(Data _inicial, Data _final) {
		int i;
		List<ItemAgenda> itens_entre_data_informada = new LinkedList<ItemAgenda>();
		for (i = 0; i < this.itens_da_agenda.size(); i++) {
			if (this.itens_da_agenda.get(i).getDuracao().getDataInicio().compareTo(_inicial) != -1 && 
					this.itens_da_agenda.get(i).getDuracao().getDataFim().compareTo(_final) != 1) {
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

