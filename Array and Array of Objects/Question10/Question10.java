import java.util.Scanner;

class Ass3_pr10 {
    int id;
    String name;
    double salary;

    Ass3_pr10(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Ass3_pr10 emp[] = new Ass3_pr10[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < emp.length; i++) {
            System.out.println("enter data for employee: "+(i+1));
            emp[i] = new Ass3_pr10(sc.nextInt(), sc.next(), sc.nextDouble());
        }

        boolean found = false;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].id == 101) {
                emp[i].display();
                found = true;
                break;
            } 
        }

        if (!found)
            System.out.println("employee not found");

        double max = emp[0].salary, sum = 0;
        for (int i = 0; i < emp.length; i++) {
            sum += emp[i].salary;
            if (emp[i].salary > max) 
                max = emp[i].salary;
        }

        System.out.println("Highest Salary = " + max);
        System.out.println("Average Salary = " + (sum / emp.length));
    }
}
