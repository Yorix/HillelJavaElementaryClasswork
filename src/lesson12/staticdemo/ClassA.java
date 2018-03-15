package lesson12.staticdemo;

public class ClassA {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("bb");
        super.finalize();
    }

    public void print() {
        System.out.println("!!!!!!!!!!");
    }
    public static void doAction() {
        System.out.println("ClassA");
    }
}
