package com.rp.aula.command;

public class LampadaLigarCommand implements Command {
	
	private Lampadas lampadas;
	
	public LampadaLigarCommand(Lampadas l) {
		this.lampadas = l;
	}

	@Override
	public void execute() {
		lampadas.ligarLampadas();
	}

	@Override
	public void rollback() {
		lampadas.desligarLampadas();
	}
}
