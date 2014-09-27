package com.rp.aula.command;

public class LampadaDesligarCommand implements Command {
	
	private Lampadas lampadas;
	
	public LampadaDesligarCommand(Lampadas l) {
		this.lampadas = l;
	}

	@Override
	public void execute() {
		lampadas.desligarLampadas();
	}

	@Override
	public void rollback() {
		lampadas.ligarLampadas();
	}
}
