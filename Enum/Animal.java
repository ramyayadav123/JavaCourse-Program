package Enum;

public enum Animal {
	CAT("Fergus"),DOG("Fido"),MOUSE("Jerry");
	private String name;
	Animal(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "The animal is called:"+name;
	}
}
