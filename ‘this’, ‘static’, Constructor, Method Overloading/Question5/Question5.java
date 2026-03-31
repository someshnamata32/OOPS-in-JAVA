class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this(name);
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Ass4_pr5 {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit");
        Student s2 = new Student("Aman", 21);
        s1.display();
        s2.display();
    }
}
