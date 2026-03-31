abstract class Employee {
    String name;
    int employeeId;
    double baseSalary;

    Employee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    int teamSize;
    int projectManaged;

    Manager(String name, int employeeId, double baseSalary, int teamSize, int projectManaged) {
        super(name, employeeId, baseSalary);
        this.teamSize = teamSize;
        this.projectManaged = projectManaged;
    }

    @Override
    double calculateSalary() {
        return baseSalary + (teamSize * 1000) + (projectManaged * 2000);
    }

    @Override
    void displayDetails() {
        System.out.println("---Manager Details---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Projects Managed: " + projectManaged);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Engineer extends Employee {
    String programmingLanguage;
    int yearsOfExperience;

    Engineer(String name, int employeeId, double baseSalary, String programmingLanguage, int yearsOfExperience) {
        super(name, employeeId, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    double calculateSalary() {
        return baseSalary + (yearsOfExperience * 500);
    }

    @Override
    void displayDetails() {
        System.out.println("---Engineer Details---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Ass5_pr7 {
    public static void main(String[] args) {
        Employee m = new Manager("Somesh", 101, 45000, 5, 2);
        m.displayDetails();
        System.out.println();
        Employee e = new Engineer("Someshwar", 102, 34000, "Java", 3);
        e.displayDetails();
    }
}
