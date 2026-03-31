import java.util.*;

class pr10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter elements:");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int num : arr){
        if(map.containsKey(num)){
            map.put(num, map.get(num)+1);
        }
        else{
            map.put(num,1);
        }
    }

    System.out.println("Frequencies:");
    for(Integer key : map.keySet()){
        System.out.println(key+" -> "+map.get(key));
    }
  }
}
