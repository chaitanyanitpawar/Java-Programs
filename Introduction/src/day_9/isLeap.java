package day_9;

import java.util.Scanner;

public class isLeap {
	int year;
	public isLeap(int y) {
		this.year=y;
	}
	public void check() {
		String op=(year%4==0)?"The Year Is Leap":"The Year Is Not Leap";
		System.out.println(op);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a year: ");
		int year=sc.nextInt();
		isLeap y1=new isLeap(year);
		y1.check();
	}
}
