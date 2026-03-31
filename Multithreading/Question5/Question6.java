class myThread extends Thread {
    public void run() {
        System.out.println("Child Thread (Numbers)");
        for(int i = 1; i <= 10; i++) {
            System.out.println("Number " + i);
        }
    }
}
import java.util.*;

class myThread1 extends Thread {
    int num;

    myThread1(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square Thread running");
        System.out.println("Square = " + (num * num));
    }
}


public class pr5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();

        myThread1 t1 = new myThread1(num);
         t1.start();

			int fact = 1;
			for(int i = 1; i <= num; i++) {
				fact *= i;
			}
        System.out.println("Factorial Thread running");
        System.out.println("Factorial = " + fact);
		}
    }

public class pr5 {
    public static void main(String[] args) throws Exception {
        myThread t = new myThread();
        t.start();

        t.join(); 

        System.out.println("Main Thread (Characters)");
        for(char c = 'A'; c <= 'J'; c++) {
            System.out.println("Char " + c);
        }
    }
}
