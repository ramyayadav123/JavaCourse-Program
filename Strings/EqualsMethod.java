package Strings;
class Person
{
	private int id;
	private String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [id=" +id + ",name="+name+"]";
	}
	
}
public class EqualsMethod {
	public static void main(String[] args) {
		System.out.println(new Object());
		Person person1=new Person(5,"Bob");
		Person person2=new Person(5,"Bob");
		System.out.println(person1==person2);
		System.out.println(person1.equals(person2));
		String text1="Hello";
		String text2="Helloworld".substring(0, 5);
		System.out.println(text2);
		System.out.println(text1.equals(text2));
	}
}
