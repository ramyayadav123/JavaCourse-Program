class Frog
{
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setInfo(String name,int age)
	{
		setName(name);
		setAge(age);
	}
}
public class Setter {

	public static void main(String[] args) {
		Frog frog=new Frog();
		frog.setInfo("Tom",1);
	    System.out.println("Name: "+frog.getName());
	    System.out.println("Age: "+frog.getAge());

	}

}
