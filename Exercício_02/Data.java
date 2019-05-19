package Exercício_02;

public class Data {

	//CAMPOS DO OBJETO

	private int dia,mes,ano;


	//CONSTRUTORES 

	//Data contendo somente o mês e ano
	public Data (int _mes,int _ano) throws Exception{this.setData (1,_mes,_ano);}

	//Data completa  no formato String “dd/mm/aaaa”.
	public Data (String _date) throws Exception{this.setData(_date);}

	//Data completa no formado int-string-int
	public Data (int _dia,String _mes,int _ano) throws Exception{this.setData(_dia, _mes, _ano);}

	//Data vazia
	public Data () throws Exception {this.setData (1,1,1900);}

	//Data normal
	public Data (int dia,int mes, int ano) throws Exception {this.setData (dia,mes,ano);}


	//SETS

	public void setDia(int dia) {this.dia = dia;}
	public void setMes(int mes) {this.mes = mes;}
	public void setAno(int ano) {this.ano = ano;}


	//GETS

	public int getDia(){return dia;}
	public int getMes(){return mes;}
	public int getAno(){return ano;}


	//METODOS

	//==================================================================================================================================================
	/*
	Metodo isBissexto entra com um ano e verifica se o mesmo é bissexto ou nao 
	Entrada:(int)|Ano|
	Saida:(boolean)|False->Nao bissexto|True->Bissexto|
	 */
	//==================================================================================================================================================
	public static boolean isBissexto(int _ano) {

		if (((_ano%4==0) && (_ano%100 != 0)) || ((_ano%400) == 0)) {
			return true;
		}
		else {
			return false;
		}

	}

	//==================================================================================================================================================
	/*
	Metodo isDataValida entra com uma data,verifica se é bissexto com isBissexto e retorna se é valida ou nao
	Entrada:(int,int,int)|Dia|Mes|Ano|
	Saida:(boolean)|False->Invalido|True->Valido|
	 */
	//==================================================================================================================================================

	public static boolean isDataValida(int _dia,int _mes,int _ano) {

		//Confere se é bissexto
		boolean bissexto = Data.isBissexto(_ano);

		//Se ano > 1582
		if(_ano >= 1582) {
			//Se bissexto
			if (bissexto == true) {
				if((_mes == 4 || _mes == 6 || _mes == 9 || _mes == 11) && (_dia >= 1 &_dia <= 30)) {
					bissexto = true;
					return bissexto;
				}
				if((_mes == 2) && (_dia >= 1 && _dia <= 29)) {
					bissexto = true;
					return bissexto;
				}
				if((_mes == 1 ||_mes == 3 || _mes == 5 || _mes == 7|| _mes == 8 || _mes == 10 || _mes == 12) && (_dia >= 1 &_dia <= 31)) {
					bissexto = true;
					return bissexto;
				}
				else {
					bissexto = false;
					return bissexto;
				}
			}
			else if (bissexto == false) {
				if((_mes == 4 || _mes == 6 || _mes == 9 || _mes == 11) && (_dia >= 1 &_dia <= 30)) {
					bissexto = true; 
					return bissexto;
				}
				if((_mes == 2) && (_dia >= 1 && _dia <= 28)) {
					bissexto = true;
					return bissexto;
				}
				if((_mes == 1 ||_mes == 3 || _mes == 5 || _mes == 7|| _mes == 8 || _mes == 10 || _mes == 12) && (_dia >= 1 &_dia <= 31)) {
					bissexto = true;
					return bissexto;
				}
				else {
					bissexto = false;
					return bissexto;
				}
			}
		}
		return false;
	}

	/*
	Metodos setData entra com uma data,verifica se a data é valida com isDataValida e retorna se é valida ou nao
	Entrada:(int,int,int)|Dia|Mes|Ano|
	Saida:(boolean)|False->Invalido|True->Valido|
	 */

	public void setData (int _dia,int _mes,int _ano) throws Exception {

		boolean validade = Data.isDataValida(_dia,_mes,_ano);

		if(validade == true) {

			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;

		}
		else{

			throw new Exception ("Data Inválida");

		}
	}

