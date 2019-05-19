package Exercício_14;


public class Cliente extends Contato {


	private int celular;
	private String endereco;
	private double renda;
	private static final double RENDAFIXA = 2000;
	private static double rendaFixa = RENDAFIXA;

	//CONSTRUTORES

	public Cliente(String nome, String email, int celular, String endereco, double renda) throws Exception {
		super(nome, email);
		this.setCliente(celular, endereco, renda);
	}
	public Cliente(String nome, String email) throws Exception {
		super(nome, email);
		this.setCliente(99999999, "Vazio", 0.0);
	}

	//GETS

	public int getCelular() {
		return this.celular;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public double getRenda() {
		return this.renda;
	}
	public static double getLimInferior() {
		return Cliente.rendaFixa;
	}

	//SETS
	public void setCelular(int _celular) {
		this.celular = _celular;
	}
	public void setEndereco( String _endereço) {
		this.endereco = _endereço;
	}
	public void setRenda(double _renda) {
		this.renda = _renda;
	}
	public static void setRendaFixa(double _rendafixa) {
		Cliente.rendaFixa = _rendafixa;
	}

	public void setCliente(int celular, String endereco, double renda) {
		this.celular = celular;
		this.endereco = endereco;
		this.renda = renda;
	}

	//METODOS

	public boolean equals(Object objeto) {

		Cliente aux = (Cliente) objeto;

		if( super.equals(aux)==true && (aux.getCelular() == this.getCelular())
				&& (aux.getEndereco() == this.getEndereco()) && (aux.getRenda() == this.getRenda())) {
			return true;
		}

		else return false;
	}

	public static String categoriaCliente(double renda) {

		if(renda>rendaFixa) {

			return "top";
		}

		else {

			return "usual";
		}
	}
	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\n");
		str.append(this.getCelular());
		str.append("\n");
		str.append(this.getEndereco());
		str.append("\n");
		str.append(this.getRenda());

		return str.toString();
	}
}
