/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class PS_10_LeapYear {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter year");
		int year=sc.nextInt();
		
		if((year%400==0)||(year%4==0)&&(year%100!=0)) {
			
			System.out.println("This is leap yeaar");
		}
		else {
			System.out.println("This is not leap year");
		}
		
		
	}

}
