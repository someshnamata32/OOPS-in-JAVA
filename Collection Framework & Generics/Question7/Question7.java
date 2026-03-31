import java.util.*;

class pr7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    System.out.println("Enter 5 numbers:");
    for(int i=0;i<5;i++){
        pq.add(sc.nextInt());
    }

    System.out.println("Priority Queue:");
    for(int n:pq){
        System.out.print(n+" ");
    }

    System.out.println("\nHead element: "+pq.peek());

    pq.remove();
    System.out.println("After removing head:");
    for(int n:pq){
        System.out.print(n+" ");
    }

    System.out.println("\nEnter a number to remove:");
    int num=sc.nextInt();
    pq.remove(num);

    System.out.println("After removing element:");
    for(int n:pq){
        System.out.print(n+" ");
    }

    if(pq.contains(10)){
        System.out.println("\nQueue contains 10");
    }
    else{
        System.out.println("\nQueue does not contain 10");
    }
  }
}
