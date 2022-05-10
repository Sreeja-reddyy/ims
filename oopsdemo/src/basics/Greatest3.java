package basics;
import java.util.Scanner;
public class Greatest3 {
	public static void main(String[] args) {
int a,b,c;
      Scanner s=new
Scanner(System.in);
      System.out.println("Enter 3 numbers:");
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      s.close();
      if(a>b && a>c)
      {
    	  System.out.println(a+" is Greatest");
      }
      else if (b>c)
      {
    	  System.out.println(b+" is Greatest");
      }
      else
      {
    	  System.out.println(c+" is Greatest");
      }
} 
}
      

	


