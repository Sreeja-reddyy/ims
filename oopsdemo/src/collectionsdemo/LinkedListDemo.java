package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		//Creating a LinkedList
		LinkedList<String>Friends=new LinkedList<>();
		
		
		 // Adding new elements to the end of the LinkedList using add() method.
        Friends.add("Rajeev");
        Friends.add("John");
        Friends.add("David");
        Friends.add("Chris");

        System.out.println("Initial LinkedList : " + Friends);

        // Adding an element at the specified position in the LinkedList
        Friends.add(3, "Lisa");
        System.out.println("After add(3, \"Lisa\") : " + Friends);

        // Adding an element at the beginning of the LinkedList
        Friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\") : " + Friends);

        // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
        Friends.addLast("Jennifer");
        System.out.println("After addLast(\"Jennifer\") : " + Friends);

        // Adding all the elements from an existing collection to the end of the LinkedList
        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Jesse");
        familyFriends.add("Walt");

        Friends.addAll(familyFriends);
     
        System.out.println("After addAll(familyFriends) : " + Friends);
        
        System.out.println("*********** Retrieve Elements from Linked List*************");
        System.out.println("First Friend in a List :"+Friends.getFirst());
        System.out.println("Last Friend in  a List:"+Friends.getLast());
        System.out.println("Search a friend in position 3 :"+Friends.get(3));
        System.out.println("Delete a last friend :"+Friends.remove("Walt"));
        System.out.println("Find position of John in a ll :"+Friends.indexOf("John"));
        
        System.out.println("Linked List Contents:");
        
        for(String s:Friends)
        {
        	System.out.println(s);
        }
	}

}
