package Exercício_17;

public class Circulo {

	private Coordenada x,y;
	private double r,esp;
	private boolean p;

	//CONSTRUTORES
	public Circulo(double _x,double _y,double _r,double _esp,boolean _p) throws Exception{
		this.x = new Coordenada(_x);
		this.y = new Coordenada(_y);
		this.setCirculo(this.x,this.y,_r,_esp,_p);
	}
	public Circulo() throws Exception{
		this(0,0,0,0,false);
	}

	//METODOS

	//GETS
	public Coordenada getX() {
		return this.x;
	}
	public Coordenada getY() {
		return this.y;
	}
	public double getRaio() {
		return this.r;
	}
	public double getEsp() {
		return this.esp;
	}
	public boolean getP() {
		return this.p;
	}

	//SETS
	public void setX(Coordenada _x) {
		this.x = _x;
	}

	public void setY(Coordenada _y) {
		this.y = _y;
	}

	public void setRaio(double _r) {
		this.r = _r;
	}

	public void setEsp(double _esp) {
		this.esp = _esp;
	}

	public void setP(boolean _p) {
		this.p = _p;
	}

	public void setCirculo(Coordenada c1,Coordenada c2,double _r,double _esp,boolean _p) throws Exception{
		if (r > 0) {
			this.setX(c1);
			this.setY(c2);
			this.setRaio(r);
			this.setEsp(esp);
			this.setP(p);
		}
		else {
			throw new Exception("Erro");
		}
	}

	//PERIMETRO
	public double perimetro() {
		return (2*Math.PI*this.getRaio());
	}

	//AREA

	public double area() {
		return (Math.PI*(Math.pow(this.getRaio(),2)));
	}

	//EQUALS
	public boolean equals(Object obj) {
		Circulo aux = (Circulo)obj;
		if (this.getX() == aux.getX() && this.getY() == aux.getY() && this.getRaio() == aux.getRaio()) {
			return true;
		}
		return false;
	}

	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append("(");
		str.append(this.getX());
		str.append(",");
		str.append(this.getY());
		str.append(") - ");
		str.append(this.getRaio());
		str.append(" - Espessura: ");
		str.append(this.getEsp());
		str.append(" - Preenchido: ");
		str.append(this.getP());

		return str.toString();
	}
}
