package assigment;

public class TestThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        t1.start(); // Start the thread once
        t1.start(); // Attempting to start it again will result in an exception
    }
}
