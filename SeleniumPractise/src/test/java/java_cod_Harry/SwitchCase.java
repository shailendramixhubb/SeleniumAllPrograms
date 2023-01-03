/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=sc.nextInt();
		
		switch (age) {
		case 18:
		System.out.println("You are become join a job");
		break;
		
		case 22:
		System.out.println("Enjoy your life");
		break;
		
		case 45:
			System.out.println("You can go visit for outside of India");
			break;
		
		}
		
		
		
		
		
		
		
		
		
		/*
		 * if(age>=56) { System.out.println("You have good experince"); }
		 * 
		 * else if(age>=45 && age<56) { System.out.println("You have semi experience");
		 * 
		 * } else { System.out.println("Not sufficient"); }
		 */

	}

}
