/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class ConditionalStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("You can driver the car");
		}
		else {
			System.out.println("You can not driver the car");
		}
		

	}

}
