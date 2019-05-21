package Exercício_18;


public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{

	private StatusEmprestimo statusEmprestimo;
	private String localizacao;
	private String descricao;

	//CONSTRUTORES
	public LivroDeBiblioteca(String _titulo,String _autor, int _numeroPaginas,int _anoEdicao,StatusEmprestimo _statusEmprestimo,String _localizacao,String _descricao) {
		super(_titulo,_autor,_numeroPaginas,_anoEdicao);
		this.setStatusEmprestimo(_statusEmprestimo);
		this.setLocalizacao(_localizacao);
		this.setDescricao(_descricao);
	}
	public LivroDeBiblioteca() {
		super();
		this.setStatusEmprestimo(StatusEmprestimo.EMFALTA);
		this.setLocalizacao("Sem Livro");
		this.setDescricao("Sem Livro");
	}

	//METODOS DA CLASSE


	//GETS
	public StatusEmprestimo getStatusEmprestimo() {
		return this.statusEmprestimo;
	}
	public String getLocalizacao() {
		return this.localizacao;
	}
	public String getDescricao() {
		return this.descricao;
	}

	//SETS
	public void setStatusEmprestimo(StatusEmprestimo _statusEmprestimo) {
		this.statusEmprestimo = _statusEmprestimo;
	}
	public void setLocalizacao(String _localizacao) {
		this.localizacao = _localizacao;
	}
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}








	//ITEMDEBIBLIO - OBRIGATORIO
	public StatusEmprestimo isEmprestado() {
		return this.getStatusEmprestimo();
	}
	public void empresta() {
		this.setStatusEmprestimo(StatusEmprestimo.EMPRESTADO);
	}
	public void devolve() {
		this.setStatusEmprestimo(StatusEmprestimo.DEVOLVIDO);
	}
	public void atraso() {
		this.setStatusEmprestimo(StatusEmprestimo.EMATRASO);
	}
	public void manutencao() {
		this.setStatusEmprestimo(StatusEmprestimo.EMMANUTENCAO);
	}
	public void falta() {
		this.setStatusEmprestimo(StatusEmprestimo.EMMANUTENCAO);
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
