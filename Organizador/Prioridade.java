package Organizador;

public enum Prioridade {
	
	ALTA(1), MEDIA(2),BAIXA(3);
	
	private int codigo;
	
	private Prioridade (int c) {
		this.codigo = c;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	
}
