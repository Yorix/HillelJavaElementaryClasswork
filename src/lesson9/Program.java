package lesson9;

public class Program {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet bird = new Bird();
        Pet dog = new Dog();

//        Pet[] pets = new Pet[] {cat, dog, bird};
//        for (Pet pet : pets) {
//            pet.move();
//        }
//
//        Pet pet = new Dog();
//        pet.voice();

        System.out.println(LittleCat.getCount());

        for (int i = 0, rnd = (int) (Math.random() * 20); i < rnd; i++) {
            new LittleCat("Boris" + i, i);
        }
        LittleCat cat1 = new LittleCat("Boris", 10);
        LittleCat cat2 = new LittleCat("Murka", 10);
        LittleCat cat3 = new LittleCat("Murka", 10);

        System.out.println(LittleCat.getCount());
    }
}
