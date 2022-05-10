package oopsdemo3;

public class OverrideDemo {
	public static void main(String[] args) {
	Developer d1 =new Developer("Gosling","Java",25000);
	Tester t1 =new Tester("Mike","Jeter",20000);
	
	d1.display();//invokes base class
	d1.work();//invokes derived class
	
	t1.display();
	t1.work();//invokes derived class
}



}
