package com.rp.aula.command;

public class ArCondicionadoDesligarCommand implements Command {

	private ArCondicionado ar;

	public ArCondicionadoDesligarCommand(ArCondicionado ar) {
		super();
		this.ar = ar;
	}

	@Override
	public void execute() {
		ar.desligar();
	}

	@Override
	public void rollback() {
		ar.ligar();
	}
	
	

}
