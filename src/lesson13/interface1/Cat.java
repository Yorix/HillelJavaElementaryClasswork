package lesson13.interface1;

public class Cat implements Animal, Pet {
    @Override
    public void move() {
        System.out.println("Move forward");
    }

    @Override
    public String voice() {
        return "Meow!";
    }

    public void sleep() {

    }

    @Override
    public void play() {
        System.out.println("Бежать за верёвкой.");
    }
}
