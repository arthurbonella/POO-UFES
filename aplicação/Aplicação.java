package aplicação;

import matematica.ConstantesMatematicas;

public class Aplicação {
	
	public static void main(String Args[]) {
		/* Aplicação para conter uma classe de uso com main. No método main, demonstre o uso das constantes com um pequeno exemplo.
*/
		double raizde2 = ConstantesMatematicas.RAIZDE2;
		double raizde3 = ConstantesMatematicas.RAIZDE3;
		double raizde5 = ConstantesMatematicas.RAIZDE5;
		double raizde6 = ConstantesMatematicas.RAIZDE6;
		
		StringBuilder str = new StringBuilder();
		
		str.append("Raiz de 2:  ");
		str.append(raizde2);
		str.append(".\n");
		
		str.append("Raiz de 3:  ");
		str.append(raizde3);
		str.append(".\n");
		
		str.append("Raiz de 5:  ");
		str.append(raizde5);
		str.append(".\n");
		
		str.append("Raiz de 6:  ");
		str.append(raizde6);
		str.append(".\n");
		
		System.out.println(str.toString());
	}
}/*final public double RAIZDE2 = 1.41421356237309;
	final public double RAIZDE3 = 1.73205080756887;
	final public double RAIZDE5 = 2.23606797749978;
	final public double RAIZDE6 = RAIZDE2 * RAIZDE3;*/
