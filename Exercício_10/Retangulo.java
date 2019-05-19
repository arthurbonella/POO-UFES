package Exercício_10;

import Exercício_09.Ponto;

public class Retangulo {


	Ponto ls;
	Ponto ri;

	//construtores 
	public Retangulo() throws Exception{

		this.setVertices(new Ponto(),new Ponto());
	}


	public Retangulo (Ponto _ls,Ponto _ri){

		this.setVertices(_ls,_ri);
	}
	public Retangulo(double xls,double yls,double xri,double yri) throws Exception{
		this.setVertices(xls,yls,xri,yri);
	}


	public void setRi(Ponto _ri) {

		this.ri = _ri;
	}
	public Ponto getRi(){
		return this.ri;
	}

	public void setLs(Ponto _ls) {

		this.ls = _ls;
	}
	public Ponto getLs(){
		return this.ls;
	}

	public void setVertices(Ponto _ls,Ponto _ri) {
		this.setRi(_ri);
		this.setLs(_ls);
	}
	public void setVertices(double xls,double yls,double xri,double yri) throws Exception{
		Ponto _ls = new Ponto(xls,yls);
		this.setLs(_ls);

		Ponto _ri = new Ponto(xri,yri);
		this.setRi(_ri);

	}


	public double ladox() throws Exception{
		return this.ri.distanciaEuclidiana();
	}

	public double ladoy() throws Exception{
		return this.ls.distanciaEuclidiana();
	}

	public double area() throws Exception{
		return this.ladoy()*this.ladox();
	}

	public double perimetro() throws Exception{
		return (2*this.ladoy()) + (2*this.ladox());
	}

	public boolean equals(Retangulo _objeto) {
		if(this.getLs().equals(_objeto.getLs()) && this.getRi().equals(_objeto.getRi())){
			return true;
		}
		else {
			return false;
		}
	}

	boolean equalArea (Retangulo _objeto) throws Exception{
		if (this.area() == _objeto.area()) {
			return true;
		}
		else {
			return false;
		}
	}

	public int compareTo(Retangulo _objeto) throws Exception{
		if (this.area() == _objeto.area()) {
			return 0;
		}
		if (this.area() < _objeto.area()) {
			return -1;
		}
		else {
			return 1;
		}
	}


	public String toString(){
		StringBuilder retanglStr = new StringBuilder();

		retanglStr.append("(0,"+this.getLs()+")-("+this.getRi()+",0)");
		
		return retanglStr.toString();

	}
}
