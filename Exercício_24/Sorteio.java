package Exerc�cio_24;

import java.io.Serializable;

import Exerc�cio_02.Data;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as coleções
 * LinkedList, TreeSet e HashMap
 * @author Arthur B. V.
 * @version 1.0 (junho-2019)
 */

public class Sorteio implements Serializable {
	

	private static final long serialVersionUID = 1L;

	/** dia da data referente ao sorteio */
	private int dia;
	
	/** mês da data referente ao sorteio */
	private int mes;
	
	/** ano da data referente ao sorteio */
	private int ano;
	
	/**Nomeros sorteados*/
	
	private NumeroSorteado num;
	
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param d dia do sorteio
  	 * @param m mes do sorteio
  	 * @param a ano do sorteio
  	 * @param quant quantidade de sorteios
  	 * @param limInf limite inferior do range de valores
  	 * @param limSup limite superior do range de valores
  	 */

	public Sorteio (int d, int m, int a, int quant, int limInf, int limSup) throws Exception {
		this.setData(d,m,a);
		this.setNumSort(quant, limInf, limSup);
	}
	
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param _data data do sorteio
  	 * @param quant quantidade de sorteios
  	 * @param limInf limite inferior do range de valores
  	 * @param limSup limite superior do range de valores
  	 */
	public Sorteio (Data _data, int quant, int limInf, int limSup) throws Exception {
		this.setData(_data);
		this.setNumSort(quant, limInf, limSup);
	}
	
	/**
  	 * construtor com os valores da data e a arvore com os valores da árvore
  	 *
  	 * @param d dia do sorteio
  	 * @param m mes do sorteio
  	 * @param a ano do sorteio
  	 * @param numSort numeros sorteados
  	 */
	
	public Sorteio (int d, int m, int a, NumeroSorteado numSort) throws Exception {
		this.setData(d,m,a);
		this.setNumSort(numSort);
	}
	
	/**
  	 * construtor com os valores da data apenas 
  	 *
  	 * @param d dia do sorteio
  	 * @param m mes do sorteio
  	 * @param a ano do sorteio
  	 */
	
	public Sorteio (int d, int m, int a) throws Exception {
		this.setData(d,m,a);
		this.setNumSort();
	}
	
	/**
  	 * construtor com a quantidades de numeros a serem sorteados apenas 
  	 *
  	 * @param quant quantidade de sorteios
  	 */
	
	public Sorteio (int quant) throws Exception {
		this.setData(1,1,1900);
		this.setNumSort(quant);
	}
	
	/**
  	 * construtor default que vai inicializar com os valores padroes
  	 */
	
	public Sorteio() throws Exception {
		this.setData(1,1,1900);
		this.setNumSort();
	}
	
	/**
	 * pega o valor do dia
	 * 
	 * @return valor do dia
	 */
	public int getDia() {
		return this.dia;
	}
	/**
	 * pega o valor do mês
	 * 
	 * @return valor do mês
	 */
	public int getMes() {
		return this.mes;
	}
	/**
	 * pega o valor do ano
	 * 
	 * @return valor do ano
	 */
	public int getAno() {
		return this.ano;
	}
	/**
	 * modifica a data utilizando os valores para dia, mês e ano
	 * @param d numero que representa o dia
	 * @param m numero que representa o mês
	 * @param a numero que representa o ano
	 * @throws Exception para o dia, mês ou ano invalidos
	 */
	public void setData(int d, int m, int a) throws Exception{
		if (Data.isDataValida(d, m, a)) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
		else {
			throw new Exception("Data invalida");
		}
	}
	/**
	 * modifica a data utilizando os valores para dia, mês e ano � partir de uma data
	 * @param d numero que representa o dia
	 * @param m numero que representa o mês
	 * @param a numero que representa o ano
	 * @throws Exception para o dia, mês ou ano invalidos
	 */
	
	public void setData(Data _data) throws Exception{
		
		if (Data.isDataValida(_data.getDia(),this.mes = _data.getMes(),_data.getAno())) {
			this.dia = _data.getDia();
			this.mes = _data.getMes();
			this.ano = _data.getAno();
		}
		else {
			throw new Exception("Data invalida");
		}
	}
	
	/**
  	 * Modifica o valor do numero sorteado
  	 * @param _quant quantidade de numeros sorteados
  	 * @param _limIn limite inferior dos numeros
  	 * @param _limSup limite superios dos numeros
  	 */
	
	public void setNumSort(int _quant, int _limIn, int _limSup) {
		this.num = new NumeroSorteado(_quant, _limIn, _limSup);
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado
  	 * @param numSort a arvore de numeros sorteados
  	 */
	
	public void setNumSort(NumeroSorteado numSort) {
		this.num = numSort;
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado
  	 * @param _quant quantidade de numeros sorteados
  	 */
	
	public void setNumSort(int quant) {
		this.num = new NumeroSorteado(quant);
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado com valor default
  	 * 
  	 */
	
	public void setNumSort() {
		this.num = new NumeroSorteado();
	}
	
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores dos campos
	 */
	
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		s.append("\nData: ");
		s.append(this.getDia());
		s.append("/");
		s.append(this.getMes());
		s.append("/");
		s.append(this.getAno());
		s.append("\nNumeros Sorteados: ");
		s.append(this.num.getSorteioVal());
		
		return s.toString();
	}
	
}
