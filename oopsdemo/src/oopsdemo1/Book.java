package oopsdemo1;
/*
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
 * To achieve this, you must:
   declare class variables/attributes as private
   provide public get and set methods to access and update the value of a private variable
   
   The get method returns the value of the variable name.

 

   The set method takes a parameter (newName) and assigns it to the name variable. 
 */

public class Book {
	//properties
	private int bookID;
	private String bookname;
	private float price;

	private String publisher;

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setBookName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}

	public String discountPrice1() {
		// TODO Auto-generated method stub
		return null;
	}
	// Generate Getters & Setters -> Place a cursor in new blank line --> Right Click
    //  --> Source ---> Generate Getters & Setters
	
	float discountPrice()
	{
		return ((this.price)-(this.price*.10f));
	}
	public static void main(String[] args) {
		
	}
}
	
	
	


