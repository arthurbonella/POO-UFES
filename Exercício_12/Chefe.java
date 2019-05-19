package Exercício_12;

import Exercício_02.Data;

public class Chefe extends Funcionario {

	private String depto;

	//CONSTRUTORES
	public Chefe(String _nome, String _identidade, Data _dataNascimento, Data _dataAdmissao, double _salario, String _depto) {
		super(_nome, _identidade, _dataNascimento, _dataAdmissao, _salario);
		this.setDepto(_depto);
	}
	public Chefe(String _nome, String _identidade, String _dataNascimentoStr, String _dataAdmissaoStr, double _salario, String _depto) throws Exception {
		super(_nome, _identidade, _dataNascimentoStr, _dataAdmissaoStr, _salario);
		this.setDepto(_depto);
	}
	public Chefe(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento, int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario, String _depto) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _diaAdmissao, _mesAdmissao, _anoAdmissao, _salario);
		this.setDepto(_depto);
	}
	//GET
	public String getDepto() {
		return this.depto;
	}
	//SET
	public void setDepto(String _depto) {
		this.depto = _depto;
	}
	//CALCULAMAXEMPRES
	public double calculaMaxEmprestimo() {
		return super.calculaMaxEmprestimo()*2;
	}
	//TOSTRING
	public String toString() {


		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\nDepartamento: ");
		str.append(this.getDepto());

		return str.toString();
	}
}
