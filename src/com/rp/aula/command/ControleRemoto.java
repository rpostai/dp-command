package com.rp.aula.command;

import java.util.HashMap;
import java.util.Map;

public class ControleRemoto {

	private Map<Integer, Pair> opcoes = new HashMap<Integer, ControleRemoto.Pair>();
	Command ultimoCommando;

	public void adicionaControles(Command ligar, Command desligar) {
		int i = opcoes.size()+1;
		opcoes.put(i, new Pair(ligar, desligar));
	}

	public void ligar(int posicao) {
		opcoes.get(posicao).ligar.execute();
		ultimoCommando = opcoes.get(posicao).ligar;
	}

	public void desligar(int posicao) {
		opcoes.get(posicao).desligar.execute();
		ultimoCommando = opcoes.get(posicao).desligar;
	}
	
	public void desfazer() {
		ultimoCommando.rollback();
	}

	private static class Pair {
		Command ligar;
		Command desligar;

		public Pair(Command ligar, Command desligar) {
			super();
			this.ligar = ligar;
			this.desligar = desligar;
		}

	}
}
