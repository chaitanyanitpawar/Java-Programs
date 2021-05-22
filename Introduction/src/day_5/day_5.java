package day_5;

import java.util.Scanner;
import java.lang.Math;

public class day_5 {
	
	
		//Program 1
//	public static void main(String[] args) {
//		System.out.println("Enter The Number Of Weeks");
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		for (int w=1;w<=n;w++) {
//			System.out.println("Week: "+w);
//			if (w==2) {
//				continue;
//			}
//			else {
//			for (int d=1;d<=7;d++) {
//				System.out.println("\tDay: "+d);
//				}
//			}
//		}
//	}
	
	
		//Program 2
//	public static void main(String[] args) {
//		System.out.println("Enter The Number Of Terms");
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int sum=0;
//		for (int i=1;i<=n;i++) {
//			sum+=i;
//		}
//		System.out.println("The Summation Of First "+n+" Natural Numbers Is: "+sum);
//	}
	
	
		//Program 3
//	public static void main(String[] args) {
//		System.out.println("Enter The Number Of Terms");
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int fact=1;
//		for (int i=1;i<=n;i++) {
//			fact*=i;
//		}
//		System.out.println("The Factorial Of "+n+" Is: "+fact);
//	}
	
	
		//Program 4
//	public static void main(String[] args) {
//		System.out.println("Enter The Number Of Terms");
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		float sum=0;
//		for (int i=1;i<=n;i++) {
//			sum+=i;
//		}
//		float avg=sum/n;
//		System.out.println("The Average Of First "+n+" Natural Numbers Is: "+avg);
//	}
	
	
		//Program 5
//	public static void main(String[] args) {
//		System.out.println("Enter The Number(Base)");
//		Scanner sc= new Scanner(System.in);
//		int num=sc.nextInt();
//		System.out.println("Enter The Power(Exponent)");
//		int pow=sc.nextInt();
//		int expo=pow;
//		long result=1;
//		while (pow!=0) {
//			result*=num;
//			--pow;
//		}
//		System.out.println("The Value Of "+num+" raised to "+expo+" is "+result);
//	}
	
	
		//Program 6
//	public static void main(String[] args) {
//		System.out.println("Enter The Number Of Terms");
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		for (int i=1;i<=n;i++) {
//			System.out.print(i*i*i);
//			System.out.print(",");
//		}
//		System.out.print("\b");
//	}
	
	
		//Program 7
//	public static void main(String[] args ) {
//		System.out.println("Enter The Number Of Odd Terms");
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int sum=0;
//		System.out.print("The Odd Numbers Are :");
//		for(int i=1;i<=n;i++) {
//			System.out.print(2*i-1+" ");
//			sum+=2*i-1;
//		}
//		System.out.println();
//		System.out.println("The Sum Of Odd Natural Number Upto "+n+" Terms: "+sum);
//	}
	
	
		//Program 8
//	public static void main(String[] args) {
//		System.out.println("Enter The Number Of Terms");
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		float s=0;
//		for(int i=1;i<=n;i++)
//		   {
//		       if(i<n)
//		       {
//		     System.out.print("1/"+i+" + ");
//		     s+=1/(float)i;
//		       }
//		     if(i==n)
//		     {
//		    	 System.out.print("1/"+i+" + ");
//		     s+=1/(float)i;
//		     }
//		     }
//		System.out.println("\b");
//		        System.out.print("Sum of Series upto "+n+" terms : "+s);
//		}  
	
	
		//Program 9
//	public static void main(String[] args) {
//		System.out.println("Enter The Number Of Rows");
//		Scanner sc= new Scanner(System.in);
//		int row=sc.nextInt();
//		int i,j,p,q;
//		   for(i=1;i<=row;i++)
//		   {
//		     if(i%2==0)
//		     { p=1;q=0;}
//		     else
//		     { p=0;q=1;}
//		      for(j=1;j<=i;j++)
//			 if(j%2==0)
//			    System.out.print(p);
//			 else
//			    System.out.print(q);
//		     System.out.println();
//		   }
//	}
	
	
		//Program 10
//	public static void main(String[] args) {
//		int num,r,sum=0,t;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Input a number: ");
//	    num=sc.nextInt();
//	    for(t=num;num!=0;num=num/10){
//	         r=num % 10;
//	         sum=sum*10+r;
//	    }
//	System.out.println("The number in reverse order is "+sum);
//	}
	
	
		//Program 11
//	public static void main(String[] args) {
//		long num;
//	    int count = 0;
//	    Scanner sc=new Scanner(System.in);
//	    System.out.println("Enter any number: ");
//	    num=sc.nextLong();
//	    do
//	    {
//	        count++;
//	        num /= 10;
//	    } while(num != 0);
//	    System.out.println("Total digits: "+count);
//	}
	
	
		//Program 12
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int num, originalNum, remainder, n = 0;
//		   float result = 0;
//		   System.out.println("Enter an integer: ");
//		   num=sc.nextInt();
//		   originalNum = num;
//		   for (originalNum = num; originalNum != 0; ++n) {
//		       originalNum /= 10;
//		   }
//		   for (originalNum = num; originalNum != 0; originalNum /= 10) {
//		       remainder = originalNum % 10;
//		      result += Math.pow(remainder, n);
//		   }
//		   if ((int)result == num)
//		    System.out.println(num+" is an Armstrong number.");
//		   else
//		    System.out.println(num+" is not an Armstrong number.");
//	}
	
	
		//Program 13
//	public static void main(String[] args) {
//		 float xValue;
//		 Scanner sc=new Scanner(System.in);
//		    System.out.println("Enter the number ");
//		    xValue=sc.nextFloat();
//		    System.out.println(xValue+":");
//		    while(xValue >= 0) {
//		        System.out.print(xValue+" ");
//		        xValue -= 0.5;}
//	}
	
	
		//Program 14
//	public static void main(String[] args) {
//		int i, j, rows;  
//		Scanner sc = new Scanner(System.in);  
//		System.out.print("Enter the number of rows you want to print: ");  
//		rows = sc.nextInt();          
//		for (i= 0; i<= rows-1; i++)  
//		{  
//		for (j=0; j<=i; j++)   
//		{  
//		System.out.print("*"+ " ");  
//		}   
//		System.out.println("");   
//		}   
//		for (i=rows-1; i>=0; i--)  
//		{  
//		for(j=0; j <= i-1;j++)  
//		{  
//		System.out.print("*"+ " ");  
//		}  
//		System.out.println("");  
//		}  
//		}  
	
	
		//Pattern 15
//	public static void main(String[] args) {
//		char operator;
//	    Double number1, number2, result;
//	    Scanner input = new Scanner(System.in);
//	    System.out.println("Choose an operator: +, -, *, or /");
//	    operator = input.next().charAt(0);
//	    System.out.println("Enter first number");
//	    number1 = input.nextDouble();
//	    System.out.println("Enter second number");
//	    number2 = input.nextDouble();
//	    switch (operator) {
//	      case '+':
//	        result = number1 + number2;
//	        System.out.println(number1 + " + " + number2 + " = " + result);
//	        break;
//	      case '-':
//	        result = number1 - number2;
//	        System.out.println(number1 + " - " + number2 + " = " + result);
//	        break;
//	      case '*':
//	        result = number1 * number2;
//	        System.out.println(number1 + " * " + number2 + " = " + result);
//	        break;
//	      case '/':
//	        result = number1 / number2;
//	        System.out.println(number1 + " / " + number2 + " = " + result);
//	        break;
//	      default:
//	        System.out.println("Invalid operator!");
//	        break;
//	    }
//	}
	}

