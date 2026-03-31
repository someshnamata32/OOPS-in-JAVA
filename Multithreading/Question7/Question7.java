class CarShowroom {
	int numberOfCars = 0;

	synchronized void addCar(){
		numberOfCars++;
		System.out.println("Car added , Number of cars : "+numberOfCars);
		notifyAll();
	}

	synchronized void buyCar(){
		while(true){
			if(numberOfCars > 0){
				numberOfCars--;
				System.out.println(Thread.currentThread().getName()+" Purchased car ");
				System.out.println("Available car: "+numberOfCars);
				System.out.println();
				break;
			}
			else{
				System.out.println(Thread.currentThread().getName()+", Insufficient car");
				try{ wait();}catch(InterruptedException ie){}	
			}
		}
	}
}

class Manufacturer extends Thread{
	CarShowroom cs;
	Manufacturer(CarShowroom cs){
		this.cs = cs;
	}

	public void run(){
		for(int i=1; i<=3; i++){
			cs.addCar();
			try{Thread.sleep(2000);}
			catch(InterruptedException e){}
		}
		System.out.println("Manufacturer added 3 car\n");
	}
}

class Customer extends Thread{
	CarShowroom cs;
	Customer(String name, CarShowroom cs){
		super(name);
		this.cs = cs;
	}

	public void run(){
		cs.buyCar();
	}
}

class pr7{
	public static void main(String[] args) {
		CarShowroom cs = new CarShowroom();

		Manufacturer m = new Manufacturer(cs);
		Customer c1 = new Customer("Child-1",cs);
		Customer c2 = new Customer("Child-2",cs);
		Customer c3 = new Customer("Child-3",cs);


		m.start();
		c1.start();
		c2.start();
		c3.start();
	}
}
