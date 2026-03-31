import java.util.Scanner;
class Ass3_pr6{

  void input(int[] arr , int n){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements :");
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
  }

  void reverseArray(int arr[]){
    System.out.println("reverse of array is :");
    int n = arr.length-1,j=0;
    for(int i=n; i>n/2; i--){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      j++;
    }
  }

  void display(int[] arr, int n){
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    Ass3_pr6 a = new Ass3_pr6();
    a.input(arr,n);
    a.reverseArray(arr);
    a.display(arr,n);
  }
}
