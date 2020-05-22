import java.util.ArrayList;
import java.util.HashMap;


public class Generics {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("apple");
		list.add("mango");
		list.add("banana");
		list.add("orange");
		String fruit=(String)list.get(1);
		System.out.println(fruit);
		ArrayList<String> strings=new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		String animal=strings.get(1);
		System.out.println(animal);
	}
}
