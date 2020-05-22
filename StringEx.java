class Frog1
{
	private int id;
	private String name;
	public Frog1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(id).append(" ").append(name);
		return sb.toString();
	}
}
public class StringEx {
	public static void main(String[] args) {
		Frog1 fg=new Frog1(7,"Freddy");
		Frog1 g=new Frog1(5,"Roger");
		System.out.println(fg);
		System.out.println(g);

	}
	
	
}
