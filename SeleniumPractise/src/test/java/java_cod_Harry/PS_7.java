/**
 * 
 */
package java_cod_Harry;

import java.lang.ref.PhantomReference;
import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class PS_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		if(a==10) {
			System.out.println("Correct");
			
		}
		else {
			System.out.println("Not correct");
		}
		
		// Question 2 Program for student fail o f pass 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter Maths marks");
		float maths=sc.nextFloat();
		
		System.out.println("Please enter science marks");
		float science=sc.nextFloat();
		
		System.out.println("Please enter english marks");
		float english=sc.nextFloat();
		
		System.out.println("Please enter hindi  marks");
		float hindi=sc.nextFloat();
		
		System.out.println("Please enter chemistry marks");
		float chemistry=sc.nextFloat();
		
		float total=maths+science+english+hindi+chemistry;
		
		float percentage=total*100/500;
		
		System.out.println(percentage+"%");
		
		if(percentage>80 && percentage<100) {
			
			System.out.println("First Grade");
		}
		else if(percentage>=60 && percentage<80) {
			
			System.out.println("Grade B");
		}
		else if(percentage>=33 && percentage<45)
		{
			System.out.println("Grade c");
		}
		else {
			System.out.println("Fail ho gaya he tu");
		}
		
		

	}

}
