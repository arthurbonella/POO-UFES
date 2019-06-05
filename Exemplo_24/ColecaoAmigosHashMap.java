package Exemplo_24;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Encapsula a classe HashMap facilitando o seu uso e tipificando os objetos para
 * inclusão como instâncias da classe Amigo
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
*/
public class ColecaoAmigosHashMap implements Serializable {
	private Map<String,Amigo> grupo;

	ColecaoAmigosHashMap() {
		grupo = new HashMap<String,Amigo>();
	}

	/**
	 * Insere uma instância da classe Amigo
	 *
	 * @param _amigo objeto a ser incluído da coleção
	 */
	public void insere(Amigo _amigo) {
		this.grupo.put(_amigo.getNome(), _amigo);
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
	 * Verifica a existência de uma intância através da chave nome
	 * @param _nome nome a ser pesquisado
	 * @return true se achou <p>
	 *     	false se não achou
	 */
	public boolean existe(String _nome) {
		return this.grupo.containsKey(_nome);
	}

	/**
	 * Realiza busca de uma instância da classe Amigo através da sua chave (nome)
	 * @param _nome nome a ser pesquisado
	 * @return retorna a instância associada ao nome pesquisado
	 *     	<p>
	 *     	Se não encontrar retorna null
	 */
	public Amigo busca(String _nome) {
		// este cast para Amigo é necessário pois o retorno do get é um Object
		return (Amigo) this.grupo.get(_nome);

	}

	/**
	 * Sobreposição do método toString para retornar todo o conteúdo da coleção
	 * separando os elementos por espaços
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder("HashMap = ");
		Iterator i = this.grupo.keySet().iterator();
		while (i.hasNext())
			s.append((Amigo) this.grupo.get((String) i.next()) + " ");
		return s.toString();
	}
}
