import java.util.Scanner;

public class Ass2_pr8 {

    double bmi(double w,double h){
        return w/(h*h);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double w=sc.nextDouble();

        System.out.print("Enter height (m): ");
        double h=sc.nextDouble();

        Ass2_pr8 obj=new Ass2_pr8();

        double b=obj.bmi(w,h);

        System.out.println("BMI = "+b);

        if(b<18.5)
            System.out.println("Underweight");
        else if(b<=25)
            System.out.println("Normal");
        else if(b<=30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
