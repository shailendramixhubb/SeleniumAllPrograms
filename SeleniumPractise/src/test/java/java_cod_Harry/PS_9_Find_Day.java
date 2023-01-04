/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class PS_9_Find_Day {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter Day name");
		int str=sc.nextInt();
		
		switch(str) {
		
		case 1:
			System.out.println("This is monday");
			break;
		case 2:
			System.out.println("This tuesday");
			break;
		case 3:
			System.out.println("This is wednesday");
			break;
		case 4:
			System.out.println("This is thursday");
			break;
		case 5:
			System.out.println("This is friday");
			break;
		case 6:
			System.out.println("This is saturday");
			break;
		case 7:
			System.out.println("This is Sunday");
			default:
				System.out.println("Day not found!!!!");
		}

	}

}
