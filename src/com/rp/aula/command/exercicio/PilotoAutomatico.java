package com.rp.aula.command.exercicio;

// atua como receiver
public class PilotoAutomatico {

	private boolean estado;

	public PilotoAutomatico() {
		this.estado = false;
	}

	public void ligar() {
		estado = true;
		System.out.println("Ligando Piloto Autom�tico");
	}

	public void desligar() {
		System.out.println("Desligando Piloto Autom�tico");
		estado = false;
	}

}
