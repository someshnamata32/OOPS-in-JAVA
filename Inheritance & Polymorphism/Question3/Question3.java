import java.util.Scanner;
class Employee{
    String name;
    int employeeId;
    
    Employee(String name, int employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
     void displayDetails(){
        System.out.println("---Employee details---");
        System.out.println("Name: "+name+" ID: "+employeeId);
     }
}

class Manager extends Employee{
    int teamSize;
    Manager(String name , int employeeId,int teamSize){
        super(name,employeeId);
        this.teamSize=teamSize;
    }
    @Override
    void displayDetails(){
        System.out.println("---Manager details---");
        System.out.println("Name: "+name+" ID: "+employeeId+" TeamSize: "+teamSize);
     }
}

class Director extends Manager{
    String department;
    Director(String name, int employeeId,int teamSize, String department){
    super(name,employeeId,teamSize);
    this.department=department;
    }
    
    @Override
    void displayDetails(){
        System.out.println("---Director details---");
        System.out.println("Name: "+name+" ID: "+employeeId+" TeamSize: "+teamSize+" Department: "+department);
     }
}

class Ass5_pr3 {
public static void main(String[] args){
    Employee e = new Employee("somesh",110);
    e.displayDetails();
    Manager m = new Manager("Somesh",102,112);
    m.displayDetails();
    Director d = new Director("somesh",102,112,"IT");
    d.displayDetails();
    }
}
