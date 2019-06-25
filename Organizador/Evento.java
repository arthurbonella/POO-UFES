package Organizador;

import Tempo.*;

public class Evento extends ItemAgenda implements Comparable<Evento> {
	
	private String local;
	
	public Evento(String _registro_item, String _descricao, Periodo _periodo, String _local) {
		super(_registro_item, _descricao, _periodo);
		this.setLocal(_local);
	}
	public Evento(String _registro_item, String _descricao, Data _data_inicio, Data _data_fim, Horario _horario_inicio, 
			Horario _horario_fim, String _local) {
		super(_registro_item, _descricao, _data_inicio, _data_fim, _horario_inicio, _horario_fim);
		this.setLocal(_local);
	}
	
	public String getLocal() {
		return this.local;
	}
	public void setLocal(String _local) {
		this.local = _local;
	}
	
	public int compareTo(Evento _evento) {
		return this.getLocal().compareTo(_evento.getLocal());
	}
	
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(super.toString());
		info.append("\nLocal do Evento: " + this.getLocal() + "\n");
		return info.toString();
	}
	
}
