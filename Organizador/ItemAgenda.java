package Organizador;

import Tempo.*;

/**
 * Classe Abstrata que representa um item de agenda
 * 
 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
 */

abstract public class ItemAgenda {
	/** Titulo e descrição */
	String titulo,descricao;
	/** Periodo de tempo do item*/
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
	/**
	 * Altera o registro do item, recebendo uma nova string
	 * 
	 * @param _registro_item String que representa o titulo
	 */
	public void setTitulo(String _titulo)	{
		this.titulo = _titulo;
	}	
	/**
	 * Altera a descrição do item, recebendo uma nova string
	 * 
	 * @param _descricao String descrição 
	 */
	public void setDescricao(String _descricao)	{
		this.descricao = _descricao;
	}
	/**
	 * Altera a duração do item
	 * 
	 * @param _periodo Periodo que representa a duração
	 */
	public void setDuracao(Periodo _duracao)	{
		this.duracao = _duracao;
	}	
	/**
	 * Acessa o titulo
	 * 
	 * @return String com o titulo
	 */
	public String getTitulo()	{
		return this.titulo;
	}	
	/**
	 * Acessa a descrição do item
	 * 
	 * @return Descrição do item
	 */
	public String getDescricao()	{
		return this.descricao;
	}	
	/**
	 * Acessa a duracao do item
	 * 
	 * @return duracao do item
	 */
	public Periodo getDuracao(){
		return this.duracao;
	}
	/**
	 * Altera o registro, com duas Strings e um Periodo, para definir um item de agenda
	 * 
	 * @param _titulo titulo do item
	 * @param _descricao descrição do item
	 * @param _duracao duracao do item
	 * 
	 */
	public void setItemAgenda(String _titulo, String _descricao, Periodo _duracao) {
		this.setDuracao(_duracao);
		this.setDescricao(_descricao);
		this.setTitulo(_titulo);
	}
	/**
	 * Método para retornar as informações em formato de string
	 * 
	 * @return String que retorna uma mostra dos campos
	 */

	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append("\nTitulo: " + this.getTitulo());
		str.append("\nDescricao: " + this.getDescricao());
		str.append("\n" + this.getDuracao());

		return str.toString();
	}
}
