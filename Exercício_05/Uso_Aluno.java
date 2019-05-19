package Exercício_05;


public class Uso_Aluno {
	
	public static void main (String args[]) throws Exception{

		System.out.println(Aluno.getLimite());
		Aluno.setLimite(20);
		System.out.println(Aluno.getLimite());

	}
}
