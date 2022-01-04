/*


Ques 2:
n = 5
*
* *
* * *
* * * *
* * * * *


*/
import java.util.Scanner;
public class Pattern2 {
	public static void main(String h[]) {
		System.out.println("Enter the value of n");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		method1(n);
		System.out.println("--------------------------------------------");
		method2(n);
		
	}
	
	static void method1(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i >= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	static void method2(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
