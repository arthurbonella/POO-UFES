package Organizador;

/**
 * Enumeração só para separar entre ALTA,MEDIA E BAIXA prioridade 
 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
 */
public enum Prioridade {
	/**Lista à ser enumerada*/
	ALTA(1), MEDIA(2),BAIXA(3);

	private int codigo;
	/**Modifica o valor do codigo
	 * @param c*/
	private Prioridade (int c) {
		this.codigo = c;
	}
	/**Retorna o valor de codigo
	 * @return valor do codigo*/
	public int getCodigo() {
		return this.codigo;
	}


}
