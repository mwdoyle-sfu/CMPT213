package Threading.SingleThread;

public class PrimeThread extends Thread{

    long minPrime;

    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }

    @Override
    public void run() {
    // compute primes larger than minPrime
    }

}
