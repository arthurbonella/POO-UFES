package Exercício_12;

import Exercício_02.Data;

public class Pessoa {

	private String nome, identidade;
	private Data dataNascimento;

	//CONSTRUTORES
	public Pessoa(String _nome, String _identidade, Data _dataNascimento) {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setDataNascimento(_dataNascimento);
	}
	public Pessoa(String _nome, String _identidade, String _dataNascimentoStr) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setDataNascimento(new Data(_dataNascimentoStr));
	}
	public Pessoa(String _nome, String _identidade, int _dia, int _mes, int _ano) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setDataNascimento(new Data(_dia,_mes,_ano));
	}
	//METODOS

	//GET
	public String getNome() {
		return this.nome;
	}
	public String getIdentidade() {
		return this.identidade;
	}
	public Data getDataNascimento() {
		return this.dataNascimento;
	}


	//SET
	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public void setIdentidade(String _identidade) {
		this.identidade = _identidade;
	}

	public void setDataNascimento(Data _dataNascimento) {
		this.dataNascimento = _dataNascimento;
	}

	//STRINGBUILDER
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append("Nome: ");
		str.append(this.getNome());
		str.append("\nIdentidade: ");
		str.append(this.getIdentidade());
		str.append("\nDataNascimento: ");
		str.append(this.getDataNascimento());

		return str.toString();
	}	
}