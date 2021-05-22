package day_9;
import java.util.Scanner;

public class sumOfDigits {
	int number;
	public sumOfDigits(int n) {
		this.number=n;
	}
	public void calc() {
		int result=0,temp;
		temp=number;
		while(number > 0) {
			result += number % 10;
			number /= 10;
		}
		System.out.println("The Sum Of All Digits Of "+temp+" is "+result);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input The Number: ");
		int num=sc.nextInt();
		sumOfDigits d1=new sumOfDigits(num);
		d1.calc();
	}
}
