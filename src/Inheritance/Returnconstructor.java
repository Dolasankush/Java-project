package Inheritance;

public class Returnconstructor {
int x;
int y;
Returnconstructor(int a, int b){
	this.x=a;
	this.y=b;
}
Returnconstructor(){
}
	public void m1() {
	System.out.println("value of x:"+x);
	System.out.println("value of y:"+y);
	}
	public static void main(String[] args) {
		Returnconstructor c=new Returnconstructor(10,20);
		c.m1();
		Returnconstructor c2=new Returnconstructor();
		c2.m1();
	}}