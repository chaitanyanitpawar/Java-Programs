package day_9;

import java.util.Scanner;

public class greatestNumber {
	int a,b,c;
	public greatestNumber(int x,int y,int z) {
		this.a=x;
		this.b=y;
		this.c=z;
	}
	public void greatest() {
		if (a>b) {
			if(a>c) {
				System.out.println("The First Number "+a+" is greatest");
			}
		}
		else if (b>c) {
			if(b>a) {
				System.out.println("The Second Number "+b+" is greatest");
			}
		}
		else if (c>b) {
			if(c>a) {
				System.out.println("The Third Number "+c+" is greatest");
			}
		}
		else{
			System.out.println("Two Or More Numbers Are Equal");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a=sc.nextInt();
		System.out.println("Enter The Second Number");
		int b=sc.nextInt();
		System.out.println("Enter The Third Number");
		int c=sc.nextInt();
		greatestNumber n1=new greatestNumber(a, b, c);
		n1.greatest();
	}
}
