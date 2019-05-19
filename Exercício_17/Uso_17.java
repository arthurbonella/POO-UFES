package Exercício_17;


import java.util.Scanner;

public class Uso_17 {

	private static Scanner s;

	public static void main(String args[]) throws Exception{

		try {		
			
			Quadrado r;
			s = new Scanner(System.in);
			int op;
			System.out.println("1 - Quadrado\n2 - Retangulo");
			op = s.nextInt();
			
			switch(op) {
			
			case 1:
				
				r = new Quadrado(3,2,3,3,1,false);
				System.out.println("Area do quadrado: "+r.area());
				break;
			
			case 2: 
				
				r = new Retangulo(3,2,3,4,1,false);
				System.out.println("Area do retangulo: "+r.area());
				break;
				
			default:
			}
		}

		catch(Exception e) {
			System.out.println("Erro");
		}
	}
}
