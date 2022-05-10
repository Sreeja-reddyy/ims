package oopsdemo1;

public class BookTest {
	public static void main(String[] args) {
		
		Book b1=new Book();
		
		//invoke setter methods -input
		b1.setBookID(101);
		b1.setBookName("Programming in c");
	    b1.setPrice(50);
	    b1.setPublisher("Prime Books");
	
	//invoke getter methods--output
	System.out.println("*****Book Details*****");
	b1.display();
	System.out.println(b1.getBookID()+" "+b1.getBookID()+" "+b1.getPrice()+" "+b1.getPublisher());
	System.out.println("Discounted Price of Book :"+b1.discountPrice());
			System.out.println(b1);
			Book b2=new Book();
		       
	        b2.setBookID(102);
	        b2.setBookName("Python");
	        b2.setPrice(600);
	        b2.setPublisher("BPB Publisher");
	       
	        System.out.println("******* Book Details ********");
	        System.out.println(b2.getBookID()+ " "+b2.getBookname()+" "+b2.getPrice()+" "+b2.getPublisher());
	        System.out.println("Discounted Price of Book :"+b2.discountPrice());   
			System.out.println(b2);
			
	}
	}
	


