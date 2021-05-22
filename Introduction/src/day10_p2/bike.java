package day10_p2;

public class bike extends vehicle{
	int wheels=2;
	public void show() {
		System.out.println("Bike has "+wheels);
	}
	public static void main(String[] args) {
		bike b1=new bike();
		b1.accelerate();
		b1.breaks();
		b1.show();
		car c1=new car();
		c1.accelerate();
		c1.breaks();
		c1.show();
	}

}
