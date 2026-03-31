import java.util.*;
class myThread extends Thread{
	public void run(){
		System.out.println("child thread started");
		for(int i=1; i<=10; i++){
			System.out.println("child thread "+i);
		}
	}
}
class pr4{
		public static void main(String[] args){
			myThread t = new myThread();
			t.start();
			try{t.join();}
			catch(InterruptedException e){}
			System.out.println("main thread started");
			for(char ch = 'A'; ch<='J'; ch++){
				System.out.println("main thread "+ ch);
			}
		}
}
				
			
