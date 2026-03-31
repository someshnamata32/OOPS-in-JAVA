abstract class Employee {
    int eid;
    String name;
    double salary;

    Employee(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    abstract double getSalary();
}

interface Printable {
    void printDetails();
}

class Manager extends Employee implements Printable {

    Manager(int eid, String name, double salary) {
        super(eid, name, salary);
    }

    @Override
    double getSalary() {
        return salary;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + eid);
        System.out.println("Salary: " + getSalary());
    }
}

class Ass5_pr10 {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Somesh", 55000);
        m.printDetails();
        System.out.println("Returned  Salary: " + m.getSalary());
    }
}
