/*
 
 
 Ques 11:
n = 5
        *
      *   *
    *   *   *
  *   *   *   *
*   *   *   *   *
 
 
 */
import java.util.Scanner;
public class Pattern11 {
	public static void main(String h[]) {
		System.out.println("Enter the value of n");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		method1(n);
	}
	
	static void method1(int n) {
		for(int i = 0; i < n; i++) {
			boolean flag = true;
			for(int j = 0; j < n; j++) {
				if(i + j >= n-1) {
					if(flag) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					flag = !flag;
				} else {
					System.out.print("  ");
				}
				
			}
			for(int j = 0; j < n; j++) {
				if( i > j) {
					if(flag) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					flag = !flag;
				} else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
