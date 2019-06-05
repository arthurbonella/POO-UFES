package Exemplo_24;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Encapsula a classe LinkedList facilitando o seu uso e tipificando os objetos
 * para inclusão como instâncias da classe Amigo
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 */
public class ColecaoAmigosLinkedList implements Serializable {
	private List<Amigo> grupo;

	ColecaoAmigosLinkedList() {
		grupo = new LinkedList<Amigo>();
	}

	/**
	 * Insere uma instância da classe Amigo
	 *
	 * @param _amigo objeto a ser incluído da coleção
	 */
	public void insere(Amigo _amigo) {
		this.grupo.add(_amigo);
	}

	/**
	 * Insere uma instância da classe Amigo por intermédio dos seus campos
	 *
	 * @param _nome nome a ser inserido
	 * @param _tel telefone a ser inserido
	 * @param _idade idade a ser inserida
	 */
	public void insere(String _nome, String _tel, int _idade) {
		this.insere(new Amigo(_nome, _tel, _idade));
	}

	/**
	 * Realiza busca de uma instância da classe Amigo através do seu nome
	 * <p>
	 * <b>IMPORTANTE:</b> a coleção deve estar ordenada por nome
	 *
	 * @param _nome	nome a ser pesquisado
	 * @return retorna a instância associada ao nome pesquisado (não existe
	 *     	precisão da posição - se primeiro ou se último, ...)
	 *     	<p>
	 *     	Se não encontrar retorna null
	 */
	public Amigo busca(String _nome) {
		// o método binarySearsh requer 3 argumentos: a coleção usada na
		// pesquisa, o elemento a ser pesquisado, e a forma como o elemento será pesquisado
		int pos = Collections.binarySearch(this.grupo, new Amigo(_nome),
				new ComparaPorNome());
		if (pos >= 0)
			// este cast para Amigo é necessário pois o retorno do get é um Object
			return (Amigo) grupo.get(pos);
		else
			return null;
	}

	/**
	 * Ordena a coleção pelo nome
	 */
	public void ordenaPorNome() {
		// o método estático sort da classe Collections necessita
		// 2 argumentos: a coleção que será ordenada,
		// e a forma como ela será ordenada.
		// Existe uma versão sobrecarregada para 1 argumento, neste caso,
		// é usado o método compareTo da classe base
		Collections.sort(this.grupo, new ComparaPorNome());
	}

	/**
	 * Ordena a coleção pela idade
	 */
	public void ordenaPorIdade() {
		Collections.sort(this.grupo, new ComparaPorIdade());
	}

	/**
	 * Sobreposição do método toString para retornar todo o conteúdo da coleção
	 * separando os elementos por espaços
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder("LinkedList = ");
		for (int i = 0; i < this.grupo.size(); i++)
			s.append(this.grupo.get(i) + " ");
		return s.toString();
	}
}

