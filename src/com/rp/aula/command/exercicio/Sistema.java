package com.rp.aula.command.exercicio;

public class Sistema {

	public static void main(String[] args) {

		Painel painel = new Painel();

		PilotoAutomatico p = new PilotoAutomatico();
		LigarPilotoAutomatico lp = new LigarPilotoAutomatico(p);
		DesligarPilotoAutomatico dpl = new DesligarPilotoAutomatico(p);

		painel.addCommand(lp);
		painel.addCommand(dpl);
		
		painel.executar(0);
		painel.executar(1);
		
	}

}
