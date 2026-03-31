import java.util.*;

class pr4{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();

    System.out.print("Enter parentheses string: ");
    String str = sc.nextLine();

    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);

        if(ch=='('){
            stack.push(ch);
        }
        else if(ch==')'){
            if(stack.isEmpty()){
                System.out.println("Not Balanced");
                return;
            }
            stack.pop();
        }
    }

    if(stack.isEmpty()){
        System.out.println("Balanced");
    }
    else{
        System.out.println("Not Balanced");
    }
  }
}
