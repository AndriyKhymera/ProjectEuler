import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Task_10 {

    private static final int MAX = 2_000_000;

    private static ArrayList<Integer> primeNumbers = new ArrayList<>();
    private static int THREAD_AMOUNT = 10;

    private static long sum = 2;
    private static int num = 2;


    public static void main(String[] args) {


        primeNumbers.add(2);
        Executor executor = Executors.newFixedThreadPool(10);

        long startTime = System.nanoTime();
        for (int i = 0; i < THREAD_AMOUNT; i++) {
            executor.execute(() -> {
                while (num <= MAX) {
                    if (isPrime(num)) {
                        addToSum((long) num);
                    }
                    increaseCounter();
                }
            });
        }

        resultTest(sum);
        System.out.println("Sum: " + sum);
        System.out.println("Taken time: " + (System.nanoTime() - startTime));
    }

    private static synchronized void increaseCounter() {
        ++num;
    }

    private static synchronized void addToSum(long number) {
        sum += number;
    }

    private static synchronized boolean isPrime(final int number) {
        if (primeNumbers.stream().anyMatch(prime -> number % prime == 0)) {
            return false;
        }
        primeNumbers.add(number);
        return true;
    }

    private static void resultTest(long sum) {
        long rightSum = 142913828922L;

        assert (rightSum == sum);
    }

}
