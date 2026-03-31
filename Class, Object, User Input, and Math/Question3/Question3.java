import java.util.*;

public class Ass2_pr3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers and an operator (+, -, *, /):");
        int a=sc.nextInt();
        int b=sc.nextInt();
        char op=sc.next().charAt(0);

        switch(op){
            case '+': System.out.println("Sum: " + (a+b)); break;
            case '-': System.out.println("Difference: " + (a-b)); break;
            case '*': System.out.println("Product: " + (a*b)); break;
            case '/': System.out.println("Quotient: " + (a/b)); break;
        }
    }
}
