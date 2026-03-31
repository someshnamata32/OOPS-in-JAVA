abstract class Shape{
    int sideOne;
    int sideTwo;
    abstract void setData(int x,int y);
    abstract void calculateArea();
    Shape(String ShapeName){
        System.out.println(ShapeName+" object is created.");
    }
}
class Rectangle extends Shape{
    Rectangle(){
        super("Rectangle");
    }
    @Override
    void setData(int x,int y){
        sideOne=x;
        sideTwo=y;
    }
    @Override
    void calculateArea(){
        System.out.println("Area of Rectangle is "+sideOne*sideTwo);
    }
}
class Triangle extends Shape{
    Triangle(){
        super("Triangle");
    }
    @Override
    void setData(int x, int y){
        sideOne=x;
        sideTwo=y;
    }
    @Override
    void calculateArea(){
        System.out.println("Area of Triangle is "+0.5*sideOne*sideTwo);
    }
}

class Ass5_pr6{
    public static void main(String[] args){
        Shape obj1 = new Rectangle();
        obj1.setData(4,5);
        obj1.calculateArea();
        Shape obj2 = new Triangle();
        obj2.setData(6,2);
        obj2.calculateArea();
    }
}
