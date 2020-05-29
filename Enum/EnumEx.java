package Enum;

public class EnumEx {
	public static void main(String[] args) {
		Animal animal=Animal.DOG;	
		switch(animal)
		{
		case CAT:
			System.out.println("Cat");
		case DOG:
			System.out.println("Dog");
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		}
		System.out.println(Animal.DOG);
		System.out.println("Enum name as a string:" + Animal.DOG.name());
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.MOUSE.getName());
	}
}
