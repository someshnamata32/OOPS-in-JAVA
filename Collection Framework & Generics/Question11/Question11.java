import java.util.*;

class pr11{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    HashSet<String> set = new HashSet<>();

    System.out.println("Enter 5 names:");

    for(int i=0;i<5;i++){
        set.add(sc.next());
    }

    System.out.print("Enter name to check: ");
    String name = sc.next();

    if(set.contains(name)){
        System.out.println("Exists");
    }
    else{
        System.out.println("Not Found");
    }

    System.out.println("\nAll students:");
    for(String s:set){
        System.out.println(s);
    }

    System.out.print("\nEnter name to remove: ");
    set.remove(sc.next());

    System.out.println("\nFinal list:");
    for(String s:set){
        System.out.println(s);
    }
  }
}
