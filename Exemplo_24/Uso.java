package Exemplo_24;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeSet;

/**
 * Exemplo de:
 * 1. uso das coleções: LinkedList, TreeSet e HashMap
 * 2. uso de tipificação em coleções (Classes Genéricas)
 * 3. serialização de objetos
 * 4. classes wrapper
 * <p>
 * <b> Coleções usadas: </b>
 * <p>
 * <b> LinkedList </b> - aceita elementos repetidos; permite acesso aleatório do
 * n-esimo elemento; apesar de percorrer sequencialmente a lista (da frente para trás
 * ou vice-versa, dependendo do que for mais próximo);
 * mantém a mesma ordem da inserção; para usar uma pesquisa binária (muito mais rápida que a linear), 
 * com o método estático Collections.binarySearch(lista), os elementos deverão estar ordenados.

 * <p>
 * <b> TreeSet </b> - não aceita elementos repetidos; mantém os elementos
 * ordenados a cada inserção, possui busca rápida; é ruim para acessar os
 * elementos sequencialmente
 * <p>
 * <b> HashMap </b> - bom para casos onde o importante é acessar um elemento a
 * partir de uma chave; não aceita repetição da chave de busca mas permite que o
 * elemento seja repetido; é ruim para acessar os elementos sequencialmente
 * <p>
 * Estas classes de coleções foram encapsuladas em outras classes para facilitar o seu uso
 * <p>
 * Os objetos são depois gravados em disco através da serialização.
 * <p>
 * Tipos primitivos só podem ser inseridos em coleções por intermédio de
 * classes wrapper (em versões mais recente do Java é possível inserir tipos primitivos)
 * 
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 *
 */
public class Uso {
	public static void main(String[] args) {
		try {
			// ------------------------------------------------------------
			// teste 1: LinkedList
			ColecaoAmigosLinkedList amigos1 = new ColecaoAmigosLinkedList();
			amigos1.insere("Tia", "3232-2222", 23);
			amigos1.insere("Bia", "2232-2223",  13);
			amigos1.insere("Maria", "2121-2224",  53);
			amigos1.insere("Luzia", "3333-2225",  43);
			amigos1.insere("Maria", "3223-2226",  53);
			System.out.println("\nLista não ordenada:\n"+amigos1);
			amigos1.ordenaPorNome();
			System.out.println("Lista ordenada por nome:\n"+amigos1.toString());
			System.out.println("Resultado da busca por Maria: "+amigos1.busca("Maria"));

			Arquivo.grava("amigos1.my",amigos1);
			ColecaoAmigosLinkedList amigos1b;
			amigos1b = (ColecaoAmigosLinkedList)Arquivo.le("amigos1.my");
			System.out.println("Dados lidos do arquivo:\n"+amigos1b.toString());

			// ------------------------------------------------------------
			// teste 2: TreeSet
			// só funciona se colocar Strings dentro do TreeSet
			ColecaoAmigosTreeSet amigos2 = new ColecaoAmigosTreeSet();
			amigos2.insere("Tia", "3232-2222", 23);
			amigos2.insere("Bia", "2232-2223",  13);
			amigos2.insere("Maria", "2121-2224",  53);
			amigos2.insere("Luzia", "3333-2225",  43);
			amigos2.insere("Maria", "3223-2226",  53);
			System.out.println("\nConteúdo do conjunto (sem repetição):\n"+amigos2.toString());
			System.out.println("Resultado da busca por Maria: "+amigos2.existe("Maria"));

			Arquivo.grava("amigos2.my",amigos2);
			ColecaoAmigosTreeSet amigos2b;
			amigos2b = (ColecaoAmigosTreeSet)Arquivo.le("amigos2.my");
			System.out.println("Dados lidos do arquivo:\n"+amigos2b.toString());

			// ------------------------------------------------------------
			// teste 3: HashMap
			ColecaoAmigosHashMap amigos3 = new ColecaoAmigosHashMap();
			amigos3.insere("Tia", "3232-2222", 23);
			amigos3.insere("Bia", "2232-2223",  13);
			amigos3.insere("Maria", "2121-2224",  53);
			amigos3.insere("Luzia", "3333-2225",  43);
			amigos3.insere("Maria", "3223-2226",  53);
			System.out.println("\nConteúdo do mapa (sem repetição):\n"+amigos3.toString());
			System.out.println("Resultado da busca por Maria: "+amigos3.busca("Maria"));

			Arquivo.grava("amigos3.my",amigos3);
			ColecaoAmigosHashMap amigos3b;
			amigos3b = (ColecaoAmigosHashMap)Arquivo.le("amigos3.my");
			System.out.println("Dados lidos do arquivo:\n"+amigos3b.toString());

			// ------------------------------------------------------------
			// teste 4: inteiros primitivos
			// sorteia 20 números de 1 a 50, armazena num TreeSet (sem repetição:
			// é possível que sejam armazenados menos do que 20 números),
			// grava em disco,
			// lê do disco e exibe
			TreeSet<Integer> conjuntoInteiros = new TreeSet<Integer>();
			int sorteado;
			for(int i = 0; i < 20; i++) {
				sorteado = (int)(Math.random()*50) + 1;
				// empacota o int (primitivo) num objeto Integer para poder inserir na coleção
				conjuntoInteiros.add(new Integer(sorteado));
			}
			System.out.println("\nConteúdo do conjunto (sem repetição e ordenado):\n"+conjuntoInteiros.toString());
			System.out.println("Resultado da busca do número 25: "+conjuntoInteiros.contains(new Integer(25)));

			Arquivo.grava("conjunto.my",conjuntoInteiros);
			TreeSet<Integer> conjuntoInteiros2;
			conjuntoInteiros2 = (TreeSet<Integer>)Arquivo.le("conjunto.my");
			System.out.println("Dados lidos do arquivo:\n"+conjuntoInteiros2.toString());

		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivpo não encontrado");
		}
		catch(IOException e) {
			System.out.println("Problemas na leitura ou gravação do arquivo");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Classe inexistente usada na conversão");
		}
	}
}
