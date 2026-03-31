import java.util.Scanner;

class Ass3_pr8 {

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
        System.out.println("enter rows and columns for matric 1 and 2:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c2];

        inputMatrix(a, r1, c1);
        inputMatrix(b, r2, c2);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("matrix multiplication of two matrices:");
        displayMatrix(c, r1, c2);
    }
}
