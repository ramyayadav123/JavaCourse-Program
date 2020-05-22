class PersonData
{
	String name;
	int age;
	int calculateYearsToRetirement()
	{
		int yearsLeft=65-age;
		return yearsLeft;
	}
	int getAge()
	{
		return age;
	}
	String getName()
	{
		return name;
	}
}
public class Getter {
public static void main(String[] args) {
	PersonData per1=new PersonData();
	per1.name="Joe";
	per1.age=25;
	int years=per1.calculateYearsToRetirement();
	System.out.println("Years till retirement: "+years);
	int age=per1.getAge();
	String name=per1.getName();
	System.out.println("Name is: "+name);
	System.out.println("Age is: "+age);
}
}
