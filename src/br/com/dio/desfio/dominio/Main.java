package br.com.dio.desfio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso("JAva", "Aprendendo a modelar com maven", 12);

		Curso curso2 = new Curso("JAvaScript", "aprendendo a construir pag bonitas", 6);

		Mentoria mentoria = new Mentoria("Mentoria Java", "aprendo Java com prof guanabara");
		
	
		
		BootCamp bootcamp = new BootCamp("Bootcamp Java Developer","Aprendendo java do zero ao pro");

		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		
		
		
		
		Dev devRafael = new Dev();
		devRafael.setNome("Rafael henryque");
		devRafael.inscreverBootcamp(bootcamp);
		devRafael.progredir();
		
		
		Dev devfulano = new Dev();
		devfulano.setNome("fulano de tal");
		
		
		
		
		
		System.out.println("conteudos de Rafael" + devRafael.getConteudoInscritos());
		
		System.out.println("conteudos concluidos de Rafael" + devRafael.getConteudoConcluidos());
		
		System.out.println("Xp = " + devRafael.calcularTotalXp());
		
		
		
		System.out.println("Conteudos de camila " + devfulano.getConteudoInscritos());
	
		System.out.println("Conteudos concluidos de camila " + devfulano.getConteudoConcluidos());
		
	}

}
