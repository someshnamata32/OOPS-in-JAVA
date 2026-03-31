class Student {
    static int nextId = 100;
    int rollNumber;
    String name;

    Student(String name) {
        this.name = name;
        rollNumber = nextId++;
    }

    void display() {
        System.out.println(name + " " + rollNumber);
    }
}

public class Ass4_pr4 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        s1.display();
        s2.display();
    }
}
