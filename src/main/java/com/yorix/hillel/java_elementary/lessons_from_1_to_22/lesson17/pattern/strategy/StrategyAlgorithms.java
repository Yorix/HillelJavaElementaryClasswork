package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson17.pattern.strategy;

import com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson17.pattern.strategy.algs.Compress;

public class StrategyAlgorithms {
    private Compress algorithm;

    public StrategyAlgorithms(Compress algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Compress algorithm) {
        this.algorithm = algorithm;
    }

    public Compress getAlgorithm() {
        return algorithm;
    }
}
