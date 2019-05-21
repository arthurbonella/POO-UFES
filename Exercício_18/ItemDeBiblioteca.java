package Exercício_18;


public interface ItemDeBiblioteca {
	
	public StatusEmprestimo isEmprestado();
	public void empresta();
	public void devolve();
	public String localiza();
	public String apresentaDescricao();
	
}
