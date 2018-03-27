package lesson17.pattern.strategy;

import lesson17.pattern.strategy.algs.Compress;

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
