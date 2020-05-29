package collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(111);
		numbers.add(200);
		System.out.println("Iteration 1");
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		numbers.remove(numbers.size()-1);
		numbers.remove(0);
		System.out.println("Iteration 2");
		for(Integer value:numbers)
		{
			System.out.println(value);
		}
		
	}

}
