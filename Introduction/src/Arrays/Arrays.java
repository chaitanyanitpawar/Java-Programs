package Arrays;

import java.util.Scanner;

public class Arrays {
		//Program 1
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Total Number Of Elements");
//		int n=sc.nextInt();
//		int[] array=new int[n];
//		int sum=0;
//		for (int i=0;i<n;i++) {
//			System.out.println("Enter The Element Number: "+(i+1));
//			array[i]=sc.nextInt();
//		}
//		for(int ele:array) {
//			sum+=ele;
//		}
//		float avg=(float)sum/n;
//		System.out.println("The Average Of Given "+n+" Elements Is "+avg);
//	}
	
	
		//Program 2
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int[][] cityTemp=new int[2][7];
//		for (int i=0;i<2;i++) {
//			System.out.println("For City "+(i+1)+":");
//			for (int j=0;j<7;j++) {
//				System.out.println("Enter The Temperature For Day "+(j+1));
//				cityTemp[i][j]=sc.nextInt();
//			}
//		}
//		for (int i=0;i<2;i++) {
//			System.out.println("For City "+(i+1)+":");
//			for (int j=0;j<7;j++) {
//				System.out.print("The Temperature For Day "+(j+1)+" is:");
//				System.out.println(cityTemp[i][j]);
//			}
//		}
//	}
	
	
		//Program 3
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter The Number Of Rows And Columns");
//		int n=sc.nextInt();
//		int[][] matrix=new int[n][n];
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.println("Enter The ["+(i+1)+"]["+(j+1)+"] Element");
//				matrix[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("The Matrix Is:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
	
	
		//Program 4
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter The Number Of Rows And Columns");
//		int n=sc.nextInt();
//		int[][] m1=new int[n][n];
//		int[][] m2=new int[n][n];
//		int[][] rm=new int[n][n];
//		System.out.println("For Matrix 1:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.println("Enter The ["+(i+1)+"]["+(j+1)+"] Element");
//				m1[i][j]=sc.nextInt();
//			}
//		}
//		
//		System.out.println("For Matrix 2:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.println("Enter The ["+(i+1)+"]["+(j+1)+"] Element");
//				m2[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("The Matrix 1 Is:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.print(m1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("The Matrix 2 Is:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.print(m2[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("The Resultant Matrix Is:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				rm[i][j]=m1[i][j]+m2[i][j];
//			}
//		}
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.print(rm[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
	
	
		//Program 5
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Total Number Of Elements");
//		int n=sc.nextInt();
//		int[] array=new int[n];
//		int sum=0;
//		for (int i=0;i<n;i++) {
//			System.out.println("Enter The Element Number: "+(i+1));
//			array[i]=sc.nextInt();
//		}
//		for(int ele:array) {
//			sum+=ele;
//		}
//		System.out.println("The Sum Of Given "+n+" Elements Is "+sum);
//	}
	
	
		//Program 6
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String[] fruits=new String[5];
//		for (int i=0;i<=4;i++) {
//			System.out.println("Enter The Fruit Name:");
//			fruits[i]=sc.next();
//		}
//		System.out.println("The Fruits You Entered Are: ");
//		for(String fruit:fruits) {
//			System.out.println(fruit);
//		}
//	}
	
	
		//Program 7
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number Of Elements");
//		int n=sc.nextInt();
//		int[] ele=new int[n];
//		int max=0;
//		for (int i=0;i<n;i++) {
//			System.out.println("Enter The Element");
//			ele[i]=sc.nextInt();
//		}
//		if (n>0) {
//			max=ele[0];
//			for(int elem:ele) {
//				if (elem>max) {
//					max=elem;
//				}
//			}
//			System.out.println("Maximum Element: "+max);
//		}
//		else {
//			System.out.println("Please Enter Atleast One Element");
//		}
//	}
	
	
		//Program 8
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number Of Elements");
//		int n=sc.nextInt();
//		int[] ele=new int[n];
//		int min=0;
//		for (int i=0;i<n;i++) {
//			System.out.println("Enter The Element");
//			ele[i]=sc.nextInt();
//		}
//		if (n>0) {
//			min=ele[0];
//			for(int elem:ele) {
//				if (elem<min) {
//					min=elem;
//				}
//			}
//			System.out.println("Minimum Element: "+min);
//		}
//		else {
//			System.out.println("Please Enter Atleast One Element");
//		}
//	}
	
	
		//Program 9
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number Of Elements");
//		int n=sc.nextInt();
//		int[] array=new int[n];
//		for (int i=0;i<n;i++) {
//			System.out.println("Enter The Element");
//			array[i]=sc.nextInt();
//		}
//		System.out.print("The Even Numbers Are: ");
//		for(int num:array) {
//			if(num%2==0) {
//				System.out.print(num+" ");
//			}
//		}
//		System.out.println();
//		System.out.print("The Odd Numbers Are: ");
//		for(int num:array) {
//			if(num%2!=0) {
//				System.out.print(num+" ");
//			}
//		}
//	}
	
	
		//Program 10
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter The Number Of Rows And Columns");
//		int n=sc.nextInt();
//		int[][] m1=new int[n][n];
//		int[][] m2=new int[n][n];
//		int[][] rm=new int[n][n];
//		System.out.println("For Matrix 1:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.println("Enter The ["+(i+1)+"]["+(j+1)+"] Element");
//				m1[i][j]=sc.nextInt();
//			}
//		}
//		
//		System.out.println("For Matrix 2:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.println("Enter The ["+(i+1)+"]["+(j+1)+"] Element");
//				m2[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("The Matrix 1 Is:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.print(m1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("The Matrix 2 Is:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.print(m2[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("The Resultant Matrix Is:");
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				rm[i][j]=m1[i][j]-m2[i][j];
//			}
//		}
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				System.out.print(rm[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
	
	
		//Program 11
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number Of Elements");
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			System.out.println("Enter The Element");
//			arr[i]=sc.nextInt();
//		}
//        int [] fr = new int [arr.length];  
//        int visited = -1;      
//        for(int i = 0; i < arr.length; i++){  
//            int count = 1;  
//            for(int j = i+1; j < arr.length; j++){  
//                if(arr[i] == arr[j]){  
//                    count++;  
//                    fr[j] = visited;  
//                }  
//            }  
//            if(fr[i] != visited)  
//                fr[i] = count;  
//        }   
//        System.out.println("---------------------");  
//        System.out.println(" Element | Frequency");  
//        System.out.println("---------------------");  
//        for(int i = 0; i < fr.length; i++){  
//            if(fr[i] != visited)  
//                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
//        }  
//        System.out.println("---------------------");  
//    }  
	
	
		 

}

