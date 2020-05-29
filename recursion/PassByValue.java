package recursion;

public class PassByValue {
	public static void main(String[] args) {
        int value = 7;
        System.out.println("1. Value is: " + value);
        
        PassByValue.show(value);
        
        System.out.println("4. Value is: " + value);
        System.out.println();
        
        Person11 person = new Person11("Bob");
        System.out.println("1. Person is: " + person);
        
        PassByValue.show(person);
        
        System.out.println("4. Person is: " + person);

	}
    public static void show(int value) {
        System.out.println("2. Value is: " + value);
        
        value = 8;
        
        System.out.println("3. Value is: " + value);
    }
    
    public static void show(Person11 person) {
        System.out.println("2. Person is: " + person);
        
        
        
        person = new Person11("Mike");
        person.setName("Sue");
        
        System.out.println("3. Person is: " + person);
        
    }

}
