package thread;

public class NumPrint extends Thread {

    public NumPrint() {
        setName("NumPrint");
    }

    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            System.out.print(i + "\t");
        }
    }
}
