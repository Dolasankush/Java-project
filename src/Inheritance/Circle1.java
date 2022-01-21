package Inheritance;

import java.util.Scanner;

public class Circle1 {
	public static void m1() {
		float r;
		float Area ;
		
		System.out.println("enter the radius of circle");
		
		Scanner c=new Scanner(System.in);
		r=c.nextFloat();
		
		Area=22f/7f*r*r;
		
		System.out.println("Area of circle :" +Area);
		
		
		}

	
public static void main(String[] args) {
	Circle1 x=new Circle1();
	x.m1();
}
	
}


