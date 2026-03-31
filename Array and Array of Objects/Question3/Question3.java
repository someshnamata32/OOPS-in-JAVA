import java.util.Scanner;
class Ass3_pr3{
  void input(int[] a, int n){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter elements in array:");
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
  }

  void display(int[] arr, int n){
    System.out.println("elements are:");
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args){
    int flag=0,key,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    Ass3_pr3 a = new Ass3_pr3();
    a.input(arr,n);
    a.display(arr,n);
    System.out.println("\nenter key:");
    key = sc.nextInt();
    for(i=0; i<n; i++){
      if(arr[i]==key)
      flag=1;
    }
    if(flag==1)
    System.out.println("element is present in array.");
    else
    System.out.println("elemet is not presenet in the array.");
  }
}
