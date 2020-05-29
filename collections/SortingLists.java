package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1 {
    private int id;
    private String name;
    
    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return id + ": " + name;
    }
}
class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();
        
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        
        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class SortingLists {

	public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        
        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");
        
        // Collections.sort(animals, new StringLengthComparator());
        Collections.sort(animals, new ReverseAlphabeticalComparator());
        
        for(String animal: animals) {
            System.out.println(animal);
        }
    
        ////////////////////// Sorting Numbers ////////////////////////////////
        List<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);
        
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });
        
        for(Integer number: numbers) {
            System.out.println(number);
        }
        
        ////////////////////// Sorting arbitary objects ////////////////////////////////
        
        List<Person1> people = new ArrayList<Person1>();
        
        people.add(new Person1(1, "Joe"));
        people.add(new Person1(3, "Bob"));
        people.add(new Person1(4, "Clare"));
        people.add(new Person1(2, "Sue"));
        
        // Sort in order of ID
        Collections.sort(people, new Comparator<Person1>() {
            public int compare(Person1 p1, Person1 p2) {

                if(p1.getId() > p2.getId()) {
                    return 1;
                }
                else if(p1.getId() < p2.getId()) {
                    return -1;
                }
                
                return 0;
            }
        });
        
        for(Person1 Person1: people) {
            System.out.println(Person1);
        }
        
        System.out.println("n");
        // Sort in order of name
        Collections.sort(people, new Comparator<Person1>() {
            public int compare(Person1 p1, Person1 p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        
        for(Person1 Person1: people) {
            System.out.println(Person1);
        }
        

	}

}
