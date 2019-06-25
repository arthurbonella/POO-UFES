package Organizador;

import Tempo.*;

/**
 * Classe meta, que utiliza de uma enumeração "prioridade"para setar as prioridades de cada meta
 * Classe extendida de ItemAgenda
 * @author Arthur Bonella
 * @version 1.0 (junho-2019)
 */
public class Meta extends ItemAgenda implements Comparable<Meta> {

	Prioridade meta;
	/**Construtor com 4 parametros
	 * @param _titulo titulo do item
	 * @param _descricao descricao do item
	 * @param _duracao duracao do item
	 * @param _meta meta 
	 * */
	public Meta (String _titulo,String _descricao, Periodo _duracao,Prioridade _meta) {
		super(_titulo, _descricao, _duracao);
		this.setMeta(_meta);
	}
	/**Construtor com 4 parametros
	 * @param _titulo titulo do item
	 * @param _descricao descricao do item
	 * @param _duracao duracao do item
	 * @param _meta meta , só que acessada pelo codigo*/
	public Meta (String _titulo,String _descricao, Periodo _duracao,int _meta) throws Exception {

		super(_titulo, _descricao, _duracao);

		if(_meta == 3) {
			this.setMeta(Prioridade.BAIXA);
		}
		else if(_meta == 2) {
			this.setMeta(Prioridade.MEDIA);
		}
		else if(_meta == 1) {
			this.setMeta(Prioridade.ALTA);
		}
		else {
			throw new Exception("Meta Inexistente.");
		}
	}
	/**Contrutor vazio que seta todos os campos como vazios ou DEFAULT*/
	public Meta () throws Exception {
		super.setItemAgenda("", "", new Periodo());;
		this.setMeta(Prioridade.BAIXA);
	}
	/**Altera a meta
	 * @param _meta
	 * */
	public void setMeta(Prioridade _meta) {
		this.meta=_meta;
	}
	/**Retorna a meta
	 * @return Meta
	 * */
	public Prioridade getMeta() {
		return this.meta;
	}

	/**
	 * Comparação de duas instancias
	 * @param objeto
	 * @return -1,0,1 dependendo se o bjeto é menor, igual ou maior que o objeto base
	 */
	public int compareTo(Meta objeto) {
		if (this.getMeta().getCodigo() == objeto.getMeta().getCodigo()) {
			return 0;
		}
		if (this.getMeta().getCodigo() < objeto.getMeta().getCodigo()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	/**
	 * Compara duas instancias vendo se sao iguais ou nao
	 * @param objeto
	 * @return boolean*/
	public boolean equals(Meta objeto) {

		if(this.compareTo(objeto) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Método toString sobreposto para informar todas as informações do objeto
	 * @return String com todos os dados
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(super.toString());
		str.append("\nPrioridade da Meta: "+this.getMeta());
		str.append("\n");


		return str.toString();
	}
}
