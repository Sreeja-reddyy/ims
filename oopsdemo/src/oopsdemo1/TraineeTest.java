package oopsdemo1;

public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee();
		t1.display();
		
		//invokes parameterized constructor
		Trainee t2=new Trainee(111,"Ram" ,"c++",5000);
		t2.display();
	}
}