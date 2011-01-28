package com.example.strategy;

public interface ExampleStrategy extends
	Strategy<Class<? extends ExampleStrategy>> {

    public void execute();
}
