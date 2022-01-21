package Inheritance;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		
		int lenght;
		int breadth;
		Scanner c=new Scanner(System.in);

		System.out.println("enter the lenght");
		lenght=c.nextInt();
		
		System.out.println("enter the breadth");
		breadth=c.nextInt();
		
		if (lenght==breadth) {
			System.out.println("it is Square");
			}
		else {
			System.out.println("it is Recatngle");
		}
		
				
	}
}
