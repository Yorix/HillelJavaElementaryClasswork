package lesson12.staticdemo;

public class Main {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassA classB = new ClassB();
        ClassA classC = new ClassC();

        classA.doAction();
        classB.doAction();
        classC.doAction();
    }
}
