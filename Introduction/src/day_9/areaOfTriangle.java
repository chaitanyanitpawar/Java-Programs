package day_9;
import java.util.Scanner;

public class areaOfTriangle {
	float b,h;
	public areaOfTriangle(float x,float y) {
		this.b=x;
		this.h=y;
	}
	public void area() {
		float area=(float) (0.5*b*h);
		System.out.println("Area Of Given Triangle Is "+area);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Base");
		float b=sc.nextFloat();
		System.out.println("Enter The Height");
		float h=sc.nextFloat();
		areaOfTriangle t1=new areaOfTriangle(b, h);
		t1.area();
	}
}
