package com.bluedesk.strategy.example;

import com.bluedesk.strategy.AbstractStrategyHolder;

final class ExampleStrategyHolderImpl
	extends
	AbstractStrategyHolder<Class<? extends ExampleStrategy>, ExampleStrategy>
	implements ExampleStrategyHolder {

    ExampleStrategyHolderImpl(final ExampleStrategy... exampleStrategies) {
	super(exampleStrategies);
    }

    @Override
    protected ExampleStrategy getDefaultStrategy(
	    final Class<? extends ExampleStrategy> type) {
	throw new IllegalStateException(
		"No matching strategy found for type = " + type.getSimpleName());
    }

}
