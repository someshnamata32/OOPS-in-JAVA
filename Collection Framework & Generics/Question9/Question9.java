import java.util.*;

class pr9{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    HashMap<Integer,String> map = new HashMap<>();

    System.out.println("Enter details of 3 students");

    for(int i=0;i<3;i++){
        int roll = sc.nextInt();
        String name = sc.next();
        map.put(roll,name);
    }

    System.out.println("\nStudent details:");
    for(Integer r : map.keySet()){
        System.out.println(r+" "+map.get(r));
    }

    System.out.println("\nEnter roll and name to add new student:");
    int r = sc.nextInt();
    String n = sc.next();
    map.put(r,n);

    ArrayList<Integer> rollList = new ArrayList<>();

    for(Integer roll : map.keySet()){
        rollList.add(roll);
    }

    System.out.println("\nRoll numbers:");
    for(Integer roll : rollList){
        System.out.println(roll);
    }

    System.out.println("\nStudent names:");
    for(String name : map.values()){
        System.out.println(name);
    }

    System.out.println("\nEnter name to search:");
    String search = sc.next();

    boolean found = false;
    for(Integer roll : map.keySet()){
        if(map.get(roll).equals(search)){
            System.out.println("Found at roll: "+roll);
            found = true;
        }
    }

    if(!found){
        System.out.println("Student not found");
    }

    System.out.println("\nEnter roll to update:");
    int roll = sc.nextInt();
    String newName = sc.next();
    map.put(roll,newName);

    System.out.println("\nEnter roll to remove:");
    map.remove(sc.nextInt());

    System.out.println("\nFinal list:");
    for(Integer key : map.keySet()){
        System.out.println(key+" "+map.get(key));
    }
  }
}
