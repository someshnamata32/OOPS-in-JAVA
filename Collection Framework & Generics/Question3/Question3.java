import java.util.*;

class pr3{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();

    System.out.println("Enter 5 integers to push into stack:");

    for(int i=0;i<5;i++){
        System.out.print("Enter number "+(i+1)+": ");
        stack.push(sc.nextInt());
    }

    System.out.println("\nStack elements:");
    for(int n:stack){
        System.out.print(n+" ");
    }

    System.out.println("\n\nPop element:");
    System.out.println("Popped element: "+stack.pop());

    System.out.print("\nEnter number to search: ");
    int num = sc.nextInt();

    if(stack.contains(num)){
        System.out.println("Number found in stack");
    }
    else{
        System.out.println("Number not found");
    }

    System.out.println("\nTop element (peek): "+stack.peek());

    System.out.println("\nFinal stack:");
    for(int n:stack){
        System.out.print(n+" ");
    }
  }
}
