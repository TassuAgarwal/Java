class PrintEvenOdd {
    private static final Object lock = new Object();
    private static int number = 1;
    private static final int MAX_COUNT = 10;

    static class EvenThread implements Runnable {
        @Override
        public void run() {
            while (number <= MAX_COUNT) {
                synchronized (lock) {
                    if (number % 2 == 0) {
                        System.out.println("Even: " + number);
                        number++;
                    }
                }
            }
        }
    }

    static class OddThread implements Runnable {
        @Override
        public void run() {
            while (number <= MAX_COUNT) {
                synchronized (lock) {
                    if (number % 2 != 0) {
                        System.out.println("Odd: " + number);
                        number++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenThread());
        Thread oddThread = new Thread(new OddThread());

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
