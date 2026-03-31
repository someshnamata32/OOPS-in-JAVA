import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed string: " + rev);

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        if(str.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        if(str == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        int s1 = str.compareTo(rev);
        if(s1 == 0)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome"); 
    }
}
