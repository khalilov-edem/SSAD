public class Minus extends Thread {
    private Share sharedObject;

    public Minus() {}

    public Minus(Share so) {
        this.sharedObject = so;
    }

    @Override
    public void run() {
        sharedObject.dec();
    }
}
