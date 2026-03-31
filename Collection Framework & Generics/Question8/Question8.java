import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    void display() {
        System.out.println(name + " " + severity);
    }
}

class PatientComparator implements Comparator<Patient> {
    public int compare(Patient p1, Patient p2) {
        return p1.severity - p2.severity;
    }
}

class pr8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Patient> pq = new PriorityQueue<>(new PatientComparator());

        System.out.println("Enter details of 5 patients:");

        for(int i=0;i<5;i++){
            String name = sc.next();
            int severity = sc.nextInt();
            pq.add(new Patient(name, severity));
        }

        System.out.println("\nPatients in order of severity:");
        PriorityQueue<Patient> temp = new PriorityQueue<>(pq);

        while(!temp.isEmpty()){
            Patient p = temp.poll();
            p.display();
        }

        pq.poll();

        System.out.println("\nRemaining patients:");
        PriorityQueue<Patient> temp2 = new PriorityQueue<>(pq);

        while(!temp2.isEmpty()){
            Patient p = temp2.poll();
            p.display();
        }
    }
}
