class Robot
{
		public void speak(String text)
		{
			System.out.println(text);
		}
		public void jump(int height)
		{
			System.out.println("Jumping: "+height);
		}
		public void move(String direction,double distance)
		{
			System.out.println("Moving "+distance+" metres in direction "+direction);
		}
}
public class MethodParm {
public static void main(String[] args) {
	Robot rob=new Robot();
	rob.speak("Hi am Rob");
	rob.jump(14);
	rob.move("East",13.3);
	
}
}
