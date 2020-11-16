import java.util.ArrayList;
import java.util.List;

public class Firstpp {
    public static final int x = 100000;
    public static final int y = 100000;
    private static Share ShreObj;
    private static List<Plus> PlusList;
    private static List<Minus> MinusList;

    public static void main(String[] args) {
        long u2 = System.currentTimeMillis();

        ShreObj = new Share();
        PlusList = new ArrayList<>();
        MinusList = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            Plus threadInc = new Plus(ShreObj);
            PlusList.add(threadInc);
            threadInc.start();
            try {
                threadInc.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int j = 0; j < y; j++) {
            Minus threadDec = new Minus(ShreObj);
            MinusList.add(threadDec);
            threadDec.start();
            try {
                threadDec.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long u1 = System.currentTimeMillis();
        System.out.println(ShreObj.getCounter());
        System.out.println(u1-u2);
    }
}
