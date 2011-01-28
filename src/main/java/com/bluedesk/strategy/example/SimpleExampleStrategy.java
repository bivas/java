package com.bluedesk.strategy.example;

import org.apache.commons.lang.NotImplementedException;

public class SimpleExampleStrategy implements ExampleStrategy {

    public Class<? extends ExampleStrategy> getDiscriminator() {
	return getClass();
    }

    public void execute() {
	throw new NotImplementedException();
    }

}
