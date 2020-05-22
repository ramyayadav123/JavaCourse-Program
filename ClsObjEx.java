class Person {
	String name;
	int age;
}

public class ClsObjEx {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Tom";
		person1.age = 20;
		Person person2 = new Person();
		person2.name = "Jerry";
		person2.age = 19;
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
	}
}
