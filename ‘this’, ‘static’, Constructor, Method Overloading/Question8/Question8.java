class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static double distance(Point p1, Point p2) {
        return Math.sqrt(
                Math.pow(p2.x - p1.x, 2) +
                Math.pow(p2.y - p1.y, 2)
        );
    }
}

public class Ass4_pr8 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);
        System.out.println("Distance : "+Point.distance(p1, p2));
    }
}
