import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        sb.append(" JAVA");
        System.out.println(sb);

        sb.insert(4,"ABCD");
        System.out.println(sb);

        sb.delete(10,14);
        System.out.println(sb);

        int index = sb.indexOf("ABCD");
        if(index!=-1)
            sb.replace(index,index+4,"WXYZ");

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
