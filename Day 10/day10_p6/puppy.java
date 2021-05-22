package day10_p6;

public class puppy extends dog {
	String name="Julie";
	public void weep() {
		System.out.println(name+" Is Weeping");
	}
	public static void main(String[] args) {
		puppy julie=new puppy();
		julie.eat();
		julie.walk();
		julie.bark();
		julie.weep();
	}
}
