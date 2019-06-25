package Tempo;

/**
 *Classe Data que tem como campos caracterizados po representarem uma data com dia,mes e ano
 *
 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
 */

public class Data {

	/**Dia mes e ano*/
	private int dia,mes,ano;

	/**Construtor só com mes e ano
	 * @param _mes representa mes
	 * @param _ano representa ano*/
	public Data (int _mes,int _ano) throws Exception{this.setData (1,_mes,_ano);}
	/**Construtor só com string
	 * @param _date representa a data*/
	public Data (String _date) throws Exception{this.setData(_date);}
	/**Construtor só com mes em forma de strin e dia e ano em forma de int
	 * @param _dia representa dia
	 * @param _mes representa mes
	 * @param _ano representa ano
	 * */
	public Data (int _dia,String _mes,int _ano) throws Exception{this.setData(_dia, _mes, _ano);}
	/**Construtor vazio
	 *Constroi objeto com valores padrões 1,1,1900	 * 
	 **/
	public Data () throws Exception {this.setData (1,1,1900);}
	/**Construtor padrão
	 * @param dia representa dia
	 * @param mes representa mes
	 * @param ano representa ano
	 * */
	public Data (int dia,int mes, int ano) throws Exception {this.setData (dia,mes,ano);}

	/**
	 * Modifica o valor de dia
	 * @param dia*/
	public void setDia(int dia) {this.dia = dia;}
	/**
	 * Modifica o valor de mes
	 * @param dia*/
	public void setMes(int mes) {this.mes = mes;}
	/**
	 * Modifica o valor de ano
	 * @param ano*/
	public void setAno(int ano) {this.ano = ano;}



	/**
	 * Pega o valor do dia
	 * @return dia*/
	public int getDia(){return dia;}
	/**
	 * Pega o valor do mes
	 * @return mes*/
	public int getMes(){return mes;}
	/**
	 * Pega o valor do ano
	 * @return ano*/
	public int getAno(){return ano;}

	/**Confere se o ano é bissextop
	 * @param _ano representa ano
	 * @return bool true se for bissexto e false se for bissexto
	 * */

	public static boolean isBissexto(int _ano) {

		if (((_ano%4==0) && (_ano%100 != 0)) || ((_ano%400) == 0)) {
			return true;
		}
		else {
			return false;
		}

	}
	/**Confere se a data é valida, a partir de dia,mes e ano
	 * @param dia representa dia
	 * @param mes representa mes
	 * @param ano representa ano
	 * @return bool true se for valido e false se for invalido
	 * */
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
	/**
	 * 
	 * Metodo que recebe 3 parametros int, que representa dia,mes,ano
	 * @param mes String representa o mes
	 * @param dia representa o dia
	 * @param ano representa o ano	
	 * @throws Exception Tratamento de erro para verificar se a data é valida
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

	/**
	 * 
	 * Metodo que recebe uma string para o mes, ao inves de int compara com a base, transforma em int e "seta"
	 * @param mes String representa o mes
	 * @param dia representa o dia
	 * @param ano representa o ano	
	 * @throws Exception Tratamento de erro para verificar se a data é valida
	 */
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




		this.setData(_dia,mes,_ano);

	}
	/**
	 * 
	 * Metodo que recebe uma string, localiza os dados de dia, mes e ano, e transoforma em int
	 * @param data String que representa a data
	 * @throws Exception Tratamento de erro para verificar se a data é valida
	 */

	public void setData (String data) throws Exception {

		int dia,mes,ano;

		dia = Integer.parseInt(data.substring(0,(data.indexOf("/"))));//Valor do dia
		mes = Integer.parseInt(data.substring(data.indexOf("/")+1,data.indexOf("/",(data.indexOf("/")+1))));
		ano = Integer.parseInt(data.substring(data.indexOf("/",(data.indexOf("/")+1))+1));

		this.setData(dia,mes,ano);
	}
	/**
	 * Metodo que incrementa um dia na data desejada
	 * 
	 * */

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

	/**Metodo sobrecarregado de incrementa que incrementa "n" vezes, de acordo com a entrada
	 * @param incremento - numero de incrementos
	 * */

	public void incrementa(int incremento)throws Exception{

		int i;

		for(i=0;i<incremento;i++){

			this.incrementa();
		}
	}
	/**
	 * Método que vai comparar duas datas
	 * @param objeto objeto a ser comparado
	 * @return boolean, true para se for igual false para se for diferente
	 */	
	public boolean equals(Data objeto) {
		Data aux = objeto;
		if (this.getDia()== aux.getDia() &&
				this.getMes()== aux.getMes() &&
				this.getAno()== aux.getAno())
			return true;
		return false;
	}
	/**
	 * Metodo que verifica as entradas e ve se pé possivel criar o objeto "data"
	 * @param dia representa dia
	 * @param mes representa mes
	 * @param ano representa ano
	 * 
	 * @return data
	 * */
	public static Data verificaECriaData (int dia,int mes,int ano) {

		try {
			return new Data (dia,mes,ano);
		}
		catch(Exception ErroData) {
			return null;
		}
	}

	/**
	 * Método que vai comparar duas datas
	 * @param objeto objeto a ser comparado
	 * @return -1,0,1 Se a primeira data for menor,igual ou maior que a segunda,respectivamente
	 */
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

	/**
	 * Método toString para informar todas as informações do objeto
	 * @return String com todos os dados
	 */

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

