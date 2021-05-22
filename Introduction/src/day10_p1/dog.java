package day10_p1;

public class dog extends animal{
	public void bark() {
		System.out.println("Dog does Bark");
	}

	public static void main(String[] args) {
		cat c1=new cat();
		c1.eat();
		c1.meow();
		c1.walk();
		dog d1=new dog();
		d1.bark();
		d1.eat();
		d1.walk();
	}

}
