package Exercício_02;

public class Uso_Data {
	//throws tem que ser colocado em todos os metodos, inclusive na main
	public static void main (String args[]) throws Exception{



		//TESTE DATA
		Data x =new Data("31/10/1997");
		boolean verif;
		System.out.println("Data = "+x+"\n==============================================");
		x.setData(29, 02, 2008);//Valido
		System.out.println("Data = "+x+"\n==============================================");
		x.setData(30, 02, 2008);//Invalido
		//System.out.println("Data = "+x+"\n==============================================");
		x.setData(29, 02, 2009);//Invalido
		//System.out.println("Data = "+x+"\n==============================================");
		x.setData(31, 04, 2009);//Invalido
		//System.out.println("Data = "+x+"\n==============================================");
		x.setData(31, 03, 2009);//Valido
		//System.out.println("Data = "+x+"\n==============================================");
		x.setData(32, 12, 2009);//Invalido
		//System.out.println("Data = "+x+"\n==============================================");
		x.setData(31, 13, 2009);//Invalido
		//System.out.println("Data = "+x+"\n==============================================");
		x.setData(31, 12, 1581);//Invalido
		//System.out.println("Data = "+x+"\n==============================================");	
		x.setData(31, "dezembro", 1581);//Invalido
		x.toString();
		//System.out.println("Data = "+x+"\n==============================================");	
		x.setData(31, "março", 2009);//Valido
		System.out.println("Data = "+x+"\n==============================================");
		//System.out.println("Data = "+x+"\n==============================================");

		Data y =new Data(31,"março",2009);
		//Tostring2.0
		System.out.println("Data = "+y+"\n==============================================");
		//System.out.println("Data = "+y+"\n==============================================");

		//Testar se sao iguais
		verif = x.equals(y);
		if(verif == true)System.out.println(verif);//aqui
		if(verif ==false)System.out.println(verif);
		//Teste com datas diferentes se sao iguais
		x.setData(31, "dezembro", 1581);//1/1/1900
		verif = x.equals(y);
		if(verif == true)System.out.println(verif);
		if(verif ==false)System.out.println(verif);//aqui
		//Teste com data em strin
		x.setData("31/10/1997");
		System.out.println("Data = "+x+"\n==============================================");
		x.setData("11/10/1997");
		System.out.println("Data = "+x+"\n==============================================");
		x.setData("27/19/1997");
		x.toString();
	}
}