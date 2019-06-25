package Organizador;

import Tempo.*;

public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {

	public int minAntecedencia;

	public Lembrete(String _titulo, String _descricao, Periodo _periodo, int _minAntecedencia) throws Exception {
		super(_titulo, _descricao, _periodo);
		this.setMinAntecedencia(_minAntecedencia);
	}
	public Lembrete(String _titulo, String _descricao, Data _data_inicio, Data _data_fim, Horario _horario_inicio, Horario _horario_fim, int _minAntecedencia) throws Exception {
		super(_titulo, _descricao, _data_inicio, _data_fim, _horario_inicio, _horario_fim);
		this.setMinAntecedencia(_minAntecedencia);
	}

	public int getMinAntecedencia() {
		return this.minAntecedencia;
	}
	public void setMinAntecedencia(int _minAntecedencia) throws Exception {
		if (_minAntecedencia >= 0) {
			this.minAntecedencia = _minAntecedencia;
		}
		else {
			throw new Exception("\nValor deve ser maior ou igual a zero\n");
		}
	}
	public int compareTo(Lembrete _objeto) {
		if (this.getMinAntecedencia() == _objeto.getMinAntecedencia()) {
			return 0;

		}
		if (this.getMinAntecedencia() > _objeto.getMinAntecedencia()) {
			return 1;

		}
		else {
			return -1;
		}

	}
	public boolean equals(Lembrete _objeto) {
		if(this.compareTo(_objeto)==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(super.toString());
		info.append("\nO lembrete vai ser acionado faltando: " + this.getMinAntecedencia() + " minutos\n");
		return info.toString();
	}
}
