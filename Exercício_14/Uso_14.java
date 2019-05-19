package Exercício_14;


import java.util.Scanner;

public class Uso_14 {
	private static Scanner scanner;

	public static void main (String args[]) throws Exception {

		int opcao;
		int celular,tamanho,i;
		String nome, email, endereco;
		double renda;

		System.out.println("Digite quantos cadastros devem ser feitos: ");
		scanner = new Scanner(System.in);
		tamanho = scanner.nextInt();

		Contato vetor[] = new Contato[tamanho];

		for(i=0; i < tamanho; i++) {

			System.out.println("\nEmail: " + (i+1) + "\n(1)Contatos, (2)Clientes: ");
			opcao = scanner.nextInt();

			try {
				switch(opcao) {
				case 1: 
					System.out.println("Digite o seu nome:  ");
					nome = scanner.next();
					System.out.println("Digite o seu email:  ");
					email = scanner.next();
					vetor[i] = new Contato(nome, email);
					break;
				case 2: 
					System.out.println("Digite o seu nome:  ");
					nome = scanner.next();
					System.out.println("Digite o seu email:  ");
					email = scanner.next();
					System.out.println("Digite o seu celular:  ");
					celular = scanner.nextInt();
					System.out.println("Digite o seu endereço:  ");
					endereco = scanner.next();
					System.out.println("Digite a sua renda:  ");
					renda = scanner.nextDouble();

					vetor[i] = new Cliente(nome, email, celular, endereco, renda);
					break;
				default:
					i--;
					continue;
				}
			}
			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}

		for(i=0; i < tamanho; i++) {
			System.out.println("\n" + vetor[i].toString());
		}
	}
}
