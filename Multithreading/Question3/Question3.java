import java.util.*;
class myThread1 extends Thread {
	int n;
	myThread1(int n){
		this.n = n;
	}
    public void run() {
        for(int i = 1; i <= n; i++) {
            System.out.println("Thread A");
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

class myThread2 extends Thread {
	int m;
	myThread2(int m){
			this.m = m;
	}
    public void run() {
        for(int i = 1; i <= m; i++) {
            System.out.println("Thread B");
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

class myThread3 extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Number " + i);
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

public class pr3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m and n");
		int n = sc.nextInt();
		int m = sc.nextInt();
        myThread1 t1 = new myThread1(n);
        myThread2 t2 = new myThread2(m);
        myThread3 t3 = new myThread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
