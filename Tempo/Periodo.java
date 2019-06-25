package Tempo;

public class Periodo {

	Horario horaInicio,horaFim;
	Data dataInicio,dataFim;

	public Periodo (int _diaInicio,int _mesInicio,int _anoInicio,int _horasInicio,int _minutosInicio,int _diaFim,int _mesFim,int _anoFim,int _horasFim,int _minutosFim) throws Exception{
		this.setHorarios(new Horario(_horasInicio,_minutosInicio),new Horario(_horasFim,_minutosFim));
		this.setDatas(new Data(_diaInicio,_mesInicio,_anoInicio),new Data(_diaFim,_mesFim,_anoFim));
	}
	public Periodo(Data _data_inicio, Data _data_fim, Horario _horario_inicio, Horario _horario_fim) {
		this.setDatas(_data_inicio,_data_fim);
		this.setHorarios(_horario_inicio,_horario_fim);
	}
	public Periodo () throws Exception{
		this.setHorarios(new Horario(),new Horario());
		this.setDatas(new Data(),new Data());
	}


	public void setHorarios(Horario _horarioInicio,Horario _horarioFim) {
		this.horaInicio = _horarioInicio;
		this.horaFim = _horarioFim;
	}

	public void setDatas(Data _dataInicio,Data _dataFim) {
		this.dataInicio = _dataInicio;
		this.dataFim = _dataFim;
	}

	public Horario getHoraInicio() {
		return this.horaInicio;
	}
	public Horario getHoraFim() {
		return this.horaFim;
	}
	public Data getDataInicio() {
		return this.dataInicio;
	}
	public Data getDataFim() {
		return this.dataFim;
	}

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

	public boolean equals(Periodo objeto) {
		if (this.compareTo(objeto) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
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

