public class Share {
    private volatile int counter = 0;

    public int getCounter() {
        return counter;
    }
    public void inc() {
        counter++;
    }

    public void dec() {
        counter--;
    }
}
