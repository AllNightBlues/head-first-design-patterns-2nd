package com.chap6.undo;

public interface Command {
	public void execute();
	public void undo();
}
