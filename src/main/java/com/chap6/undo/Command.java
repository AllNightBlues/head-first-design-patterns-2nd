package com.chap6.undo;

public interface Command {

	void execute();

	void undo();

}
