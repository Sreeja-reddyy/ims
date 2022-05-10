package oopsdemo2;

//parent/base/super class

class Animal
{
	String name;
	
	public void eat()
	{
		System.out.println("I can Eat");
		
	}
}
//Inherits Animal Class
//Child/ Sub/ Derived Class
class Dog extends Animal 
{
public void display()
{
	System.out.println("My Name is :"+name);
}
}

public class SingleinheritanceTest {
	public static void main(String[] args) {
		
		//create & initialize Object of sub Class
		Dog labrador=new Dog();
		
		//access field of super class
		labrador.name="Zimba";
		
		//call method of derived class
		labrador.display();
		
		//call method of super class using derived class object
		labrador.eat();
		
		
		
		
		
		
	}

}
