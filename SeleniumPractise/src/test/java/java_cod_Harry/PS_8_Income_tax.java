/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class PS_8_Income_tax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Please enter your income");
		double income=sc.nextDouble();
		
		if(income>250000 && income<500000) {
			
			double percentage=income*5/100;
			System.out.println("You need to pay 5% income tax :"+percentage);
			
			
			
		}

	}

}
