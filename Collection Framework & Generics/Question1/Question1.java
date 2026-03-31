import java.util.*;

class DescComparator implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return b - a;
    }
}

class pr1{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList <Integer> list = new ArrayList<>();

    System.out.println("Enter the elements:");
    for(int i=0; i<10; i++){
      list.add(sc.nextInt());
    }

    System.out.println("display by for loop");
    for(int i = 0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
    }

    System.out.println("\ndisplay by for each loop");
    for(int n : list){
        System.out.print(n+" ");
    }

    System.out.println("\ndisplay by for each method");
    list.forEach(n -> System.out.print(n+" "));

    System.out.println("\ndisplay by Iterator");
    Iterator<Integer> it = list.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }

    System.out.println("\nupdate 100 in index 4");
    list.set(4,100);
    System.out.println(list);

    System.out.println("\ninsert 500 in index 6");
    list.add(6,500);
    System.out.println(list);

    System.out.println("\nremove index 2");
    list.remove(2);
    System.out.println(list);

    System.out.println("\nremove the data 100");
    list.remove(Integer.valueOf(100));
    System.out.println(list);

    System.out.println("\nindex of 500 is "+list.indexOf(500));

    System.out.println("\nAscending order:");
    Collections.sort(list);
    System.out.println(list);

    System.out.println("\nDescending order (using Comparator):");
    Collections.sort(list, new DescComparator());
    System.out.println(list);

    System.out.println("\nEnter k integer:");
    int k = sc.nextInt();

    Collections.sort(list);

    if(k>0 && k<=list.size()){
        System.out.println("kth largest number is : "+list.get(list.size()-k));
    }
    else{
        System.out.println("Invalid number");
    }
  }
}
