package assigment;

public class TwoThread{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        private String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " is starting.");
                Thread.sleep(2000); 
                System.out.println(name + " has finished.");
            } catch (InterruptedException e) {
                System.err.println(name + " was interrupted.");
            }
        }
    }
}

