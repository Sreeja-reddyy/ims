package java8features;



 @FunctionalInterface
 interface MYFI
 {
	 public String sayHello();
	 //public String sayHello();
 }
public class LambdaDemo1 {

	public static void main(String[] args) {
		
MYFI msg= () -> {return "Hello World";}; //lambda expresssion
System.out.println(msg.sayHello());

	}

}
