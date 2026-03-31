import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        int vowel=0, consonant=0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowel++;
                else
                    consonant++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
