package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person3 implements Comparable<Person3> {
    private String name;
    
    public Person3(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        final Person3 other = (Person3) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Person3 person) {
        int len1 = name.length();
        int len2 = person.name.length();
        
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(person.name);
        }
    }
}

public class NaturalOrdering {

	public static void main(String[] args) {
        List<Person3> list = new ArrayList<Person3>();
        SortedSet<Person3> set = new TreeSet<Person3>();
        
        addElements(list);
        addElements(set);
        
        Collections.sort(list);
        
        showElements(list);
        System.out.println();
        showElements(set);

	}
    private static void addElements(Collection<Person3> col) {
        col.add(new Person3("Joe"));
        col.add(new Person3("Sue"));
        col.add(new Person3("Juliet"));
        col.add(new Person3("Clare"));
        col.add(new Person3("Mike"));
    }
    
    private static void showElements(Collection<Person3> col) {
        for(Person3 element: col) {
            System.out.println(element);
        }
    }


}
