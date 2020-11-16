public class Plus extends Thread {
    private Share sharedObject;

    public Plus() {}

    public Plus(Share so) {
        this.sharedObject = so;
    }

    @Override
    public void run() {
        sharedObject.inc();
    }
}
