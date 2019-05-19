package Exercício_14;


public class Contato extends Email {

	private String nome;

	//CONSTRUTORES

	public Contato(String nome, String email) throws Exception {
		super(email);
		this.setNome(nome);
	}
	public Contato(String email) throws Exception {
		super(email);
		this.setNome("Sem nome");
	}

	//GETS

	public String getNome() {
		return this.nome; 
	}

	//SETS

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean equals(Object objeto) {
		Contato aux = (Contato) objeto;
		if( super.equals(aux)==true && aux.getNome() == this.getNome()) {
			return true;
		}
		else return false;
	}

	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\n");
		str.append(this.getNome());

		return str.toString();
	}
}
