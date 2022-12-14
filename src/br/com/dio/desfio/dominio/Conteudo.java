package br.com.dio.desfio.dominio;



public abstract class Conteudo {
	
	protected static final Double xp_padrao =10.0;
	private String curso;
	private String descricao;
	
	
	
	
	
	
	public Conteudo(String curso, String descricao) {
		super();
		this.curso = curso;
		this.descricao = descricao;
	}



	public abstract double calcularXp();



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
