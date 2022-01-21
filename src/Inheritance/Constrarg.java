package Inheritance;

public class Constrarg {
Constrarg(int x){
	System.out.println("Constructor start");
	System.out.println("value of x:" +x);
}
public void m1(int x) {
	System.out.println("m1 is runnig");
}
public static void main(String[] args) {
	Constrarg c=new Constrarg(10);
	c.m1(10);
}
}
