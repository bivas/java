package com.example.strategy;

final class ExampleStrategyHolderImpl
	extends
	AbstractStrategyHolder<Class<? extends ExampleStrategy>, ExampleStrategy>
	implements ExampleStrategyHolder {

    ExampleStrategyHolderImpl(final ExampleStrategy... protobufStrategies) {
	super(protobufStrategies);
    }

    @Override
    protected ExampleStrategy getDefaultStrategy(
	    final Class<? extends ExampleStrategy> type) {
	throw new IllegalStateException(
		"No matching strategy found for type = " + type.getSimpleName());
    }

}
