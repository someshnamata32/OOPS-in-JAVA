import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length: " + str.length());

        if(str.length() > 4)
            System.out.println("Character at index 4: " + str.charAt(4));
        else
            System.out.println("Index 4 not available");

        System.out.println("First index of a: " + str.indexOf('a'));
        System.out.println("Last index of a: " + str.lastIndexOf('a'));

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();

        System.out.println("Case sensitive comparison: " + str.equals(str2));
        System.out.println("Case insensitive comparison: " + str.equalsIgnoreCase(str2));
        int s1 = str.compareTo(str2);
        if(s1 == 0)       
          System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");
        if(str == str2)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}
