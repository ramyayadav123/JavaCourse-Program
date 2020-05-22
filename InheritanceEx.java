public class InheritanceEx {

	public static void main(String[] args) {
		Machine1 mach = new Machine1();
		mach.start();
		mach.stop();
		Car c=new Car();
		c.start();
		c.wipeWindShield();
		c.showInfo();
		c.stop();
	}

}
