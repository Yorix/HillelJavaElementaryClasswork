package lesson13.interface1;

public class Elephant implements Animal {
    @Override
    public void move() {
        System.out.println("Move as giant");
    }

    @Override
    public String voice() {
        return "Horn loudly!";
    }
}
