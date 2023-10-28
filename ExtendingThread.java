package assigment;

class MyThread extends Thread {
    @Override
    public void run() {
                for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); 
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); 
        myThread.start(); 
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(1000); 
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
