import java.util.*;

class myThread1 extends Thread {
    int num;
    int square;

    myThread1(int num) {
        this.num = num;
    }

    public void run() {
        square = num * num;
        System.out.println("Square = " + square);
    }

    public int getSquare() {
        return square;
    }
}

public class pr5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        myThread1 t1 = new myThread1(num);
        t1.start();

        t1.join(); 

        int square = t1.getSquare();

        int fact = 1;
        for(int i = 1; i <= square; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}
