package Organizador;

import Tempo.*;

public class Meta extends ItemAgenda implements Comparable<Meta> {

	Prioridade meta;

	public Meta (String _titulo,String _descricao, Periodo _duracao,Prioridade _meta) {
		super(_titulo, _descricao, _duracao);
		this.setMeta(_meta);
	}
	public Meta (String _titulo,String _descricao, Periodo _duracao,int _meta) throws Exception {
		
		super(_titulo, _descricao, _duracao);
		
		if(_meta == 3) {
			this.setMeta(Prioridade.BAIXA);
		}
		else if(_meta == 2) {
			this.setMeta(Prioridade.MEDIA);
		}
		else if(_meta == 1) {
			this.setMeta(Prioridade.ALTA);
		}
		else {
			throw new Exception("Meta Inexistente.");
		}
	}
	public Meta () throws Exception {
		super.setItemAgenda("", "", new Periodo());;
		this.setMeta(Prioridade.BAIXA);
	}	
	public void setMeta(Prioridade _meta) {
		this.meta=_meta;
	}
	public Prioridade getMeta() {
		return this.meta;
	}

	public int compareTo(Meta objeto) {
		if (this.getMeta().getCodigo() == objeto.getMeta().getCodigo()) {
			return 0;
		}
		if (this.getMeta().getCodigo() < objeto.getMeta().getCodigo()) {
			return -1;
		}
		else {
			return 1;
		}
	}

	public boolean equals(Meta objeto) {

		if(this.compareTo(objeto) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\nPrioridade da Meta: "+this.getMeta());
		str.append("\n");


		return str.toString();
	}
}
