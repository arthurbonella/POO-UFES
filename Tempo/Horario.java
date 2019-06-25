package Tempo;

public class Horario {

	private int horas,minutos;

	public Horario (int _horas,int _minutos) throws Exception {
		this.setHorario(_horas, _minutos);
	}
	public Horario () {
		this.horas = 0;
		this.minutos = 0;
	}


	public void setHoras(int _horas){
		this.horas=_horas;
	}
	public void setMinutos(int _minutos) {
		this.minutos = _minutos;
	}

	public int getHoras() {
		return this.horas;
	}
	public int getMinutos() {
		return this.minutos;
	}

	public void setHorario (int _horas,int _minutos)throws Exception{

		if (_horas < 24 && _horas>=0 && _minutos < 60 && _minutos>=0) {
			this.setHoras(_horas);
			this.setMinutos(_minutos);
		}
		else {
			throw new Exception ("Horario Fora do Padrão");
		}
	}

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

	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(this.getHoras());
		str.append(":");
		str.append(this.getMinutos());

		return str.toString();
	}


}


