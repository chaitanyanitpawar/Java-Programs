package day_3;
import java.util.Scanner;
public class day_3 {
	
		//Program 1
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		String str="*";
//		for (int i=1;i<=5;i++) {
//			System.out.println(str.repeat(i));
//		}
//	}
	
		//Program 2
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		String str="*";
//		for (int i=5;i>=1;i--) {
//			System.out.println(str.repeat(i));
//		}
//	}
	
		//Program 3
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter Your Name");
//		String name=sc.next();
//		for (int i=0;i<name.length();i++) {
//			System.out.println(name.charAt(i));
//		}
//	}
	
		//Program 4
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter The Number");
//		int num=sc.nextInt();
//		for (int i=1;i<=10;i++) {
//			System.out.println(i*num);
//		}
//	}
	
		//Program 5
//	public static void main(String[] args) {
//		for (int i=0;i<=5;i++) {
//			int fn=i;
//			int sn=10-i;
//			System.out.println(fn+","+sn);
//		}
//	}
	
		//Program 6
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter The Number Between 1 to 7");
//		int num=sc.nextInt();
//		switch(num){
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//			default:
//				System.out.println("Run The Program Again And Enter The Value Between 1 To 7");
//		}
//	}
	
		//Program 7
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter The Stars Between 1 to 3");
//		int star=sc.nextInt();
//		switch(star){
//		case 1:
//			System.out.println("Bad");
//			break;
//		case 2:
//			System.out.println("Good");
//			break;
//		case 3:
//			System.out.println("Best");
//			break;
//			default:
//				System.out.println("Run The Program Again And Enter The Stars Between 1 To 3");
//		}
//	}
	
		//Program 8
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int fact=1;
//		System.out.println("Enter The Number");
//		int num=sc.nextInt();
//		for (int i=1;i<=num;i++) {
//			fact*=i;
//		}
//		System.out.println("Factorial Of "+num+" is: "+fact);
//	}
	
		//Program 9
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number");
//		int num=sc.nextInt();
//		boolean isprime=true;
//		if(num<2) {
//			System.out.println(num+" is not a prime number");
//		}
//		else {
//			for (int i=2;i<=(num/2);i++) {
//				if(num%i==0) {
//					System.out.println(num+" is not a prime number");
//					isprime=false;
//					break;
//				}
//			}
//			if(isprime==true) {
//				System.out.println(num+" is prime number");
//		}
//		}
//	}
	
		//Program 10
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number Of Terms");
//		int terms=sc.nextInt();
//		for (int i=1;i<=terms;i++) {
//			System.out.println(i*i);
//		}
//	}
	
		//Program 11
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number Of Terms");
//		int terms=sc.nextInt();
//		int a=0,b=1;
//		System.out.println(a);
//		System.out.println(b);
//		for (int i=2;i<terms;++i) {
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
//	}
}
