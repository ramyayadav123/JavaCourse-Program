import java.util.ArrayList;

class Device1 {

	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Device started");
	}
}

class Camera1 extends Device1 {

	@Override
	public String toString() {
		return "I am a camera";
	}

	public void start() {
		System.out.println("Camera started");
	}

	public void snap() {
		System.out.println("Photo taken");
	}
}

public class GenWildCards {

	public static void main(String[] args) {
		ArrayList<Device1> list1 = new ArrayList<Device1>();
		list1.add(new Device1());
		list1.add(new Device1());
		ArrayList<Camera1> list2 = new ArrayList<Camera1>();
		list2.add(new Camera1());
		list2.add(new Camera1());
		showList(list2);
		showList2(list1);
		showList3(list1);
	}

	public static void showList(ArrayList<? extends Device1> list) {
		for (Device1 value : list) {
			System.out.println(value);
			value.start();
		}
	}

	public static void showList2(ArrayList<? super Camera1> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}
	public static void showList3(ArrayList<?> list)
	{
		for(Object value:list)
		{
			System.out.println(value);
		}
	}
}