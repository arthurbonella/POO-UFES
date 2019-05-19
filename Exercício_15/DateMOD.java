package Exerc�cio_15;

import java.util.Date;

public class DateMOD extends Date {

	/**
	 * Modifica��o da Classe Date de java.util
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("deprecation")
	public void setMonth(String _mes) {
		
		int mes = 0;

		if(_mes.compareToIgnoreCase( "janeiro" ) == 0) mes = 0;
		if(_mes.compareToIgnoreCase( "fevereiro" ) == 0) mes = 1;
		if(_mes.compareToIgnoreCase( "mar�o" ) == 0) mes = 2;
		if(_mes.compareToIgnoreCase( "abril" ) == 0) mes = 3;
		if(_mes.compareToIgnoreCase( "maio" ) == 0) mes = 4;
		if(_mes.compareToIgnoreCase( "junho" ) == 0) mes = 5;
		if(_mes.compareToIgnoreCase( "julho" ) == 0) mes = 6;
		if(_mes.compareToIgnoreCase( "agosto" ) == 0) mes = 7;
		if(_mes.compareToIgnoreCase( "setembro" ) == 0) mes = 8;
		if(_mes.compareToIgnoreCase( "outubro" ) == 0) mes = 9;
		if(_mes.compareToIgnoreCase( "novembro" ) == 0) mes = 10;
		if(_mes.compareToIgnoreCase( "dezembro" ) == 0) mes = 11;

		this.setMonth(mes);
			
	}
	


	@SuppressWarnings("deprecation")
	public int getMonth() {
		return super.getMonth()+1;
	}
	
	
	/*
	iii)  Acrescente uma funcionalidade para retornar a quantidade de dias entre duas datas. Repita o m�todo em v�rios sobrecarregamentos para oferecer ao usu�rio diferentes formas de utiliza��o (qtde de argumentos e tipos variados). 
	Lembre-se de usar o modificador static quando achar conveniente.
	Dica: use o m�todo getTime para retornar o tempo em milisegundos de uma data. Em seguida subtraia da outra data tamb�m transformada em milisegundos. Basta, agora, dividir o resultado por 1000, 60, e 24 para converter milisegundos em dias. 

	iv) Usando a dica do item anterior fa�a um m�todo para permitir o incremento de uma quantidade de dias numa determinada data.
	Dica extra: existe um construtor da classe Date que recebe uma quantidade de milisegundos como argumento.
*/
	
}
/*
15)  A classe Date fornecida pela API da Java representa uma data do calend�rio. Ela possui alguns inconvenientes, como o n�mero do m�s representado de 0 a 11 entre outros.  Com intuito de melhor�-la, crie a classe Data que herda da classe Date (pertencente ao pacote java.util do Java) com as seguintes altera��es/extens�es: 
(Dica: consulte a classe Date na API do Java - https://docs.oracle.com/javase/8/docs/api/).

iii)  Acrescente uma funcionalidade para retornar a quantidade de dias entre duas datas. Repita o m�todo em v�rios sobrecarregamentos para oferecer ao usu�rio diferentes formas de utiliza��o (qtde de argumentos e tipos variados). 
Lembre-se de usar o modificador static quando achar conveniente.
Dica: use o m�todo getTime para retornar o tempo em milisegundos de uma data. Em seguida subtraia da outra data tamb�m transformada em milisegundos. Basta, agora, dividir o resultado por 1000, 60, e 24 para converter milisegundos em dias. 

iv) Usando a dica do item anterior fa�a um m�todo para permitir o incremento de uma quantidade de dias numa determinada data.
Dica extra: existe um construtor da classe Date que recebe uma quantidade de milisegundos como argumento.

Obs.: alguns m�todos aparecer�o com formata��o tachado no Eclipse pois s�o considerados obsoletos. Isto � decorrente da nova classe Calendar que substitui a Date.
public Date(long date)
 */