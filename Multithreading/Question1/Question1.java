import java.util.*;

class myThread implements Runnable {
    public void run() {
        System.out.println("Child Thread started");
        for(int i = 1; i <= 10; i++) {
            System.out.println("Thread " + i);
        }
    }
}

public class pr1 {
    public static void main(String[] args) {
        myThread th = new myThread();
        Thread t = new Thread(th);
        t.start();

        System.out.println("Main Thread finished");
    }
}
