package abstractclass;

public class AbstractEx {
	public static void main(String[] args) {
		Camera cam1=new Camera();
		cam1.setId(5);
		Car car1=new Car();
		car1.setId(4);
		car1.run();
		cam1.setId(6);
		cam1.run();
	}
}
