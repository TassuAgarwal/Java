class NumberPrinter implements Runnable {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter(1, 5));
        thread1.setName("Thread 1");
        thread1.setPriority(Thread.MIN_PRIORITY);

        Thread thread2 = new Thread(new NumberPrinter(6, 10));
        thread2.setName("Thread 2");
        thread2.setPriority(Thread.NORM_PRIORITY);

        Thread thread3 = new Thread(new NumberPrinter(11, 15));
        thread3.setName("Thread 3");
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
