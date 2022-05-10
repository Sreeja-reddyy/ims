package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set is a Unordered group of elements which stores unique elements only
public class HashSetDemo {

	public static void main(String[] args) {
		
		 Set<String>ProgrammingLanguages=new HashSet<>();
		 
		 
		 ProgrammingLanguages.add("C");
	        ProgrammingLanguages.add("C++");
	        ProgrammingLanguages.add("Java");
	        ProgrammingLanguages.add("Python");
	        ProgrammingLanguages.add("PHP");
	        ProgrammingLanguages.add("Ruby");
	        
	        ProgrammingLanguages.add("Java");
	        ProgrammingLanguages.add(null);
	        ProgrammingLanguages.add(null);
	        
	       
	        
	        System.out.println("=== Iterate over a HashSet using iterator() ===");
	        Iterator<String> programmingLanguageIterator = ProgrammingLanguages.iterator();
	        while (programmingLanguageIterator.hasNext()) {
	            String programmingLanguage = programmingLanguageIterator.next();
	            System.out.println(programmingLanguage);
	        }
	        
	        System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
	        for(String programmingLanguage: ProgrammingLanguages) {
	            System.out.println(programmingLanguage);
	        }

	        HashSet<String> pl = new HashSet<>(ProgrammingLanguages);
	        
	        System.out.println(pl);
	        
	        HashSet<String> clonepl = new HashSet<>();// empty hash set
	        
	        // clone the Hashset
	        clonepl=(HashSet<String>) pl.clone();
	        
	        //display new set after cloning
	        System.out.println(clonepl);
	        

	}

}
