package basics;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float a,r;
		final float PI=3.14f;
		System.out.println("Enter Radius of a Circle :");
		r=s.nextFloat();
		a=PI*r*r;
		System.out.println("The area of circle is :");
		System.out.format("%.2f", a);
	}

}
