package Exercício_17;

public class Coordenada {

	private double c;

	//CONSTRUTORES
	public Coordenada(double _c) throws Exception{
		this.setCoord(c);
	}
	public Coordenada() throws Exception{
		this(0);
	}

	//GETS
	public double getCoor() {
		return this.c;
	}

	//SETS
	public void setCoord(double _c) throws Exception{
		if (_c >= 0) {
			this.c = _c;
		}
		else {
			throw new Exception("Erro");
		}

	}

	//EQUALS
	public boolean equals(Object obj) {
		Coordenada aux = (Coordenada)obj;
		if (this.getCoor() == aux.getCoor()) {
			return true;
		}
		return false;
	}

	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(this.getCoor());

		return str.toString();
	}



}
