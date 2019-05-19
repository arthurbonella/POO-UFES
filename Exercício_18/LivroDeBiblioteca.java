package Exercício_18;


public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
	
	private boolean statusEmprestimo;
	private String localizacao;
	private String descricao;
	
	//CONSTRUTORES
	public LivroDeBiblioteca(String _titulo,String _autor, int _numeroPaginas,int _anoEdicao,boolean _statusEmprestimo,String _localizacao,String _descricao) {
		super(_titulo,_autor,_numeroPaginas,_anoEdicao);
		this.setStatusEmprestimo(_statusEmprestimo);
		this.setLocalizacao(_localizacao);
		this.setDescricao(_descricao);
	}
	public LivroDeBiblioteca() {}
	
	//METODOS DA CLASSE
	
	
	//GETS
	public boolean getStatusEmprestimo() {
		return this.statusEmprestimo;
	}
	public String getLocalizacao() {
		return this.localizacao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	
	//SETS
	public void setStatusEmprestimo(boolean _statusEmprestimo) {
		this.statusEmprestimo = _statusEmprestimo;
	}
	public void setLocalizacao(String _localizacao) {
		this.localizacao = _localizacao;
	}
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	
	
	
	
	
	
	
	
	//ITEMDEBIBLIO - OBRIGATORIO
	public boolean isEmprestado() {
		return this.getStatusEmprestimo();
	}
	public void empresta() {
		this.setStatusEmprestimo(true);
	}
	public void devolve() {
		this.setStatusEmprestimo(false);
	}
	
	public String localiza() {
		return this.getLocalizacao();
	}//
	public String apresentaDescricao() {
		return this.getDescricao();
	}

	//toString
	
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		
		str.append(super.toString());
		str.append("\\nisEmprestado:");
		str.append(this.getStatusEmprestimo());
		str.append("\nLocalizacao:");
		str.append(this.getLocalizacao());
		str.append("\nDescricao:");
		str.append(this.getDescricao());
		
		return str.toString();
		
	}
	
	
	

}
