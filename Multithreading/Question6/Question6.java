import java.util.*;
class Student extends Thread{
	
	synchronized void study(String sub , int time){
		for(int i=1; i<= time; i++){
		System.out.println("Student study "+sub +" for "+ i + " hour.");
		try{ Thread.sleep(500);}
			catch(InterruptedException e){}	
		}
		System.out.println("\n");
	}
}

class StudyPlan extends Thread{
	String sub;
	int time;
	Student s;
	StudyPlan(String sub , int time, Student s){
		this.sub =sub;
		this.time=time;
		this.s =s;
	}
	
	public void run(){
		s.study(sub , time);
	}
}

class pr6{
	public static void main(String[] args){
		Student s = new Student();
		StudyPlan t1 = new StudyPlan("JAVA", 3,s);
		StudyPlan t2 = new StudyPlan("Math", 5,s);
		StudyPlan t3 = new StudyPlan("English", 7,s);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
		
