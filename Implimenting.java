package assigment;

class MyRunnable implements Runnable {
 @Override
 public void run() {
          for (int i = 0; i < 5; i++) {
         System.out.println("Thread is running: " + i);
     }
 }
}

public class Implimenting {
 public static void main(String[] args) {
     Runnable myRunnable = new MyRunnable();

          Thread thread = new Thread(myRunnable);

          thread.start();
 }
}
