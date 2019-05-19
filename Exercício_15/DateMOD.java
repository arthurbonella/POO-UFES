package Exercício_15;

import java.util.Date;

public class DateMOD extends Date {
	
	/**
	 * Modificação Para Exercício 15 do Prof Henrique Cristovão
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("deprecation")
	public void setMonth(String _mes) {
		
		int mes = 0;

		if(_mes.compareToIgnoreCase( "janeiro" ) == 0) mes = 0;
		if(_mes.compareToIgnoreCase( "fevereiro" ) == 0) mes = 1;
		if(_mes.compareToIgnoreCase( "março" ) == 0) mes = 2;
		if(_mes.compareToIgnoreCase( "abril" ) == 0) mes = 3;
		if(_mes.compareToIgnoreCase( "maio" ) == 0) mes = 4;
		if(_mes.compareToIgnoreCase( "junho" ) == 0) mes = 5;
		if(_mes.compareToIgnoreCase( "julho" ) == 0) mes = 6;
		if(_mes.compareToIgnoreCase( "agosto" ) == 0) mes = 7;
		if(_mes.compareToIgnoreCase( "setembro" ) == 0) mes = 8;
		if(_mes.compareToIgnoreCase( "outubro" ) == 0) mes = 9;
		if(_mes.compareToIgnoreCase( "novembro" ) == 0) mes = 10;
		if(_mes.compareToIgnoreCase( "dezembro" ) == 0) mes = 11;

		super.setMonth(mes);
			
	}
	


	@SuppressWarnings("deprecation")
	public int getMonth() {
		return super.getMonth()+1;
	}
	
	public int retornaDiferençaDias(Date obj1,Date obj2) {
		
		long t1 = obj1.getTime();
		long t2 = obj2.getTime();
		
		if(t1>t2) {
			return (int) ((t1-t2)*(1/(24*60*60*1000)));
		}
		if(t1<t2) {
			return (int) ((t2-t1)*(1/(24*60*60*1000)));
		}
		
		else {
			return 0;
		}	
		
	}
	public Date incrementa(Date obj,int dias) {
		
		long tempoDias = dias*24*60*60*1000;
		
		return new Date(tempoDias + obj.getTime());
		
	}
	
}