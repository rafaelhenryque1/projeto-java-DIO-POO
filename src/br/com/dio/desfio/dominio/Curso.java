package br.com.dio.desfio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return xp_padrao * cargaHoraria;
	}
	

	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		
		this.cargaHoraria = cargaHoraria;
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" +getCurso()  + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}


	
	
}
