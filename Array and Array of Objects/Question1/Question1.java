import java.util.Scanner;
class Ass3_pr1{
  public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    System.out.println("enter data in a array: ");
    for(int i=0 ; i<10; i++){
      arr[i]=sc.nextInt();
    }
  System.out.println("the elements are : ");
  for(int i =0; i<10; i++){
    System.out.print(arr[i]+" ");
  }
  }
}
