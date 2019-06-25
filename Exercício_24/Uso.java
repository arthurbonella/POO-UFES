package Exerc�cio_24;

import java.io.BufferedWriter;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.io.IOException;

import Exerc�cio_02.Data;



/**

 * Exemplo de:

 * 1. Uso da calsse ConjuntoSorteio. Que vai gerar, a partir de um sorteio, uma certa quantidade de valores (definido pelo usuario)

 * e vai gerar tambem uma certa quantidade de sorteios (tambem definido pelo usuario), com uma respectiva data para cada sorteio.

 * 2. Serializa��o de objetos

 *

 *<p>

 *Vale ressaltar que foram utilizados as colecoes:

 *        LinkedList - Agrupar numeros dos sorteios

 *        TreeSet - Organizar numreos.

 *<p>

 *As classes foram encapsuladas afim de melhorar a legilibidade e manutencao do codigo

 *<p>

 *O resultado eh depois gravado em um arquivo de texto no disco atraves da serializacao

 *

 * @author Arthur B. V.

 *

 */



public class Uso {



	public static void main(String[] args) throws Exception{


		try {


			
			ConjuntoSorteio testeCompleto = new ConjuntoSorteio();

			testeCompleto.insere(31,10,1997,10,10,50,6);
			testeCompleto.insere(new Data(25,10,1998),2,10,50,6);

			System.out.println(testeCompleto);

			Arquivo.grava("arquivo.txt", testeCompleto);
		

			ConjuntoSorteio testeLeitura;

			testeLeitura = (ConjuntoSorteio) Arquivo.le("arquivo.my");

			System.out.println("Dados lidos do arquivo:\n"+ testeLeitura.toString());

			
			BufferedWriter arqSaida;

			arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));

			// O m�todo write grava a string no arquivo texto.

			// Deve ser chamado para cada objeto, com o seu respectivo toString().

			// Normalmente aparece dentro de um la�o que percorre toda cole��o

			// que cont�m os objetos que ser�o gravados.

			// O "\r\n" � necess�rio para colocar os objetos um em cada linha

			// (o WordPad, Word, InternetExplorer tamb�m aceitam "\n" ou "\r", mas

			// O Bloco de Notas, por exemplo, s� aceita "\r\n")

			arqSaida.write(testeCompleto.toString()+"\r\n");

			arqSaida.close();


		} catch(FileNotFoundException e) {

			System.out.println("Arquivo n�o encontrado");

		}

		catch(IOException e) {

			System.out.println("Problemas na leitura ou grava��o do arquivo");

		}

		catch(ClassNotFoundException e) {

			System.out.println("Classe inexistente usada na convers�o");

		}
	}
}
