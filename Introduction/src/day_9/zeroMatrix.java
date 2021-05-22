package day_9;

import java.util.Scanner;

public class zeroMatrix {
	int n;
	public zeroMatrix(int rc) {
		this.n=rc;
	}
	public void print() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(0+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of Rows And Columns");
		int n=sc.nextInt();
		zeroMatrix m1=new zeroMatrix(n);
		m1.print();

	}

}
