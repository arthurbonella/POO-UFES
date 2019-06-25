package Tempo;
/**
 * Classe período que representa um intervalo de tempo ,com data de inicio/fim e data de inicio/fim
 * 
 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
 */

public class Periodo {
	/**Campos representando Hora de inicio, fim e data de inicio e fim*/
	Horario horaInicio,horaFim;
	Data dataInicio,dataFim;
	/**Cosntrutor com 10 parametros representando os dias e minutos de cada momento do periodo
	 * @param _diaInicio
	 * @param _mesInicio
	 * @param _anoInicio
	 * @param _horasInicio
	 * @param _minutosInicio
	 * @param _diaFim
	 * @param _mesFim
	 * @param _anoFim
	 * @param _horasFim
	 * @param _minutosFim
	 * */
	public Periodo (int _diaInicio,int _mesInicio,int _anoInicio,int _horasInicio,int _minutosInicio,int _diaFim,int _mesFim,int _anoFim,int _horasFim,int _minutosFim) throws Exception{
		this.setHorarios(new Horario(_horasInicio,_minutosInicio),new Horario(_horasFim,_minutosFim));
		this.setDatas(new Data(_diaInicio,_mesInicio,_anoInicio),new Data(_diaFim,_mesFim,_anoFim));
	}
	/**Construtor com 4 parametros 
	 * @param _data_inicio
	 * @param _data_fim
	 * @param _horario_inicio
	 * @param _horario_fim 
	 * 
	 * */
	public Periodo(Data _data_inicio, Data _data_fim, Horario _horario_inicio, Horario _horario_fim) {
		this.setDatas(_data_inicio,_data_fim);
		this.setHorarios(_horario_inicio,_horario_fim);
	}
	/**Construtor vazio*/
	public Periodo () throws Exception{
		this.setHorarios(new Horario(),new Horario());
		this.setDatas(new Data(),new Data());
	}

	/**Metodo que modifica o valor dos campos de hora inicio e fim
	 * @param _horarioIncio
	 * @param _horarioFim
	 * */
	public void setHorarios(Horario _horarioInicio,Horario _horarioFim) {
		this.horaInicio = _horarioInicio;
		this.horaFim = _horarioFim;
	}
	/**Metodo que modifica o valor dos campos horas inicio e fim
	 * @param _dataInicio
	 * @param _dataFim
	 * */
	public void setDatas(Data _dataInicio,Data _dataFim) {
		this.dataInicio = _dataInicio;
		this.dataFim = _dataFim;
	}
	/**Metodo que retorna o valor da hora do inicio
	 * @return horaInicio
	 * */
	public Horario getHoraInicio() {
		return this.horaInicio;
	}
	/**Metodo que retorna o valor da hora do final
	 * @return horaFim
	 * */
	public Horario getHoraFim() {
		return this.horaFim;
	}
	/**Metodo que retorna o valor da data do inicio
	 * @return dataInicio
	 * */
	public Data getDataInicio() {
		return this.dataInicio;
	}
	/**Metodo que retorna o valor da data do fim
	 * @return dataFim
	 * */
	public Data getDataFim() {
		return this.dataFim;
	}
	/**Metodo que comprara dois objetos retornando qual é maior, menor ou se sao iguais
	 * @param objeto objeto a ser comparado
	 * @return -1,0,1, para menor, igual e maior respectivamente
	 * */
	public int compareTo (Periodo objeto) {

		if(this.getHoraInicio().compareTo(objeto.getHoraInicio()) == 0) {
			if(this.getHoraFim().compareTo(objeto.getHoraFim()) == 0){
				if(this.getDataInicio().compareTo(objeto.getDataInicio()) == 0)	{				
					if(this.getDataFim().compareTo(objeto.getDataFim()) == 0){
						return 0;
					}
					if(this.getDataFim().compareTo(objeto.getDataFim()) == -1){
						return -1;
					}
					else {
						return 1;
					}
				}
				if(this.getDataInicio().compareTo(objeto.getDataInicio()) == -1){
					return -1;
				}
				else {
					return 1;
				}
			}
			if(this.getHoraFim().compareTo(objeto.getHoraFim()) == -1){
				return -1;
			}
			else {
				return 1;
			}
		}
		if(this.getHoraInicio().compareTo(objeto.getHoraInicio()) == -1){
			return -1;
		}
		else {
			return 1;
		}
	}
	/**Metodo que comprara dois objetos retornando se são iguais por meio de um boolean
	 * @param objeto objeto a ser comparado
	 * @return true para igual e false para diferente
	 * */
	public boolean equals(Periodo objeto) {
		if (this.compareTo(objeto) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Método toString para informar todas as informações do objeto
	 * @return String com todos os dados
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append("Data de Início: ");
		str.append(this.getDataInicio());
		str.append("\nHora de Início: ");
		str.append(this.getHoraInicio());
		str.append("\nData de Fim: ");
		str.append(this.getDataFim());
		str.append("\nHora de Fim: ");
		str.append(this.getHoraFim());

		return str.toString();		

	}


}

