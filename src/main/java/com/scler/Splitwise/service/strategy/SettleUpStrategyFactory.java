package com.scler.Splitwise.service.strategy;

public class SettleUpStrategyFactory {

    public static SettleUpStrategy getSettleUpStrategy(SettleUpStrategyType strategyName)
    {
        return new HeapBasedSettleUpStrategy();
    }
}
