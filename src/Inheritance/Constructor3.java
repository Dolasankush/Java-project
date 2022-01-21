package Inheritance;

public class Constructor3 {
	Constructor3(){
		this(10,"Ankush");
		System.out.println("Constructor start");
	}
	Constructor3(int x,String s){
		System.out.println("value of x:" +x);
		System.out.println("name is :" +s);
	}
	public static void main(String[] args) {
		Constructor3  c=new Constructor3();
	}
}
