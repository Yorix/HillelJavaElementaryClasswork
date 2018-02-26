package lesson11;

public class ExtendCalc extends BaseCalc {

    private int a, b;

    public ExtendCalc(int a, int b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    public int div() {
        return a / b;
    }

    public int sub() {
        return a - b;
    }

    @Override
    public long pow(int a) {
        return a * a * a;
    }

    public long notmalPow() {
        return super.pow(a);
    }
}
