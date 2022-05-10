package oopsdemo3;
/*The major use of abstract classes and methods is to achieve abstraction in Java.
Abstraction is an important concept of object-oriented programming that allows us
to hide unnecessary  details and only show the needed information. */
public abstract class Bike {
	
	//generate implicit constructor
    
	Bike(){
		System.out.println("Bike is created");
	}
	abstract void run();//abstract method
	
	void changegear()
	{
		System.out.println("change gear");
	}
	
}


class Honda extends Bike
{

	@Override
	void run() {
		System.out.println("Honda Bike Running.....");
		
	}
	
}