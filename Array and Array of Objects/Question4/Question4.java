import java.util.Scanner;
class Ass3_pr4{
  void input(int[] arr, int n){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements : ");
    for(int i=0; i<n; i++)
    arr[i]=sc.nextInt();
  }


  void sort(int[] arr, int n){
    for(int i=0; i<n-1; i++){
      for(int j=0; j<n-i-1; j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }

  void display(int[] arr, int n){           System.out.println("sorted array is :");
  for(int i=0; i<n; i++){
    System.out.print(arr[i]+" ");
    }
  }


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of an array.");
    int n = sc.nextInt();
    int[] arr = new int[n];
    Ass3_pr4 a = new Ass3_pr4();
    a.input(arr,n);
    a.sort(arr,n);
    a.display(arr,n);
  }
}
