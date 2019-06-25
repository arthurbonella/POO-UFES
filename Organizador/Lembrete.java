package Organizador;

import Tempo.*;
/**
 * Classe Lembrete
 * Classe extendida de ItemAgenda, adicionando um campo mostrando quantos minutos de antecedencia o lembrete deve
 * se ativar
 * 
 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
 */

public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {
	/** Inteiro que representa os minutos de antecedencia */
	public int minAntecedencia;
	/**
	*@param _titulo titulo do item
	*@param _descricao descricao do item
	*@param _periodo periodo que ocorrera o item
	*@param _minAntecedencia minutos de antecedencia
	*@throws Exception tratamento para minAntecedencia negativos ou zero
	*/
	public Lembrete(String _titulo, String _descricao, Periodo _periodo, int _minAntecedencia) throws Exception {
		super(_titulo, _descricao, _periodo);
		this.setMinAntecedencia(_minAntecedencia);
	}
	/**
	 * Construtor com 7 parametros
	 * @param _titulo titulo do item
	 * @param _descricao descricao do item
	 * @param _data_inicio data de inicio do item
	 * @param _data_fim data de termino do item
	 * @param _horario_inicio hora de inicio
	 * @param _horario_fim hora do fim
	 * @param _minAntecedencia minutos de antecedencia
	 * @throws Exception tratamento para minAntecedencia negativos ou zero
	 * */
	public Lembrete(String _titulo, String _descricao, Data _data_inicio, Data _data_fim, Horario _horario_inicio, Horario _horario_fim, int _minAntecedencia) throws Exception {
		super(_titulo, _descricao, _data_inicio, _data_fim, _horario_inicio, _horario_fim);
		this.setMinAntecedencia(_minAntecedencia);
	}
	/**
	 * Retornaa o valor de minAntecedencia do respectivo campo
	 * @return int - tempo que lembrete se acionará
	 * */
	public int getMinAntecedencia() {
		return this.minAntecedencia;
	}
	/**
	 * Altera o valor de minutos de antecedencias
	 * @param _minAntecedencia
	 * */
	public void setMinAntecedencia(int _minAntecedencia) throws Exception {
		if (_minAntecedencia > 0) {
			this.minAntecedencia = _minAntecedencia;
		}
		else {
			throw new Exception("\nValor invÃ¡lido -> Numero negativo ou 0.\n");
		}
	}
	/**
	 *Acessamos os campos e vemos se eles sao iguais,maior ou menor
	 *@return int 0,1,-1 sendo igual,maior e menor , respectivamente
	 */
	public int compareTo(Lembrete _objeto) {
		if (this.getMinAntecedencia() == _objeto.getMinAntecedencia()) {
			return 0;

		}
		if (this.getMinAntecedencia() > _objeto.getMinAntecedencia()) {
			return 1;

		}
		else {
			return -1;
		}

	}
	/**
	 *Compara se são iguais os itens ou nao
	 *@return boolean
	 */
	public boolean equals(Lembrete _objeto) {
		if(this.compareTo(_objeto) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Método toString sobreposto para informar todas as informações do objeto
	 * @return String com todos os dados
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\nAviso ");
		str.append(this.getMinAntecedencia());
		str.append(" minutos antes\n");

		return str.toString();
	}
}
