package Tempo;

/**
 * Classse horário que representa um horario em horas e minutos
 *  
 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
 */

public class Horario {
	/**Horas e Minutos*/
	private int horas,minutos;
	/**Cosntrutor com dois parametro de horas e minutos
	 * @param _horas representa as horas
	 * @param _minutos representa os minutos
	 * */
	public Horario (int _horas,int _minutos) throws Exception {
		this.setHorario(_horas, _minutos);
	}
	/**Construtor vazio*/
	public Horario () {
		this.horas = 0;
		this.minutos = 0;
	}

	/**Metodo que modifica o valor do campo horas
	 * @param _horas
	 * */
	public void setHoras(int _horas){
		this.horas=_horas;
	}
	/**Metodo que modifica o valor do campo minutos
	 * @param _minutos
	 * */
	public void setMinutos(int _minutos) {
		this.minutos = _minutos;
	}
	/**Metodo que retorna o valor do campo horas
	 * @return horas
	 * */
	public int getHoras() {
		return this.horas;
	}
	/**Metodo que retorna o valor do campo minutos
	 * @return minutos
	 * */
	public int getMinutos() {
		return this.minutos;
	}
	/**Metodo que modifica os horarios e checa se o horario está correto no padrão de 24hrs
	 * @param _horas representa horas
	 * @param _minutos representa minutos
	 * */
	public void setHorario (int _horas,int _minutos)throws Exception{

		if (_horas < 24 && _horas>=0 && _minutos < 60 && _minutos>=0) {
			this.setHoras(_horas);
			this.setMinutos(_minutos);
		}
		else {
			throw new Exception ("Horario Fora do Padrão");
		}
	}
	/**Metodo que comprara dois objetos retornando qual é maior, menor ou se sao iguais
	 * @param objeto objeto a ser comparado
	 * @return -1,0,1, para menor, igual e maior respectivamente
	 * */
	public int compareTo(Horario objeto) {

		if (this.getHoras() == objeto.getHoras()) {

			if (this.getMinutos() == objeto.getMinutos()) {
				return 0;
			}
			if (this.getMinutos() < objeto.getMinutos()) {
				return -1;
			}

			else{
				return 1;
			}
		}
		if (this.getHoras() < objeto.getHoras()) {
			return -1;
		}
		else{
			return 1;
		}
	}
	/**Metodo que comprara dois objetos retornando se são iguais por meio de um boolean
	 * @param objeto objeto a ser comparado
	 * @return true para igual e false para diferente
	 * */
	public boolean equals (Horario objeto) {

		if (this.getHoras() == objeto.getHoras()) {

			if (this.getMinutos() == objeto.getMinutos()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	/**
	 * Método toString sobreposto para informar todas as informações do objeto
	 * @return String com todos os dados
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(this.getHoras());
		str.append(":");
		str.append(this.getMinutos());

		return str.toString();
	}


}


