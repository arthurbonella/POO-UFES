package Exercício_12;

import Exercício_02.Data;

public class Diretor extends Chefe {

	private Data dataPromocao;

	//CONSTRUTORES
	public Diretor(String _nome, String _identidade, Data _dataNascimento, Data _dataAdmissao, double _salario, String _depto, Data _dataPromocao) {
		super(_nome, _identidade, _dataNascimento, _dataAdmissao, _salario, _depto);
		this.setDataPromocao(_dataPromocao);
	}
	public Diretor(String _nome, String _identidade, String _dataNascimentoStr, String _dataAdmissaoStr, double _salario, String _depto, String _dataPromocaoStr) throws Exception {
		super(_nome, _identidade, _dataNascimentoStr, _dataAdmissaoStr, _salario, _depto);
		this.setDataPromocao(new Data(_dataPromocaoStr));
	}
	public Diretor(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento, int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario, String _depto, int _diaPromo, int _mesPromo, int _anoPromo) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _diaAdmissao, _mesAdmissao, _anoAdmissao, _salario, _depto);
		this.dataPromocao = new Data(_diaPromo, _mesPromo, _anoPromo);
	}

	//METODOS
	//GET
	public Data getDataPromocao() {
		return this.dataPromocao;
	}
	//SET
	public void setDataPromocao(Data _dataPromocao) {
		this.dataPromocao = _dataPromocao;
	}
	public double calculaMaxEmprestimo() {
		return super.calculaMaxEmprestimo()*1.5;
	}

	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\nPromoÃ§Ã£o: ");
		str.append(this.getDataPromocao());

		return str.toString();
	}
}
