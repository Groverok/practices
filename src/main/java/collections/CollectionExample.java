package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionExample {
    public static void main(String[] args) {

        // Collection ArrayList.
        Collection<String> c1 = new ArrayList<String>();
        // Add items in ArrayList.
        c1.add("ArrayList Item 1");
        c1.add("ArrayList Item 2");
        c1.add("ArrayList Item 3");
        c1.add("ArrayList Item 4");
        // Get collection Items list.
        System.out.println("Collection Items are : " + c1);
        // Get size of collection.
        System.out.println("Size of collection is : " + c1.size());
        // Remove item from collection.
        c1.remove("ArrayList Item 3");
        System.out.println("Collection Items are : " + c1);

        System.out.println();
        System.out.println();


        // Collection LinkedList.
        Collection<String> c2 = new LinkedList<String>();
        // Add items in LinkedList.
        c2.add("LinkedList Item 1");
        c2.add("LinkedList Item 2");
        c2.add("LinkedList Item 3");
        c2.add("LinkedList Item 4");
        // Get collection Items list.
        System.out.println("Collection Items are : " + c2);
        // Get size of collection.
        System.out.println("Size of collection is : " + c2.size());
        // Remove item from collection.
        c2.clear();
        System.out.println("Collection Items are : " + c2);
    }
}