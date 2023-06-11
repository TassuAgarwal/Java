class SleepJoinExample {
    static class MyThread extends Thread {
        private String name;
        private int sleepTime;

        public MyThread(String name, int sleepTime) {
            this.name = name;
            this.sleepTime = sleepTime;
        }

        public void run() {
            System.out.println(name + " started");
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " finished");
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1", 2000);
        MyThread thread2 = new MyThread("Thread 2", 4000);
        MyThread thread3 = new MyThread("Thread 3", 3000);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads finished execution");
    }
}
