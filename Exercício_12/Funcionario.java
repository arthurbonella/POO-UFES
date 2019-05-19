package Exercício_12;

import Exercício_02.Data;

public class Funcionario extends Pessoa {

	private Data dataAdmissao;
	private double salario;

	//CONSTRUTORES
	public Funcionario(String _nome, String _identidade, Data _dataNascimento, Data _dataAdmissao, double _salario) {
		super(_nome, _identidade, _dataNascimento);
		this.setDataAdmissao(_dataAdmissao);
		this.setSalario(_salario);
	}
	public Funcionario(String _nome, String _identidade, String _dataNascimentoStr, String _dataAdmissaoStr, double _salario) throws Exception {
		super(_nome, _identidade, _dataNascimentoStr);
		this.setDataAdmissao(new Data(_dataAdmissaoStr));
		this.setSalario(_salario);
	}
	public Funcionario(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento, int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento);
		this.setDataAdmissao(new Data(_diaAdmissao, _mesAdmissao, _anoAdmissao));
		this.setSalario(_salario);
	}

	//METODOS
	//GET
	public Data getDataAdmissao() {
		return this.dataAdmissao;
	}
	public double getSalario() {
		return this.salario;
	}

	//SET
	public void setDataAdmissao(Data _dataAdmissao) {
		this.dataAdmissao = _dataAdmissao;
	}

	public void setSalario(double _salario) {
		this.salario = _salario;
	}

	//REAJUSTA
	public void reajusta(double taxa) {
		this.salario += this.salario * taxa;
	}

	//CALCULAMAXEMPRESTIMO
	public double calculaMaxEmprestimo() {
		return 1000;
	}

	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\nDataAdmissÃ£o: ");
		str.append(this.getDataAdmissao());
		str.append("\nSalario: ");
		str.append(this.getSalario());

		return str.toString();
	}	
}
