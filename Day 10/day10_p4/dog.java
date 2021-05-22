package day10_p4;

public class dog extends animal{
	String name="Sam";
	public void bark() {
		System.out.println("Sam Is Barking");
	}
	public static void main(String[] args) {
		dog lab=new dog();
		lab.eat();
		lab.walk();
		lab.bark();
	}
}
