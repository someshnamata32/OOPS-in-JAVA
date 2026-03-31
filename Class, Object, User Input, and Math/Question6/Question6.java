import java.util.Scanner;

public class Ass2_pr6 {

    boolean isPalindrome(int num){
        int rev = 0;
        int temp = num;

        while(num > 0){
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }

        if(temp == rev)
            return true;
        else
            return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Ass2_pr6 obj = new Ass2_pr6();

        if(obj.isPalindrome(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
