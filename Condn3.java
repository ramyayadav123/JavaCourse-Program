import java.util.Scanner;
public class Condn3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a command");
	String text=sc.nextLine();
	switch(text)
	{
	case "start":
		System.out.println("Machine started");
		break;
	case "stop":
		System.out.println("Machine stopped");
		break;
	default:
		System.out.println("Command not recognized");
	}
	
}
}
