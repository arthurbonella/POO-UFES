package Exercício_17;

public class Quadrado {

	private Coordenada x,y;
	private double comp,larg,esp;
	private boolean p;


	//CONSTRUTORES
	public Quadrado(double _x, double _y, double _comp, double _larg,double _esp,boolean _p) throws Exception{
		this.x = new Coordenada(_x);
		this.y = new Coordenada(_y);
		this.setQuadrado(this.x,this.y,_comp,_larg,_esp,_p);
	}
	public Quadrado() throws Exception{
		this(0,0,0,0,0,false);
	}

	//GETS
	public Coordenada getX() {
		return this.x;
	}

	public Coordenada getY() {
		return this.y;
	}

	public double getComp() {
		return this.comp;
	}

	public double getLarg() {
		return this.larg;
	}

	public double getEsp() {
		return this.esp;
	}

	public boolean getP() {
		return this.p;
	}

	//SET
	public void setX(Coordenada _x) {
		this.x = _x;
	}

	public void setY(Coordenada _y) {
		this.y = _y;
	}

	public void setComp(double _comp) {
		this.comp = _comp;
	}

	public void setLarg(double _larg) {
		this.larg = _larg;
	}

	public void setEsp(double _esp) {
		this.esp = _esp;
	}

	public void setP(boolean _p) {
		this.p = _p;
	}

	public void setQuadrado(Coordenada c1,Coordenada c2, double c,double l,double esp,boolean p) throws Exception{
		if (c > 0 && l > 0) {
			this.setX(c1);
			this.setY(c2);
			this.setComp(comp);
			this.setLarg(larg);
			this.setEsp(esp);
			this.setP(p);
		}
		else {
			throw new Exception("Erro");
		}
	}

	//PERIMETRO
	public double perimetro() {
		return (this.getComp()*2 + this.getLarg()*2);
	}

	//AREA
	public double area() {
		return (this.getComp()*this.getLarg());
	}

	//EQUALS
	public boolean equals(Object obj) {

		Quadrado aux = (Quadrado)obj;

		if (this.getX() == aux.getX() && this.getY() == aux.getY() && this.getComp() == aux.getLarg() && this.getLarg() == aux.getLarg()) {
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
		str.append("Largura: ");
		str.append(this.getLarg());
		str.append("\tComprimento: ");
		str.append(this.getComp());

		return str.toString();
	}
}
