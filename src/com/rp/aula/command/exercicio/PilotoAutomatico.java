package com.rp.aula.command.exercicio;

// atua como receiver
public class PilotoAutomatico {

	private boolean estado;

	public PilotoAutomatico() {
		this.estado = false;
	}

	public void ligar() {
		estado = true;
		System.out.println("Ligando Piloto Automático");
	}

	public void desligar() {
		System.out.println("Desligando Piloto Automático");
		estado = false;
	}

}
