package Exemplo_24;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as coleções
 * LinkedList, TreeSet e HashMap
 * <p>
 * Implementa a interface Comparable, pois implementa o método
 * compareTo que é usado na coleção TreeSet. Também poderia ser usado
 * pelo método sort (com um argumento) da classe Collections
 * <p>
 * Implementa a interface Serializable, para permitir que as suas instâncias possam
 * ser usadas numa serialização (por exemplo, gravação em disco)
 * 
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 */
public class Amigo implements Comparable<Amigo>, Serializable {
	/** nome do amigo */
	private String nome;

	/** telefone do amigo */
	private String telefone;

	/** idade do amigo */
	private int idade;

	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _nome nome do amigo
	 * @param _telefone telefone do amigo
	 * @param _idade idade do amigo
	 */
	public Amigo(String _nome, String _telefone, int _idade) {
		this.nome = _nome;
		this.telefone = _telefone;
		this.idade = _idade;
	}

	/**
	 * construtor para inicializar somente o nome
	 *
	 * @param _nome nome do amigo
	 */
	public Amigo(String _nome) {
		this(_nome, "", 0);
	}

	/**
	 * pega o nome
	 * 
	 * @return nome
	 */
	public String getNome() {
		return this.nome;
	}
	/**
	 * pega o telefone
	 * 
	 * @return telefone
	 */
	public String getTelefone() {
		return this.telefone;
	}
	/**
	 * pega a idade
	 * 
	 * @return idade
	 */
	public int getIdade() {
		return this.idade;
	}
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores dos campos
	 */
	public String toString() {
		StringBuilder retorno = new StringBuilder(this.getNome());
		retorno.append(";");
		retorno.append(this.getTelefone());
		retorno.append(";");
		retorno.append(this.getIdade());
		return retorno.toString();
	}

	/**
	 * Método necessário para a classe TreeSet, pois ela tem que verificar se há
	 * elementnos repetidos no conjunto através do critério determinado por
	 * compareTo, além disso, fornece um algoritmo compararar elementos na busca
	 * feita com o método contains
	 * 
	 * @return inteiro, 1 se maior, -1 se menor ou 0 se igual
	 */
	public int compareTo(Amigo obj) {
		return this.nome.compareTo(obj.nome);
	}

	/**
	 * Este é método é necessário ser colocao numa classe sempre que acontecer
	 * buscas realizadas em HashMap quando a chave é um objeto desta classe
	 * <p>
	 * Neste caso será usado o código hash da concatenação dos campos
	 * Para que este método seja útil será necessário procurar por um
	 * objeto amigo completo numa HashMap que foi construída desta forma
	 * <p>
	 * Normalmente as classes fornecidas pelo Java já possuem hashCode.
	 * 
	 * @return inteiro para ser usado como código hash
	 */
	public int hashCode() {
		return (this.nome+this.telefone+this.idade).hashCode();
	}


}


/**
 * Fornece um método para ser usado na ordenação de várias instâncias da classe
 * Amigo pelo nome.
 * <p>
 * Esta ordenação é realizada pelo método estático sort da classe Collections
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 *
 */
class ComparaPorNome implements Comparator<Amigo> {
  	public int compare(Amigo amigo1, Amigo amigo2) {
        	return amigo1.getNome().compareToIgnoreCase(amigo2.getNome());
  	}
}
 
/**
 * Fornece um método para ser usado na ordenação de várias instâncias da classe
 * Amigo pela idade.
 * <p>
 * Esta ordenação é realizada pelo método estático sort da classe Collections
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 */
class ComparaPorIdade implements Comparator<Amigo> {
  	public int compare(Amigo amigo1, Amigo amigo2) {
        	int idade1 = amigo1.getIdade();
        	int idade2 = amigo2.getIdade();
        	if (idade1 > idade2)
              	return 1;
        	else if (idade1 < idade2)
              	return -1;
        	else
              	return 0;
  	}
}



