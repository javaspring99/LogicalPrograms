package test;

public class StarPattern {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int k=num;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-1;i>=1;i--) {
			for(int k=num;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//Output:
//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *
