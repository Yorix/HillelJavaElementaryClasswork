package lesson17.pattern.strategy;

import lesson17.pattern.strategy.algs.RarAlg;
import lesson17.pattern.strategy.algs.SevenZipAlg;
import lesson17.pattern.strategy.algs.ZipAlg;

public class MainProgram {
    public static void main(String[] args) {
        StrategyAlgorithms strategy = new StrategyAlgorithms(new RarAlg());

        strategy.getAlgorithm().encode("Some Text for compression");

        strategy.setAlgorithm(new SevenZipAlg());
        strategy.getAlgorithm().encode("Some Text for compression");

        strategy.setAlgorithm(new ZipAlg());
        strategy.getAlgorithm().encode("Some Text for compression");
    }
}
