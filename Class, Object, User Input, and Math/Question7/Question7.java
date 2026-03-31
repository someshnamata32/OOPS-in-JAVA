import java.util.Scanner;

public class Ass2_pr7 {

    void binary(int n){
        String b="";

        while(n>0){
            b=(n%2)+b;
            n=n/2;
        }

        System.out.println("Binary = "+b);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n=sc.nextInt();

        Ass2_pr7 obj=new Ass2_pr7();
        obj.binary(n);
    }
}
