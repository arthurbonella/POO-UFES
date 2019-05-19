package Exerc�cio_05;

public class Aluno {
	
	final private static double LimiteSuperior = 10;
	private static double sup = Aluno.LimiteSuperior;

	private String nome;
	private double nota1, nota2, media, pontos;

	// quatro construtores sobrecarregados
	public Aluno(String _nome,double _nota1,double _nota2,double _pontos) {
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
	}
	public Aluno(double _nota1, double _nota2, double _pontos)  {
		this("sem nome", _nota1, _nota2, _pontos);
	}
	public Aluno(double _nota1, double _nota2)  {
		this(_nota1, _nota2, 0.0);
	}
	public Aluno() {
		this(0.0,0.0);
	}

	// m�todos de interface para acesso aos campos privados
	public String getNome() {      	
		return this.nome;     
	}
	public void setNome(String _nome) {
		this.nome = _nome; 	
	}
	public double getNota1() {
		return this.nota1; 	
	}
	public double getNota2() {
		return this.nota2; 	
	}
	public double getMedia() {
		return this.media; 	
	}
	public double getPontos()  {
		return this.pontos;	
	}
	public void setPontos(double _pontos) {
		this.pontos = _pontos;
		this.calculaMedia(10);
	}
	public static double getLimite(){
		return Aluno.sup;	
	}
	public static void setLimite(double _pontos)throws Exception{
		if(verificaLimite(_pontos) == true) {
			Aluno.sup = _pontos;
		}
		else{

			throw new Exception ("Nota invalida.");

		}
		
	}

	// tratamento de erro ainda inadequado, ser� melhorado mais adiante
	public boolean setNotas(double _nota1, double _nota2, double _pontos) {
		this.pontos = _pontos;
		if(_nota1>=0 && _nota1<=10 && _nota2>=0 && _nota2<=10) {
			this.nota1 = _nota1;
			this.nota2 = _nota2;
			this.calculaMedia(10);
			return true;
		}
		else
			return false;
	}

	public void setNotas(double _nota1, double _nota2) {
		this.setNotas(_nota1, _nota2, 0);
	}


	// m�todo para calcular a m�dia. Privado pois o uso � apenas interno a classe
	private double calculaMedia() {
		this.media = (this.getNota1() + this.getNota2() + this.getPontos())/2;
		return this.media;
	}

	// sobrecarregamento do c�lculo da m�dia para limitar o valor m�ximo
	private double calculaMedia(int _limite) {
		this.calculaMedia();
		if(this.media > _limite)
			this.media = _limite;
		return this.media;
	}
	private static boolean verificaLimite(double _nota){

		if(_nota > Aluno.sup && _nota < 0){
			return false;
		}
		else{
			return true;
		}
	}//Estatico, pois se nao for ter� que estar atrelado a um objeto para fazer a compara��o, sendo que n�o � usado nada de qualuqer objeto
	
	
	// n�o � adequado que o m�todo toString exiba mensagens, pois
	// � comum considerar que o programador de classes n�o conhece o usu�rio final
	// Evita-se tamb�m textos retornados, escritos em uma determinada l�ngua. 
	public String toString(){
		return this.getNome()+";"
				+this.getNota1()+";"
				+this.getNota2()+";"
				+this.getPontos()+";"
				+this.getMedia();
	}
	public boolean equals(Object objeto) {
		Aluno aux = (Aluno)objeto;
		if (this.getNome().equals(aux.getNome()) &&
				this.getNota1() == aux.getNota1() &&
				this.getNota2() == aux.getNota2() &&
				this.getPontos() == aux.getPontos())
			return true;
		return false;
	} 
}
