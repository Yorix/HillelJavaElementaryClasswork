package lesson9;

public class Bird extends Pet {
    private boolean canSpeak;

    public boolean getCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    @Override
    public void move() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void voice() {
        System.out.println("");
    }
}
