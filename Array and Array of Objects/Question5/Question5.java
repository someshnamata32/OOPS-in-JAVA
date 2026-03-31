import java.util.Scanner;
class Ass3_pr5{

  void input(int[] arr, int n){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements: ");
    for(int i=0; i<n; i++){
      arr[i]= sc.nextInt();
    }
  }

  public int findMax(int[] nums , int  n){
    int max = nums[0];
    for(int i=0; i<n; i++){
      if(nums[i]>max){
        max=nums[i];
      }
    }
    return max;
  }
   
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    Ass3_pr5 a = new Ass3_pr5();
    a.input(arr,n);
    System.out.println("the largest element of an array is :"+a.findMax(arr,n));
   }
}
