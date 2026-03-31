import java.util.Scanner;
 class Ass6_pr2 {

    void insertIntoArray(int a[], int size) {
        Scanner sc = new Scanner(System.in);

        try {
             System.out.print("Enter numbers: ");
                for(int i=0;i<size;i++){
                a[i] = sc.nextInt();
            }

            System.out.print("Array elements: ");
            for(int i=0;i<size;i++){
                System.out.print(a[i]+" ");
            }
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array size exceeded");
        }

        catch(Exception e){
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.print("How many elements you want to store: ");
        int size = sc.nextInt();

        Ass6_pr2 obj = new Ass6_pr2();
        obj.insertIntoArray(arr,size);
    }
}
