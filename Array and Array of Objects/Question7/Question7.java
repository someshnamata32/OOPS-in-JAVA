import java.util.Scanner;

class Ass3_pr7 {

    static void inputMatrix(int a[][], int r, int c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements in matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void displayMatrix(int a[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns for matrix 1 and 2:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (r1 != r2 || c1 != c2) {
            System.out.println("Matrix addition not possible");
            return;
        }

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int sum[][] = new int[r1][c1];

        inputMatrix(a, r1, c1);
        inputMatrix(b, r2, c2);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("addition of two matrices:");
        displayMatrix(sum, r1, c1);
    }
}
