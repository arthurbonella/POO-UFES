package Exercício_09;

public class Ponto {

	final private static double INFDEFAULT = 0,SUPDEFAULT = 500;

	private double x,y;
	private static double inf = Ponto.INFDEFAULT,sup = Ponto.SUPDEFAULT;

	//Construtores
	public Ponto() throws Exception {
		this.setPonto(0, 0);
	}

	public Ponto (double _x,double _y) throws Exception {
		this.setPonto(_x,_y);
	}

	public Ponto (String ponto) throws Exception {
		this.setPonto(ponto);
	}

	//Metodos

	public double getX(){
		return x;
	}

	public void setX(double _x)throws Exception{

		if( _x>=Ponto.inf && _x<=Ponto.sup){
			this.x = _x;
		}
		else{
			throw new Exception ("Coordenada Fora dos Limites.");
		}
	}

	public double getY(){
		return y;
	}

	public void setY(double _y)throws Exception{

		if( _y>=Ponto.inf && _y<=Ponto.sup){
			this.y = _y;
		}
		else{
			throw new Exception ("Coordenada Fora dos Limites.");
		}
	}

	public void setPonto(double _x,double _y) throws Exception {
		this.setY(_y);
		this.setX(_x);
	}
	public void setPonto(String _ponto) throws Exception{
		double x,y;

		//dia = Integer.parseInt(data.substring(0,(data.indexOf("/"))))
		x = Double.parseDouble(_ponto.substring(_ponto.indexOf("(")+1,_ponto.indexOf(",")));
		y = Double.parseDouble(_ponto.substring(_ponto.indexOf(",")+1,_ponto.indexOf(")")));
		setPonto(x,y);

	}

	public static void setInf(double _inf) {
		Ponto.inf = _inf;
	}

	public static double getInf() {
		return Ponto.inf;
	}

	public static void setSup(double _sup) {
		Ponto.sup = _sup;
	}

	public static double getSup() {
		return Ponto.sup;
	}

	public static void setLimites(double _inf,double _sup)throws Exception {

		if(Ponto.sup>Ponto.inf) {
			Ponto.sup = _sup;
			Ponto.inf = _inf;
		}

		else {

			throw new Exception("Limite Superior MENOR que Inferior");
		}
	}

	//clonar
	public Ponto clonar() throws Exception {
		return new Ponto(getX(),getY());
	}
	//criaSwap
	public Ponto criaSwap() throws Exception {
		return new Ponto(this.y,this.x);
	}
	//temeixocomum
	public boolean temEixoComum(Ponto objeto) {

		if(this.x == objeto.x || this.y == objeto.y) {
			return true;
		}
		else {
			return false;
		}
	}

	//distancia euclidiana
	public double distanciaEuclidiana(Ponto objeto) {	
		return Math.sqrt(((objeto.x - this.x)*(objeto.x - this.x))+((objeto.y - this.y)*(objeto.y - this.y)));
	}
	//distancia sobrecarregada 2 coordenadas do objeto
	public double distanciaEuclidiana(double _x,double _y) throws Exception {
		return this.distanciaEuclidiana(new Ponto(_x,_y));	
	}
	//idem 4 coordenadas ds dois objetos
	public static double distanciaEuclidiana(double x1,double y1,double x2,double y2) throws Exception {
		return new Ponto(x1,y1).distanciaEuclidiana(new Ponto(x2,y2));
	}
	//dois objetos 
	public static double distanciaEuclidiana(Ponto p1,Ponto p2) {
		return p1.distanciaEuclidiana(p2);
	}
	//distanciadaOrigem
	public double distanciaEuclidiana() throws Exception {
		return this.distanciaEuclidiana(new Ponto(0,0));
	}
	//compareTo  -> compara distancia do ponto até origem
	public int compareTo(Ponto objeto) {

		if(this.x == objeto.x) {

			if(this.y == objeto.y) {
				return 0;
			}
			if(this.y > objeto.y) {
				return 1;
			}
			else {
				return -1;
			}
		}

		if(this.x > objeto.x) {
			return 1;
		}

		else {
			return -1;
		}
	}

	//Equals
	public boolean equals(Ponto objeto) {

		if(objeto.x == this.x) {
			if(objeto.y == this.y) {
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

		StringBuilder pontoStr = new StringBuilder();



		pontoStr.append("(");
		pontoStr.append(this.getX());
		pontoStr.append(",");
		pontoStr.append(this.getY());
		pontoStr.append(")");

		return pontoStr.toString();
	}
}
















