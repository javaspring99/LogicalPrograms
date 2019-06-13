/**Prime number or not**/
package test;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=s.nextInt();
		int temp = 0;
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num+" is prime no.");
		else
			System.out.println(num+" is not prime no.");
	}
		
}
