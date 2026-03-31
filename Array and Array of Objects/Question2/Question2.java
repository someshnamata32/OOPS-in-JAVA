import java.util.Scanner;

class Ass3_pr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("enter elements in an array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Even:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }

        System.out.println("\nOdd:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                System.out.print(a[i] + " ");
        }
    }
}
