package oopsdemo2;

public class JavaCandidate extends Candidate {
	private String tech;
	private double perks;
	

	public JavaCandidate(int id, String name, double salary, String t) {
		super(id, name, salary);
		this.tech=t;
		
		
	}
	void getperks()
	{
		perks=salary*.10;
		System.out.print(" Perks of Java Candidate is :"+perks);
	}
	void display()
	{
		super.display();
		System.out.println(tech);
	}
	

}
