package Exercício_09;


public class Uso_Ponto {
	public static void main (String args[]) throws Exception {
		//TESTE PONTO

		Ponto p = new Ponto();//Set Default
		//LIMITES DAFAULT
		System.out.println("+++++++++++LIMITES DAFULT+++++++++++\n");
		p.setPonto(1,2);
		System.out.println("Ponto"+p+"\n==============================================");
		Ponto x = new Ponto("(31.31,10)");
		System.out.println(x);
		System.out.println("Ponto"+p+"\n==============================================");
		
		//Se n tem objeto chamar ponto
		Ponto p2;
		
		
		p2 = p.criaSwap();
		System.out.println("PontoP2"+p2+"\n==============================================");
		
		p.setX(4);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setY(499);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setPonto(501,501);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setPonto(10,10);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setPonto(-1,-1);
		System.out.println("Ponto"+p+"\n==============================================");
		//MUDANDO LIMITES PRA -1,600
		
		Ponto.setLimites(-10,600);
		System.out.println("\n\n\n+++++++++++LIMITES NOVOS+++++++++++\n");
		p.setPonto(1,2);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setX(4);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setY(499);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setPonto(501,501);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setPonto(10,10);
		System.out.println("Ponto"+p+"\n==============================================");
		p.setPonto(-1,-1);
		System.out.println("Ponto"+p+"\n==============================================");
		
		//Crie uma classe de uso para receber um ponto do usuário e gerar outros 100 pontos de forma aleatória exibindo para cada um a distância entre ele e o primeiro ponto informado.
	}

}
