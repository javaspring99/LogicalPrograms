package test;

import java.util.Scanner;

public class PalindromeStringAndInteger {

	public static void main(String[] args) {
		String original,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		original=s.nextLine();
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println("original String:"+original);
		System.out.println("reverse String:"+reverse);
		if(original.equals(reverse)) {
			System.out.println("It is Palindrome String");
		}
		else {
			System.out.println("It is not Palindrome String");
		}
	}
}
