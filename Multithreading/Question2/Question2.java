import java.util.*;

class myThread extends Thread {
    int m, n;

    myThread(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        System.out.println("Child Thread (Even Numbers)");
        for(int i = m; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println("Child Thread " + i);
            }
        }
    }
}

public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();

        myThread th = new myThread(m, n);
        th.start();

        System.out.println("Main Thread (Odd Numbers)");
        for(int i = m; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.println("Main Thread " + i);
            }
        }
    }
}
