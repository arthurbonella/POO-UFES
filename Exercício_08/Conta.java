package Exercício_08;

public class Conta {

	final private static double JUROSINICIAL = 1.005;


	private static double juros = JUROSINICIAL;
	private String nome;
	private double saldo;

	//METODOS

	//CONSTRUTORES
	//Cheio
	public Conta (String nome,double saldo) throws Exception{
		this.setDados(nome,saldo);
	}
	//Vazio
	public Conta () throws Exception{
		this.setDados("noname",0);
	}

	//SETS - PRINCIPAL COM THROWS E RESTO COM TRY CATCH | Throws joga o try catch pra frente |inibir saldo engativo throws
	public static void setJuros(double _newjuros){
		Conta.juros = _newjuros;
	}

	public void setNome(String _nome){
		this.nome = _nome;
	}

	public void setSaldo(double _saldo) throws Exception{
		if(_saldo > 0){

			this.saldo = _saldo;
		}
		else{

			throw new Exception ("Saldo Inválido.\n");
		}
	}

	public void setDados(String _nome,double _saldo) throws Exception{
		this.setNome(_nome);
		this.setSaldo(_saldo);
	}

	//GETS
	public  double getJuros(){
		return Conta.juros;
	}

	public String getNome(){
		return this.nome;
	}

	public double getSaldo(){
		return this.saldo;
	}

	//COMPARE-TO
	public int compareTo(Conta objeto){

		if(this.nome.compareToIgnoreCase(objeto.nome) == 0){

			if(this.saldo == objeto.saldo){

				return 0;
			}

			if(this.saldo < objeto.saldo){
				return -1;
			}

			else{
				return 1;
			}
		}
		if(this.nome.compareToIgnoreCase(objeto.nome) == -1){

			return -1;
		}

		else{

			return 1;
		}
	}

	//Saque
	public void saque(double _saque) throws Exception{

		this.setSaldo(this.saldo - _saque);
	}

	//Deposito
	public void deposito(double _deposito) throws Exception{

		this.setSaldo(this.saldo + _deposito);

	}

	//Corrrigir saldo com taxa de juros
	public void acertoDeJuros(int meses){

		int i;

		for(i=0;i<meses;i++){

			this.saldo = (this.saldo)*(Conta.juros);
		}

	}
	//EQUALS
	public boolean equals (Conta objeto){
		if(this.nome.compareToIgnoreCase(objeto.nome) == 0){

			if(this.saldo == objeto.saldo){

				return true;
			}

			else{

				return false;
			}
		}

		else{

			return false;
		}
	}

	//TO-STRING0

	public String toString(){

		StringBuilder contaStr = new StringBuilder();

		contaStr.append("Nome: ");
		contaStr.append(this.getNome());
		contaStr.append("\n");
		contaStr.append("Saldo :");
		contaStr.append(this.getSaldo());
		contaStr.append("\n");//COMO PRINTAR COM DELIMITAÇÕES

		return contaStr.toString();
	}
}