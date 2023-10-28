package assigment;

public class Testdaemonthread extends Thread {
    public void run() {
        if (isDaemon()) {
            System.out.println("Daemon thread");
        } else {
            System.out.println("Non-Daemon thread");
        }
    }

    public static void main(String[] args) {
    	Testdaemonthread t1 = new Testdaemonthread();
    	Testdaemonthread t2 = new Testdaemonthread();

        t1.setDaemon(true);         t1.start();
        t2.start();
    }
}
