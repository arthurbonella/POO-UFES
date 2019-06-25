package Organizador;

import Tempo.*;

/**
 * Classe Evento que é uma extensão da clase ItemAgenda, so que com um campo a mais, LOCAL
 * <p>
 *  Interfaces usadas:
 *  <p>
 *  <b>Comparable<b>
 *  <p>
 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
*/

public class Evento extends ItemAgenda implements Comparable<Evento> {
	
	/** String sobre o local do evento */
	private String local;
	/**
	 * Construtor com 4 campos
	 * @param _registro_item String que representa o registro do item
	 * @param _descricao String que representa a descricao do evento
	 * @param _periodo Periodo do evento
	 * @param _local String que representa o local do evento
	 */
	public Evento(String _registro_item, String _descricao, Periodo _periodo, String _local) {
		super(_registro_item, _descricao, _periodo);
		this.setLocal(_local);
	}
	/**
	 * Construtor com 7 campos
	 * 
	 * @param _registro_item String que representa o registro do item
	 * @param _descricao String que representa a descricao do evento
	 * @param _data_inicio Data de inicio do evento
	 * @param _data_fim Data do fim do evento
	 * @param _horario_inicio Horario do inicio do evento
	 * @param _horario_fim Horario do fim do evento
	 * @param _local String que representa o local do evento
	 */
	public Evento(String _registro_item, String _descricao, Data _data_inicio, Data _data_fim, Horario _horario_inicio,Horario _horario_fim, String _local) {
		super(_registro_item, _descricao, _data_inicio, _data_fim, _horario_inicio, _horario_fim);
		this.setLocal(_local);
	}
	/**
	 * Construtor Vazio
	 * 
	 * @param _registro_item String que representa o registro do item
	 * @param _descricao String que representa a descricao do evento
	 * @param _data_inicio Data de inicio do evento
	 * @param _data_fim Data do fim do evento
	 * @param _horario_inicio Horario do inicio do evento
	 * @param _horario_fim Horario do fim do evento
	 * @param _local String que representa o local do evento
	 */
	public Evento() throws Exception {
		super();
		this.setLocal("");
	}
	/**
	 * Acessa o local do evento
	 * 
	 * @return Local
	 */
	public String getLocal() {
		return this.local;
	}
	/**
	 * Metodo para inserir local do evento
	 * 
	 * @param _local 
	 */
	public void setLocal(String _local) {
		this.local = _local;
	}
	/**
	 * Comparamos o local do objeto instanciado com outro
	 * @return 0 para igual,1 pra maior, -1 pra menor
	 */
	public int compareTo(Evento _evento) {
		return this.getLocal().compareTo(_evento.getLocal());
	}
	/**
	 * Método toString sobreposto 
	 * 
	 * @return String com todos os dados de evento
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\nLocal do Evento: ");
		str.append(this.getLocal());
		str.append("\n");

		return str.toString();
	}

}
