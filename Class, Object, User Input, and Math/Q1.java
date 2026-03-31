import java.util.*;

public class Ass2_pr1 {
    void greet(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();

        Ass2_pr1 obj=new Ass2_pr1();
        obj.greet(name);
    }
}
