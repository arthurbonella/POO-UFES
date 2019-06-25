package Organizador;

import Tempo.*;

public class Meta extends ItemAgenda{

	Prioridade meta;

	public Meta (String _titulo,String _descricao, Periodo _duracao,Prioridade _meta) {
		super(_titulo, _descricao, _duracao);
		this.setMeta(_meta);
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



	@Override
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

	@Override
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

		str.append("Título: "+super.getTitulo());
		str.append("\nDescrição: "+super.getDescricao());
		str.append("\n"+super.getDuracao());
		str.append("\nPrioridade da Meta: "+this.getMeta());

		return str.toString();
	}
}

/*
 * package codigos;

public class Meta extends ItemAgenda implements Comparable<Meta> {
	private int prioridade;
	
	public Meta(String _registro_item, String _descricao, Periodo _periodo, int _prioridade) throws Exception {
		super(_registro_item, _descricao, _periodo);
		this.setPrioridade(_prioridade);
	}
	public Meta(String _registro_item, String _descricao, Data _data_inicio, Data _data_fim, Horario _horario_inicio, 
			Horario _horario_fim, int _prioridade) throws Exception {
		super(_registro_item, _descricao, _data_inicio, _data_fim, _horario_inicio, _horario_fim);
		this.setPrioridade(_prioridade);
	}
	
	public int getPrioridade() {
		return this.prioridade;
	}
	public void setPrioridade(int _prioridade) throws Exception {
		if (_prioridade < 1) {
			throw new Exception("\nO valor da prioridade deve ser maior do que zero\n");
		}
		else {
			this.prioridade = _prioridade;
		}
	}

	public int compareTo(Meta _meta) {
		if (this.getPrioridade() < _meta.getPrioridade()) return -1;
		else if (this.getPrioridade() > _meta.getPrioridade()) return 1;
		else return 0;
	}

	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(super.toString());
		info.append("\nPrioridade da meta: " + this.getPrioridade() + "\n");
		return info.toString();
	}

	

	

	

	
	
}
*/