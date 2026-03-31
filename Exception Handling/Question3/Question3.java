import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class Ass6_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if(age < 0 || age > 120){
                throw new InvalidAgeException("Age is not valid");
            }

            System.out.println("Valid age");
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
