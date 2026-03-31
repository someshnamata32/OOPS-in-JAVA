class Person {
    String name,dob;

    Person(String name,String dob){
        this.name=name;
        this.dob=dob;
    }

    void personDetails(){
        System.out.println("---Person Details----");
        System.out.println(name+" "+dob);
    }
}

class Employee extends Person {
    String companyName;
    int employeeId;

    Employee(String name,String dob,String companyName,int employeeId){
        super(name,dob);
        this.companyName=companyName;
        this.employeeId=employeeId;
    }

    void employeeDetails(){
        System.out.println("---Employee Details---");
        System.out.println(name+" "+dob+" "+companyName+" "+employeeId);
    }
}
 
class Ass5_pr1 {
    public static void main(String[] args){
        Person p=new Person("Somesh","01-01-2000");
        p.personDetails();
        Employee e=new Employee("Somesh","02-02-1999","TCS",101);
        e.employeeDetails();
    }
}
