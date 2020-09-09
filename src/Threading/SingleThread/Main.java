package Threading.SingleThread;

public class Main {
    public static void main(String[] args) {

        // two ways to use threading both are valid ways to run threads.
        // However, implementing runnable (method 2) allows your class to extend other classes

        // method 1
        PrimeThread p = new PrimeThread(143);
        p.start();

        // method 2
        PrimeRun q = new PrimeRun(143);
        Thread t = new Thread(q);
        t.start();


    }
}
