package com.rp.aula.command.exercicio;

public class LigarPilotoAutomatico implements Command {

	private PilotoAutomatico controle;

	public LigarPilotoAutomatico(PilotoAutomatico lampada) {
		this.controle = lampada;
	}

	@Override
	public void execute() {
		controle.ligar();
	}

}
