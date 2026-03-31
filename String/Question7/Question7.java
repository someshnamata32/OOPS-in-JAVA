import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        for(String w : words){
            StringBuffer sb = new StringBuffer(w);
            System.out.print(sb.reverse() + " ");
        }
    }
}
