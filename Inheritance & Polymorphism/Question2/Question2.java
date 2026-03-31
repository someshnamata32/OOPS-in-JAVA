import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;
    
    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and breadth: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    void area(){
        double area = length*breadth;
        System.out.println("area :"+area);
    }
    
}

class Square extends Rectangle{
    @Override
    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        length = sc.nextInt();
        
    }
    @Override
    void area(){
        System.out.println("area :"+length*length);
    }
}
class Ass5_pr2  {
public static void main(String[] args){
    Rectangle r = new Rectangle();
    r.inputData();
    r.area();
    
    Square s = new Square();
    s.inputData();
    s.area();
    }
}
