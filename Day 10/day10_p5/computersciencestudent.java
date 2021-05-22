package day10_p5;

public class computersciencestudent extends student{
	public void coding() {
		System.out.println("Coding");
	}
	public static void main(String[] args) {
		computersciencestudent gaurav=new computersciencestudent();
		gaurav.eat();
		gaurav.walk();
		gaurav.study();
		gaurav.coding();
	}
}
