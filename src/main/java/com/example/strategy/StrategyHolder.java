package com.example.strategy;

public interface StrategyHolder<S extends Strategy<?>> {

    public S getStrategy(Class<? extends S> type);
}
