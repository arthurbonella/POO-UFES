package Exercício_12;

import java.util.Scanner;

public class Uso_Exe12 {

	private static Scanner scanner;

	public static void main(String args[]) throws Exception {
		final int QTDE = 50;

		// vetor capaz de armazenar QTDE objetos de Funcionario, Chefe ou Diretor
		Funcionario vetor[] = new Funcionario[QTDE];

		// variaveis auxiliares e temporarias
		String nome, identidade, dtNascStr, dtAdmStr, depto, dtPromoStr;
		double salario;
		int opcao;

		scanner = new Scanner(System.in);
		for(int i=0; i < QTDE; i++) {
			System.out.println("\nCadastro: " + (i+1) + "\n(1)Funcionario, (2)Chefe, (3)Diretor: ");
			opcao = scanner.nextInt();

			try {
				switch(opcao) {
				case 1: 
					System.out.println("Nome: ");
					nome = scanner.next();
					System.out.println("Identidade: ");
					identidade = scanner.next();
					System.out.println("Data nascimento (dd/mm/aaaa): ");
					dtNascStr = scanner.next();
					System.out.println("Data admissao: ");
					dtAdmStr = scanner.next();
					System.out.println("Salario: ");
					salario = scanner.nextDouble();
					vetor[i] = new Funcionario(nome, identidade, dtNascStr, dtAdmStr, salario);
					break;
				case 2: 
					System.out.println("Nome: ");
					nome = scanner.next();
					System.out.println("Identidade: ");
					identidade = scanner.next();
					System.out.println("Data nascimento (dd/mm/aaaa): ");
					dtNascStr = scanner.next();
					System.out.println("Data admissao: ");
					dtAdmStr = scanner.next();
					System.out.println("Salario: ");
					salario = scanner.nextDouble();
					System.out.println("Departamento: ");
					depto = scanner.next();
					vetor[i] = new Chefe(nome, identidade, dtNascStr, dtAdmStr, salario, depto);
					break;
				case 3: 
					System.out.println("Nome: ");
					nome = scanner.next();
					System.out.println("Identidade: ");
					identidade = scanner.next();
					System.out.println("Data nascimento (dd/mm/aaaa): ");
					dtNascStr = scanner.next();
					System.out.println("Data admissao: ");
					dtAdmStr = scanner.next();
					System.out.println("Salario: ");
					salario = scanner.nextDouble();
					System.out.println("Departamento: ");
					depto = scanner.next();
					System.out.println("Data promocao: ");
					dtPromoStr = scanner.next();
					vetor[i] = new Diretor(nome, identidade, dtNascStr, dtAdmStr, salario, depto, dtPromoStr);
					break;
				default:
					i--;
					continue;
				}
			}
			// se houver algum erro nas datas, solicita repetir a entrada atual
			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}
		System.out.println("\nTaxa de reajuste: ");
		double taxa = scanner.nextDouble();

		// chamada polimorfica do metodo reajusta 
		for(int i=0; i < QTDE; i++) {
			vetor[i].reajusta(taxa);
		}

		// chamada polimorfica do metodo toString e do metodo calculaMaxEmprestimo
		for(int i=0; i < QTDE; i++) {
			System.out.println("\n" + vetor[i].toString());
			System.out.println("Max emprestimo: " + vetor[i].calculaMaxEmprestimo());
		}
	}
}
