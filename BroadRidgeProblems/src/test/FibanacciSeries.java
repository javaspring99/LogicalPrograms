package test;

import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) {
		int a=0,b=0,c=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.:");
		int num=s.nextInt();
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}
}
