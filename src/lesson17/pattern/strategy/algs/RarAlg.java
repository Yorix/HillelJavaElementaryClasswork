package lesson17.pattern.strategy.algs;

public class RarAlg implements Compress {

    @Override
    public void encode(String text) {
        System.out.println("RAR compressing demo algorithm for input text: \n" + text);
        System.out.println("After compression result is: ");
        System.out.println(text.substring(0, text.length() - 3));
        System.out.println();
    }
}
