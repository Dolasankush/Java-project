package Inheritance;

public class Constructor2 {
	Constructor2(){
		this(10);
		System.out.println("Constructor 1 start");
	}
	Constructor2(int x){
		System.out.println("Constructor 2 start");
		System.out.println("value of x:" +x);
	}
	public static void main(String[] args) {
		Constructor2 c=new Constructor2();
		
	}
}
