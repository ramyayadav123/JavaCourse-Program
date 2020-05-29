package abstractclass;

public class Car extends Machine {
	public void start() {
		System.out.println("Car starting");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff");
	}

	@Override
	public void shutdown() {
		System.out.println("Shut down");
	}
	
}
