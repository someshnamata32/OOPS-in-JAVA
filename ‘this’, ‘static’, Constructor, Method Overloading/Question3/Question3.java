class Student {
    String name;
    int age;
    int roll;
    static int count = 0;

    Student() {
        name = "somesh";
        age = 18;
        roll = 0;
        count++;
    }

    Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        count++;
    }

    void display() {
        System.out.println(name + " " + age + " " + roll);
    }
 
    static void showCount() {
        System.out.println(count);
    }
}

public class Ass4_pr3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 20, 101);
        Student s3 = new Student("Aman", 21, 102);
        s1.display();
        s2.display();
        s3.display();
        Student.showCount();
    }
}