	//Vai ser sobrecarregado para o mes como string
	public void setData (int _dia,String _mes,int _ano) throws Exception {

		int mes = 0;//0 Dará data invalida

		if(_mes.compareToIgnoreCase( "janeiro" ) == 0) mes = 1;
		if(_mes.compareToIgnoreCase( "fevereiro" ) == 0) mes = 2;
		if(_mes.compareToIgnoreCase( "março" ) == 0) mes = 3;
		if(_mes.compareToIgnoreCase( "abril" ) == 0) mes = 4;
		if(_mes.compareToIgnoreCase( "maio" ) == 0) mes = 5;
		if(_mes.compareToIgnoreCase( "junho" ) == 0) mes = 6;
		if(_mes.compareToIgnoreCase( "julho" ) == 0) mes = 7;
		if(_mes.compareToIgnoreCase( "agosto" ) == 0) mes = 8;
		if(_mes.compareToIgnoreCase( "setembro" ) == 0) mes = 9;
		if(_mes.compareToIgnoreCase( "outubro" ) == 0) mes = 10;
		if(_mes.compareToIgnoreCase( "novembro" ) == 0) mes = 11;
		if(_mes.compareToIgnoreCase( "dezembro" ) == 0) mes = 12;


		//Descobre o mes e atribui na variavel mes

		this.setData(_dia,mes,_ano);

	}

	//
	public void setData (String data) throws Exception {

		int dia,mes,ano;

		dia = Integer.parseInt(data.substring(0,(data.indexOf("/"))));//Valor do dia
		mes = Integer.parseInt(data.substring(data.indexOf("/")+1,data.indexOf("/",(data.indexOf("/")+1))));
		ano = Integer.parseInt(data.substring(data.indexOf("/",(data.indexOf("/")+1))+1));

		this.setData(dia,mes,ano);
	}

	//Incrementa
	public void incrementa()throws Exception{

		try {
			this.setData(getDia()+1,getMes(),getAno());
		}
		catch (Exception dia) {
			try {
				this.setData(1,getMes()+1,getAno());
			}
			catch (Exception mes) {
				this.setData(1,1,getAno()+1);
			}

		}
	}


	//Incrementa SOBRECARREGADO
	public void incrementa(int incremento)throws Exception{

		int i;

		for(i=0;i<incremento;i++){

			this.incrementa();
		}
	}


	//Equals
	public boolean equals(Data objeto) {
		Data aux = objeto;
		if (this.getDia()== aux.getDia() &&
				this.getMes()== aux.getMes() &&
				this.getAno()== aux.getAno())
			return true;
		return false;
	}
	//verificaECriaData
	public static Data verificaECriaData (int dia,int mes,int ano) {

		try {
			return new Data (dia,mes,ano);
		}
		catch(Exception ErroData) {
			return null;
		}
	}


	//CompareTo

	public int compareTo(Data objeto) {

		if(this.ano == objeto.ano){

			if(this.mes == objeto.mes){

				if(this.dia == objeto.dia){

					return 0;
				}
				if(this.dia > objeto.dia){

					return 1;
				}

				else{

					return -1;
				}
			}

			if(this.mes > objeto.mes){

				return 1;
			}

			else {

				return -1;
			}

		}

		if(this.ano > objeto.ano){

			return 1;
		}

		else{

			return -1;
		}
	}


	/*Metodo to string para melhor representar na tela, a classe Data*/	

	public String toString(){
		StringBuilder dataStr = new StringBuilder();
		dataStr.append(this.getDia());
		dataStr.append("/");
		dataStr.append(this.getMes());
		dataStr.append("/");
		dataStr.append(this.getAno());
		return dataStr.toString();
	}
}

/*
 Seria útil uma versão sobrecarregada do isDataValida e do isAnoBissexto ambos sem argumentos?  Lembre-se que, neste caso, a data a ser verificada seria o próprio objeto que fez a chamada do método.
Não, pois para criarmos o objeto a data já deve ser valida.Ou seja,teriamos que averiguar se é válida antes mesmo de denominarmos os campos do objeto.
 */
