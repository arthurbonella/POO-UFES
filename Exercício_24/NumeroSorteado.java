package Exerc�cio_24;

import java.io.Serializable;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as coleções
 * TreeSet.
 * <p>
 * Oferece métodos de sortear numeros aleatorios sem repedições.
 * 
 * @author Arthur B. V.
 * @version 1.0 (junho - 2019)
 */
public class NumeroSorteado implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/** Quantidade de Numero*/
	private int quantNumero;
	
	/** Faixa Superior*/
	private int limiteInferior;
	
	/** Faixa Inferior*/
	private int limiteSuperior;
	
	private Set<Integer> sorteioVal;
	
	
	/**
	 * construtor para inicializar valores vazios
	 */
	public NumeroSorteado() {
		this.setQuantidade(4);
		this.setIntervaloInicio(1);
		this.setIntervaloFim(99);
		this.Gerador();
	}
	
	
	/**
	 * construtor para inicializar valores das faixas
	 *
	 * @param _faixaI valor inicial do intervalo
	 * @param _faixaF valor final do intervalo
	 */
	public NumeroSorteado(int _faixaI, int _faixaF) {
		this.setQuantidade(4);
		this.setIntervaloInicio(_faixaI);
		this.setIntervaloFim(_faixaF);
		this.Gerador();
	}
	
	/**
	 * construtor para inicializar valores da quantidade
	 *
	 * @param _quant quantidade de numeros a serem sorteados 
	 */
	public NumeroSorteado(int _quant) {
		this.setQuantidade(_quant);
		this.setIntervaloInicio(1);
		this.setIntervaloFim(99);
		this.Gerador();
	}
	
	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _quant quantidade de numeros a serem sorteados
	 * @param _faixaI valor inicial do intervalo
	 * @param _faixaF valor final do intervalo
	 */
	public NumeroSorteado(int _quant, int _faixaI, int _faixaF) {
		this.setQuantidade(_quant);
		this.setIntervaloInicio(_faixaI);
		this.setIntervaloFim(_faixaF);
		this.Gerador();
	}

	/**
	 * pega a quantidade de numeros
	 * 
	 * @return quantidade de numeros
	 */
	public int getQuantidade() {
		return this.quantNumero;
	}
	
	/**
	 * pega o inicio do intervalo
	 * 
	 * @return inicio do intervalo
	 */
	public int getIntervaloInicio() {
		return this.limiteInferior;
	}
	
	/**
	 * pega  o fim do intervalo
	 * 
	 * @return fim do intervalo
	 */
	public int getIntervaloFim() {
		return this.limiteSuperior;
	}
	
	/**
	 * pega os valores sorteados
	 * @return 
	 * 
	 * @return valores sorteados
	 */
	public  Set<Integer> getSorteioVal() {
		return this.sorteioVal;
	}

	/**
	 * modificar a quantidade de numeros
	 * 
	 * @param _quant quantidade de numeros que deseja
	 */
	public void setQuantidade(int _quant) {
		this.quantNumero = _quant;
	}
	
	/**
	 * modificar o inicio do intervalo
	 * 
	 * @param _inicio valor inicial dos numeros sorteados
	 */
	public void setIntervaloInicio(int _inicio) {
		this.limiteInferior = _inicio;
	}
	
	/**
	 * modificar o fim do intervalo
	 * 
	 * @param _fim valor final dos numeros sorteados
	 */
	public void setIntervaloFim(int _fim) {
		this.limiteSuperior = _fim;
	}

	/**
	 * Método para produzir numeros aleatorios utilizando o Random e a classe 
	 * TreeSet, pois ela tem que verificar se há
	 * elementnos repetidos no conjunto através do critério determinado por
	 * compareTo nela mesmo ja construida. Com isso tem a adição dos valores
	 * inteiros na variavel sorteioVal
	 * 
	 */
	public void Gerador() {
		int i = 0;
		int a;
		Random gerador = new Random();
		this.sorteioVal = new TreeSet<Integer>();
		while (i < this.quantNumero) {
			a = gerador.nextInt(this.limiteSuperior - this.limiteInferior + 1) + this.limiteInferior;
			if (this.sorteioVal.contains(a)) {
				continue;
			}
			else {
				this.sorteioVal.add(new Integer(a));
				i++;
			}
		}
	}
	
	/**
	 * Sobreposição do método toString para retornar todo o conteúdo dos 
	 * numeros sorteados
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		
		StringBuilder info = new StringBuilder();

		info.append(this.sorteioVal);

		return info.toString();
	}
}
