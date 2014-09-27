package com.rp.aula.command;

public interface Command {
	void execute();
	void rollback();
}
