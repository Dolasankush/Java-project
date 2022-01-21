package Inheritance;

public class Constructor4 {
	Constructor4(int x){
		this();
		
		System.out.println("integer Argument");
	}
	Constructor4(){
		this("");
		System.out.println("no argument");
	}
	Constructor4(String s){
		System.out.println("name is Ankush");
	}
	public static void main(String[] args) {
		Constructor4 c=new Constructor4(20);
	}
}
