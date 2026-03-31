import java.util.*;

public class Ass2_pr2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Maximum: " + Math.max(x,y));
        System.out.println("Minimum: " + Math.min(x,y));
        System.out.println("Power: " + Math.pow(x,y));
        System.out.println("Square root of first number: " + Math.sqrt(x));
        System.out.println("Random number between 10 and 100: " + (int)(Math.random()*91+10));
    }
}
