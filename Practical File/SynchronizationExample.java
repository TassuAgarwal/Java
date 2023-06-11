class SynchronizationExample {
    private int count = 0;
    private static final int MAX_COUNT = 100000;

    // Synchronized method
    private synchronized void incrementCount() {
        count++;
    }

    // Synchronized block
    private void decrementCount() {
        synchronized (this) {
            count--;
        }
    }

    public void performIncrement() {
        for (int i = 0; i < MAX_COUNT; i++) {
            incrementCount();
        }
    }

    public void performDecrement() {
        for (int i = 0; i < MAX_COUNT; i++) {
            decrementCount();
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();

        Thread incrementThread = new Thread(() -> example.performIncrement());
        Thread decrementThread = new Thread(() -> example.performDecrement());

        incrementThread.start();
        decrementThread.start();

        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tassu Agarwal");
        System.out.println("09429802021");
        System.out.println("Final Count: " + example.getCount());
    }
}
