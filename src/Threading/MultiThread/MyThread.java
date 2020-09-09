package Threading.MultiThread;

public class MyThread implements Runnable{
    // thread starts on class instantiation
    Thread thrd;

    // Construct a new thread
    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start(); // start the thread
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting. ");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);  // must use try catch bc of this line
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }

        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }


}
