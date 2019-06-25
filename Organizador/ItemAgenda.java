package Organizador;

import Tempo.*;

abstract public class ItemAgenda {

	String titulo,descricao;
	Periodo duracao;
	
	public ItemAgenda(String _registro_item, String _descricao, Periodo _periodo) {
		this.setDescricao(_descricao);
		this.setDuracao(_periodo);
		this.setTitulo(_registro_item);
	}
	public ItemAgenda(String _registro_item, String _descricao, Data _data_inicio, Data _data_fim, 
			Horario _horario_inicio, Horario _horario_fim) {
		this.setDescricao(_descricao);
		this.setDuracao(new Periodo (_data_inicio, _data_fim, _horario_inicio, _horario_fim));
		this.setDescricao(_registro_item);
	}
	public ItemAgenda() throws Exception {
		this.setDescricao("");
		this.setDuracao(new Periodo ());
		this.setDescricao("");
	}
	
	public void setTitulo(String _titulo)	{
		this.titulo = _titulo;
	}	
	public void setDescricao(String _descricao)	{
		this.descricao = _descricao;
	}	
	public void setDuracao(Periodo _duracao)	{
		this.duracao = _duracao;
	}	
	public String getTitulo()	{
		return this.titulo;
	}	
	public String getDescricao()	{
		return this.descricao;
	}	
	public Periodo getDuracao(){
		return this.duracao;
	}
	public void setItemAgenda(String _titulo, String _descricao, Periodo _duracao) {
		this.setDuracao(_duracao);
		this.setDescricao(_descricao);
		this.setTitulo(_titulo);
	}
	
	abstract public String toString();
	/*public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("\nRegistro do Item: " + this.getRegistroItem());
		info.append("\nDescricao: " + this.getDescricao());
		info.append("\nPeriodo: " + this.getPeriodo());
		return info.toString();
	}*/
	abstract public int compareTo(Meta objeto);
	abstract public boolean equals(Meta objeto);
	
	
}
