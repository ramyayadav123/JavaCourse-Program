
public class StringForm {
	public static void main(String[] args) {
		String info="";
		info+="My name is  Bob";
		info+=" ";
		info+="I am a builder";
		System.out.println(info);
		StringBuilder sb=new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		System.out.println(sb.toString());
		StringBuilder s =new StringBuilder();
		s.append("My name is Roger")
		.append(" ")
		.append("I am a skydiver");
		System.out.println(s.toString());
		System.out.println("Here is some text. \tThat was a tab.\nThat was a newline");
		System.out.println("More text. ");
		//Formatting
		System.out.printf("Total cost %-10d; quantity is %d\n",5,20);
		System.out.printf("%-2d: %s\n",5,"here is some text");
		System.out.printf("Total value: %.2f\n",5.6874);
		System.out.printf("Total value: %6.1f\n",343.23423);
	
		
		
		
		
	}
}
