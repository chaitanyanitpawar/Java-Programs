package javaString;

import java.util.Scanner;

public class JavaString {
	
	
		//Program 1
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The String");
//		String s=sc.nextLine();
//		System.out.println("The Size Of String You Entered Is: "+s.length());
//	}
	
	
		//Program 2
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The String");
//		String s=sc.nextLine();
//		System.out.println("Enter The Letter You Want To Search");
//		char l=sc.next().charAt(0);
//		boolean flag=false;
//		for (int i=0;i<s.length();i++) {
//			if (l==s.charAt(i)) {
//				flag=true;
//			}
//		}
//		if(flag==true) {
//			System.out.println("The letter "+l+" is present in "+s);
//		}
//		else {
//			System.out.println("The letter "+l+" is not present in "+s);
//		}
//	}
	
	
		//Program 3
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The String");
//		String sentence=sc.nextLine();
//		System.out.println("Enter The Word You Want To Search");
//		String word=sc.next();
//		String []s = sentence.split(" ");
//		boolean flag=false;
//		for ( String temp :s)
//	    {
//	        if (temp.compareTo(word) == 0)
//	        {
//	            flag= true;
//	        }
//	    }
//		if(flag==true) {
//			System.out.println("The word "+word+" is present in "+sentence);
//		}
//		else {
//			System.out.println("The letter "+word+" is not present in "+sentence);
//		}
//	}
	
	
		//Program 4
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter The Full Name");
//	    String st = s.nextLine();
//	    String sr = "";
//	    sr = sr+st.charAt(0);
//	    sr = sr+". ";
//	    for (int i = 0; i<st.length();i++){
//	      if(st.charAt(i) == ' ' && st.charAt(i+1)!=' ' && i+1<st.length()){
//	        sr = (sr+st.charAt(i+1)).toUpperCase();
//	        sr = sr+". ";
//	      }
//	    }
//	    String last_wrd = "";
//	    for(int i = st.length()-1;i>=0;i--){
//	      if(st.charAt(i) == ' '){
//	        last_wrd = st.substring(i+2);
//	        break;
//	      }
//	    }
//	    sr = sr.substring(0,sr.length()-2);
//	    sr = sr+last_wrd;
//	    System.out.println("Your Name Is: ");
//	    System.out.println(sr);
//	  }
	
	
		//Program 5
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The First Name");
//		String fname=sc.next();
//		System.out.println("Enter The Middle Name");
//		String mname=sc.next();
//		System.out.println("Enter The Surname");
//		String sname=sc.next();
//		String name=fname+" "+mname+" "+sname;
//		System.out.println("Your Full Name Is: "+name);
//	}
	
	
		//Program 6
//	public static void main(String[] args) {
//		String original, reverse = ""; 
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Enter a string to check if it is a palindrome");  
//	      original = in.nextLine();   
//	      int length = original.length();   
//	      for ( int i = length - 1; i >= 0; i-- )  
//	         reverse = reverse + original.charAt(i);  
//	      if (original.equals(reverse)) {  
//	         System.out.println("Entered string is a palindrome."); 
//	         } 
//	      else  {
//	         System.out.println("Entered string isn't a palindrome."); 
//	      }
//	}
	
	
		//Program 7
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Day");
//		String dd=sc.next();
//		System.out.println("Enter The Month");
//		String mm=sc.next();
//		System.out.println("Enter The Year");
//		String yy=sc.next();
//		String date=dd+"/"+mm+"/"+yy;
//		System.out.println("Date Is: "+date);
//	}
}
