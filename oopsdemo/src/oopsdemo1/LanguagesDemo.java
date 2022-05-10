package oopsdemo1;
//Program to demonstrate constructors in Java
class Language
{
	private String s;
	private int version;
	
	Language()//Implicit constructor
	{
		
		System.out.println("I am an Implicit Constructor");
		s="Python";
		System.out.println("Hello from : "+ s);
		
				
	}
	
	Language(String lang)//parameterized constructor
	{
		
		System.out.println("I am Parameterized Consructor");
		this.s=lang;
		System.out.println("Hello from  :"+s);
	}
	Language(String lang,int ver )//Paramerterized constructor with 2 Args
	{
		System.out.println("I am a Paramerterized constructor with 2 Args");
		this.s=lang;
		this.version=ver;
		System.out.println("Hello from : "+s+"V. "+version);
	}
}
public class LanguagesDemo {

	public static void main(String[] args) {
		Language l1=new Language();//automatically invokes Implicit Constructor
		Language l2=new Language("Ruby");//automatically invokes Parameterized Constructor
		Language l3=new Language("Scala");
		Language l4=new Language();
		Language l5=new Language("Java",2);//automatically invokes 2 Args Parameterized

	}

}