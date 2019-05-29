package Exercício_23;

import java.util.*;

public class Uso {

	private static Scanner scanner;
	private static Random random;

	public static void main(String[] args) throws Exception {

		int i;
		int aux;
		

		random = new Random();
		scanner = new Scanner(System.in);
		

		System.out.println("Digite o texto, sem pontuação: ");
		String texto = scanner.nextLine();
		String[] palavras = texto.split(" ");
		

		System.out.println("Digite os nomes, separados por espaço: ");
		String nomes = scanner.nextLine();
		String[] vetorNome = nomes.split(" ");
		
		//TreeMap Insere Ordenado
		Set<String> palavraOrd = new TreeSet<String>();
		Map<String,Integer> freqPalavra = new HashMap<String,Integer>();
		List<String> txtDesord = new LinkedList<String>();
		Set<Integer> numOrd = new TreeSet<Integer>();
		//TreeMap Insere Ordenando
		Map<String,Integer> nomesOrd = new TreeMap<String,Integer>();
		
		

		//=================================================================================================
		//EXERCICIO A
		//================================================================================================= 

		for(i=0; i<palavras.length; i++) {

			palavraOrd.add(palavras[i]);
		}

		System.out.print("\nPalavras Ordenadas           : "+palavraOrd+"\n");


		//=================================================================================================
		//EXERCICIO B
		//=================================================================================================

		for(i=0; i<palavras.length; i++) {

			if(freqPalavra.containsKey(palavras[i])) {

				aux = freqPalavra.get(palavras[i]);
				freqPalavra.put(palavras[i], aux + 1);
			}
			else {

				freqPalavra.put(palavras[i], 1);
			}

		}	

		//=================================================================================================
		//EXERCICIO C
		//=================================================================================================

		for(i=0; i<palavras.length; i++) {

			txtDesord.add(palavras[i]);
		}

		Collections.shuffle(txtDesord);

		System.out.print("\nTexto Desordenado            : "+txtDesord+"\n");


		//=================================================================================================
		//EXERCICIO D
		//=================================================================================================		

		for(i=0; i<20; i++) {

			aux = (random.nextInt(49) + 1);

			if(numOrd.contains(aux)==false) {

				numOrd.add(aux);
			}
			else {

				i--;
			}

		}

		//=================================================================================================
		//EXERCICIO E
		//=================================================================================================

		aux = 0;

		for(i=0; i<vetorNome.length; i++) {

			if(nomesOrd.containsKey(vetorNome[i])) {

				aux = nomesOrd.get(vetorNome[i]);
				nomesOrd.put(vetorNome[i], aux + 1);
			}

			else {

				nomesOrd.put(vetorNome[i], 1);
			}

		}	

		System.out.print("\nNomes Ordenados              : "+nomesOrd);
	}
}	