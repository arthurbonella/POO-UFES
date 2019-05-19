package Exercício_17;

public class Ponto {

	private Coordenada x,y;


	//CONSTRUTORES
	public Ponto(double _x,double _y) throws Exception{
		this.x = new Coordenada(_x);
		this.y = new Coordenada(_y);
		this.setPonto(this.x,this.y);
	}
	public Ponto() throws Exception{
		this.x = new Coordenada();
		this.y = new Coordenada();
		this.setPonto(this.x,this.y);
	}

	//GETS
	public Coordenada getX() {
		return this.x;
	}
	public Coordenada getY() {
		return this.y;
	}

	//SETS
	public void setX(Coordenada _x) {
		this.x = _x;
	}
	
	public void setY(Coordenada _y) {
		this.y = _y;
	}
	
	public void setPonto(Coordenada c1, Coordenada c2) {
		this.x = c1;
		this.y = c2;
	}

	//EQUALS
	public boolean equals(Object obj) {
		Ponto aux = (Ponto)obj;
		if (this.getX() == aux.getX() && this.getY() == aux.getY()) {
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
		str.append(")");
		
		return str.toString();
	}
	
}
