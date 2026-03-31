interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

class DemoCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class Ass5_pr8 {
    public static void main(String[] args) {

        Calculator c = new DemoCalculator();

        System.out.println("Addition: " + c.add(10, 5));
        System.out.println("Subtraction: " + c.sub(10, 5));
        System.out.println("Multiplication: " + c.mul(10, 5));
        System.out.println("Division: " + c.div(10, 5));
    }
}
