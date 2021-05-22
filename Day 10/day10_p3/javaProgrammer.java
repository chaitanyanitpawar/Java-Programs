package day10_p3;

public class javaProgrammer extends person{
	int salary=50000;
	public void sal() {
		System.out.println("The Salary Of Java Programmer Is Rs. "+salary);
	}
	public static void main(String[] args) {
		javaProgrammer tejal=new javaProgrammer();
		tejal.eat();
		tejal.walk();
		tejal.sal();
	}
}
