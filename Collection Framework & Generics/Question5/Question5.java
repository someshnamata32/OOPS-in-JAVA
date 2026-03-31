import java.util.*;

class pr5{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    LinkedList<String> list = new LinkedList<>();

    System.out.println("Enter 5 colors:");

    for(int i=0;i<5;i++){
        list.add(sc.next());
    }

    for(String s:list){
        System.out.print(s+" ");
    }

    System.out.println("\nInsert at beginning:");
    list.addFirst(sc.next());
    for(String s:list){
        System.out.print(s+" ");
    }

    System.out.println("\nInsert at position 3:");
    list.add(2,sc.next());
    for(String s:list){
        System.out.print(s+" ");
    }

    System.out.println("\nReplace index 2:");
    list.set(2,sc.next());
    for(String s:list){
        System.out.print(s+" ");
    }

    System.out.println("\nRemove index 4:");
    list.remove(4);
    for(String s:list){
        System.out.print(s+" ");
    }

    System.out.println("\nFirst color: "+list.getFirst());
    System.out.println("Last color: "+list.getLast());

    System.out.println("Remove first and last:");
    list.removeFirst();
    list.removeLast();

    for(String s:list){
        System.out.print(s+" ");
    }
  }
}
