package Organizador;

import Tempo.*;

public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {
	public int min_antecedencia;
	
	public Lembrete(String _registro_item, String _descricao, Periodo _periodo, int _min_antecedencia) throws Exception {
		super(_registro_item, _descricao, _periodo);
		this.setMinAntecedencia(_min_antecedencia);
	}
	public Lembrete(String _registro_item, String _descricao, Data _data_inicio, Data _data_fim, Horario _horario_inicio, 
			Horario _horario_fim, int _min_antecedencia) throws Exception {
		super(_registro_item, _descricao, _data_inicio, _data_fim, _horario_inicio, _horario_fim);
		this.setMinAntecedencia(_min_antecedencia);
	}
	
	public int getMinAntecedencia() {
		return this.min_antecedencia;
	}
	public void setMinAntecedencia(int _min_antecedencia) throws Exception {
		if (_min_antecedencia >= 0) {
			this.min_antecedencia = _min_antecedencia;
		}
		else {
			throw new Exception("\nValor deve ser maior ou igual a zero\n");
		}
	}
	@Override
	public int compareTo(Meta _objeto) {
		if (this.getMinAntecedencia() < _lembrete.getMinAntecedencia()) return -1;
		else if (this.getMinAntecedencia() > _lembrete.getMinAntecedencia()) return 1;
		else return 0;
	}
	@Override
	public boolean equals(Meta objeto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(super.toString());
		info.append("\nO lembrete vai ser acionado faltando: " + this.getMinAntecedencia() + " minutos\n");
		return info.toString();
	}
}
