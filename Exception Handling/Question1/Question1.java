import java.util.*;
 class Ass6_pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            int result = a / b; 

            System.out.println("Result = " + result);
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
