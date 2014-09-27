package com.rp.aula.command.exercicio;

public class DesligarPilotoAutomatico implements Command {

	private PilotoAutomatico controle;

	public DesligarPilotoAutomatico(PilotoAutomatico lampada) {
		this.controle = lampada;
	}

	@Override
	public void execute() {
		controle.desligar();
	}

}
