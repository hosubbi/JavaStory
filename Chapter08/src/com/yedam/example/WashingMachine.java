package com.yedam.example;

public interface WashingMachine extends DryFunction{
	public void start();
	public void stop();
	public void end();
	public int speedChange(int speed);
}
