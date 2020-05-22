import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter text");
		String text=input.nextLine();
		System.out.println("Enter integer value");
		int value=input.nextInt();
		System.out.println("Enter floating point value");
		double num=input.nextDouble();
		System.out.println("You entered: "+text);
		System.out.println("You entered: "+value);
		System.out.println("You entered: "+num);

	}
}
