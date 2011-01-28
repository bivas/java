package com.bluedesk.strategy.example;

import com.bluedesk.strategy.Strategy;

public interface ExampleStrategy extends
	Strategy<Class<? extends ExampleStrategy>> {

    public void execute();
}
