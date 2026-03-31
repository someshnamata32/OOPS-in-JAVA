class Ass4_pr1 {
    int id;
    String name;
    double salary;

    Ass4_pr1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Ass4_pr1 e = new Ass4_pr1(1, "Somesh", 30000);
        e.displayDetails();
    }
}
  
