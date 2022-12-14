package br.com.dio.desfio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

private LocalDate data;



public Mentoria(String titulo, String descricao) {
	super(titulo, descricao);
	this.data = data;
}


@Override
public double calcularXp() {
	
	return xp_padrao + 20;
}

public LocalDate getData() {
	return data;
}

public void setData(LocalDate data) {
	this.data = data;
}



@Override

public String toString() {
	return "Mentoria [titulo = " +getCurso() + 
			", descricao = " + getDescricao() + 
			", data = " +
			data + "]";
}


}
