package Exercício_12;

import Exercício_02.Data;

public class Paciente extends Pessoa {

	private String planoSaude;

	//CONSTRUTORES
	public Paciente(String _nome, String _identidade, Data _dataNascimento, String _planoSaude) {
		super(_nome, _identidade, _dataNascimento);
		this.setPlanoSaude(_planoSaude);
	}
	public Paciente(String _nome, String _identidade, String _dataNascimentoStr, String _planoSaude) throws Exception {
		super(_nome, _identidade, _dataNascimentoStr);
		this.setPlanoSaude(_planoSaude);
	}
	public Paciente(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento, String _planoSaude) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento);
		this.setPlanoSaude(_planoSaude);
	}

	//GET
	public String getPlanoSaude() {
		return this.planoSaude;
	}

	//SET
	public void setPlanoSaude(String _planoSaude) {
		this.planoSaude = _planoSaude;
	}

	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\nPlanoSaude: ");
		str.append(this.getPlanoSaude());

		return str.toString();
	}	
}

