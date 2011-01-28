package com.example.strategy;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStrategyHolder<K, S extends Strategy<K>>
	implements StrategyHolder<S> {

    private final Map<K, S> strategies = new HashMap<K, S>();

    protected abstract S getDefaultStrategy(K type);

    protected AbstractStrategyHolder(final S... strategies) {
	for (final S strategy : strategies) {
	    final K discriminator = strategy.getDiscriminator();
	    this.strategies.put(discriminator, strategy);
	}
    }

    public S getStrategy(final K type) {
	S result = strategies.get(type);
	if (result == null) {
	    result = getDefaultStrategy(type);
	}
	return result;
    }

}
