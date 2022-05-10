package oopsdemo3;

import oopsdemo1.Bicycle;

class Test{
	
	int a;//default variable
	private int b;//private variable
	protected int c;//accessed in sub class
	public int d;
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		d = 500;
	}
	
	 public void display()  // public method
	    {
	        System.out.println("Private Variable:"+b);
	    }

	public void print() {
		// TODO Auto-generated method stub
		
	}
}


class Test2 extends Test{

	public Test2(int a, int b, int c) {
		super(a, b, c);
		
	}
	public void display()  // public method
    {
        System.out.println("Protected Variable:"+c);
    }
	void println() //default mathod
	{
		System.out.println("Hello from Default Methos");
	}
}



public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		
		Test t1=new Test(100,200,300);
        t1.display();
        // t1.b=50; compiler error. cannot access private variable
        System.out.println("Defaut Variable :"+t1.a);
        
        Test t2=new Test(100,200,300);
        t2.display();
        
      Bicycle sportsBicycle=new Bicycle();
      
      //access public method of oopsdemo1.Bicycle
      sportsBicycle.startCycling();
    //access deafault method of oopsdemo1.Bicycle - Compiler Error
      sportsBicycle.applyBrake();
        
        
        
	
	}

}