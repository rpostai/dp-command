package com.rp.aula.command;

public class ArCondicionadoLigarCommand implements Command {

	private ArCondicionado ar;

	public ArCondicionadoLigarCommand(ArCondicionado ar) {
		super();
		this.ar = ar;
	}

	@Override
	public void execute() {
		ar.ligar();
	}

	@Override
	public void rollback() {
		ar.desligar();
	}

}
