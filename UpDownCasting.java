class Device
{
	public void start()
	{
		System.out.println("Device started");
	}
}
class Camera extends Device
{
	public void start()
	{
		System.out.println("Camera started");
	}
	public void snap()
	{
		System.out.println("Photo taken");
	}
}
public class UpDownCasting {
	public static void main(String[] args) {
		Device dev1=new Device();
		Camera cam1=new Camera();
		dev1.start();
		cam1.start();
		cam1.snap();
		//Upcasting
		Device dev2=cam1;
		dev2.start();
		//Downcasting
		Device dev3=new Camera();
		Camera cam2=(Camera)dev3;
		cam2.start();
		cam2.snap();
		
	}
}
