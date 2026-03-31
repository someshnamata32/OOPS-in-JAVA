import java.util.Scanner;

public class Ass2_pr5 {

    int fact(int n){
        int f=1,i=1;

        while(i<=n){
            f=f*i;
            i++;
        }

        return f;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter x: ");
        int x=sc.nextInt();

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        Ass2_pr5 obj=new Ass2_pr5();

        double sum=1;
        int i=1;

        while(i<=n){
            sum=sum+Math.pow(x,i)/obj.fact(i);
            i++;
        }

        System.out.println("Sum = "+sum);
    }
}
