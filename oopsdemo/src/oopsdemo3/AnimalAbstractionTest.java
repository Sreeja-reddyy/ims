package oopsdemo3;

abstract class Animal
{
	public void eat() {
		System.out.println("I can Eat");
	}
	abstract void makeSound();//abstract method- without body
}

class Dog extends Animal{

	@Override
	void makeSound() {
		System.out.println("Bark Bark");
		
	}
	
}

class Cat extends Animal
{

	@Override
	void makeSound() {
		System.out.println("Meow Meow");
		
	}
	
}


public class AnimalAbstractionTest {

	public static void main(String[] args) {
		
		//Animal a=new Animal();
		//Compiler error - Cannot create Abstract class
		
		Dog d1=new Dog();
		
		d1.makeSound();
		d1.eat();
		
		Cat c1=new Cat();
		
		c1.makeSound();
		c1.eat();
	}

}