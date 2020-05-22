class Persons {
	String name;
	int age;
	void speak()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("My name is: "+name+" and I am "+age+"years old");
		}
	}
	void sayHello()
	{
		System.out.println("Hello there!");
	}
}
public class MethodsEx {
	public static void main(String[] args) {
		Persons person1 = new Persons();
		person1.name = "Tom";
		person1.age = 20;
		Persons person2 = new Persons();
		person2.name = "Jerry";
		person2.age = 19;
		person1.sayHello();
		person1.speak();
		person2.sayHello();
		person2.speak();
	} 
}
