package Exercício_18;


public class Livro {

	private String titulo;
	private String autor;
	private int numeroPaginas;
	private int anoEdicao;

	//Construtor
	public Livro(String _titulo,String _autor, int _numeroPaginas,int _anoEdicao) {
		this.setTitulo(_titulo);
		this.setAutor(_autor);
		this.setNumeroPaginas(_numeroPaginas);
		this.setAnoEdicao(_anoEdicao);

	}
	public Livro() {}

	//sets
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	public void setAutor(String _autor) {
		this.autor = _autor;	
	}
	public void setNumeroPaginas(int _numeroPaginas) {
		this.numeroPaginas = _numeroPaginas;
	}
	public void setAnoEdicao(int _anoEdicao) {
		this.anoEdicao = _anoEdicao;
	}

	//gets
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	public int getAnoEdicao() {
		return this.anoEdicao;
	}
	//toString
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append("Título:");
		str.append(this.getTitulo());
		str.append("\nAutor:");
		str.append(this.getAutor());
		str.append("\nNumero de Paginas:");
		str.append(this.getNumeroPaginas());
		str.append("\nAno de Edição:");
		str.append(this.getAnoEdicao());
		return str.toString();
	}

}
