package oopsdemo2;

import java.util.List;
//composition example
public class Library {

	List<Book> books;

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	} 
	
	
}