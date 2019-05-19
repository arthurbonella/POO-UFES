package Exercício_08;

import java.util.Scanner;

public class Uso_Conta {

	private static Scanner scanner;

	public static void main (String args[]) throws Exception{
		
		scanner = new Scanner(System.in);

		System.out.println("Digite o nome do Usuario 1: ");
		String nome1 = scanner.nextLine();
		System.out.println("Digite o saldo do Usuario 1: ");
		double saldo1 = scanner.nextDouble();
		Conta usuario1 = new Conta(nome1,saldo1);
		System.out.println("=======================\n"+usuario1+"=======================\n");
		System.out.println("Digite quantos meses o dinheiro ficou parado: ");
		int mes1 = scanner.nextInt();
		usuario1.acertoDeJuros(mes1);
		System.out.println(usuario1);


		System.out.println("Digite o nome do Usuario 2: ");
		String nome2 = scanner.next();
		System.out.println("Digite o saldo do Usuario 2: ");
		double saldo2 = scanner.nextDouble();
		Conta usuario2 = new Conta(nome2,saldo2);
		System.out.println("=======================\n"+usuario2+"=======================\n");
		System.out.println("Digite quantos meses o dinheiro ficou parado: ");
		int mes2 = scanner.nextInt();
		usuario2.acertoDeJuros(mes2);
		System.out.println(usuario2);




	}

	//Em seguida faça a correção do saldo de um dos dois correntistas (dê a opção de escolha para o usuário).COMO?
}
