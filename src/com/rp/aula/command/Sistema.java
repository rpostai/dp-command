package com.rp.aula.command;

public class Sistema {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		ArCondicionadoLigarCommand arligar = new ArCondicionadoLigarCommand(ar);
		ArCondicionadoDesligarCommand ardesligar = new ArCondicionadoDesligarCommand(ar);
		
		Lampadas l = new Lampadas();
		LampadaLigarCommand lligar = new LampadaLigarCommand(l);
		LampadaDesligarCommand ldesligar = new LampadaDesligarCommand(l);
		
		ControleRemoto controle = new ControleRemoto();
		controle.adicionaControles(arligar, ardesligar);
		controle.adicionaControles(lligar, ldesligar);
		
		controle.ligar(1);
		controle.ligar(2);
		controle.desligar(1);
		controle.desligar(2);
		
		controle.desfazer();
	}
	
}
