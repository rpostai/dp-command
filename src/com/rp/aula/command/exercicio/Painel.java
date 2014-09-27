package com.rp.aula.command.exercicio;

import java.util.HashMap;
import java.util.Map;

// atua como invoker
public class Painel {

	private static int posicao = 0;

	private Map<Integer, Command> commands = new HashMap();

	public void addCommand(Command c) {
		commands.put(posicao, c);
		posicao++;
	}

	public void executar(int i) {
		commands.get(i).execute();
	}

}
