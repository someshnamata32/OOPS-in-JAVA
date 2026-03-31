class AreaCalculator {
    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(int r) {
        return 3.14 * r * r;
    }
}

public class Ass4_pr6 {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        System.out.println(a.calculateArea(5));
        System.out.println(a.calculateArea(4, 6));
        System.out.println(a.calculateArea(3));
    }
}
