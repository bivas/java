package com.bluedesk.strategy;

public interface StrategyHolder<D, S extends Strategy<D>> {

    public S getStrategy(D type);
}
