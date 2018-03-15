package lesson13.interface1;

public class Dog implements Animal, Pet {
    @Override
    public void move() {
        System.out.println("Run forward");
    }

    @Override
    public String voice() {
        return "Bark-bark";
    }

    public void lick() {

    }

    @Override
    public void play() {
        System.out.println("Бегать за мячом.");
    }
}
