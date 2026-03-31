import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + age + " " + salary);
    }

    @Override
    public String toString() {
        return name + " " + age + " " + salary;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<>();
        double sum = 0;

        System.out.println("Enter 5 employees :");
        for (int i = 0; i < 5; i++) {
            emp.add(new Employee(sc.next(), sc.nextInt(), sc.nextDouble()));
        }

        System.out.println("\nEmployee details:");
        for (Employee e : emp) {
            e.display();
            sum += e.salary;
        }

        System.out.println("\nAverage salary is " + sum / emp.size());

        Employee hpe = emp.get(0);
        for (Employee em : emp) {
            if (em.salary > hpe.salary)
                hpe = em;
        }
        System.out.println("Highest salary: " + hpe);

        System.out.println("\nEmployees sorted by name:");
        Collections.sort(emp, new NameComparator());
        for (Employee e : emp) {
            System.out.println(e);
        }

        Iterator<Employee> it = emp.iterator();
        while (it.hasNext()) {
            Employee t = it.next();
            if (t.age > 60)
                it.remove();
        }

        System.out.println("\nEmployees after removing age > 60:");
        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}
