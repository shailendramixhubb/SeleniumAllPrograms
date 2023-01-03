/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class GradeSystemUsingConditionalStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter maths number");
		int maths=sc.nextInt();
		
		System.out.println("Please enter English number");
		int english=sc.nextInt();
		
		System.out.println("Please enter physics number");
		int physics=sc.nextInt();
		
		System.out.println("Please enter chemsitry number");
		int chemsitry=sc.nextInt();
		
		System.out.println("Please enter hindi number");
		int hindi=sc.nextInt();
		
		int total=maths+english+physics+chemsitry+hindi;
		
		int percentage=total*100/500;
		System.out.println(percentage+"%");
		
		if(percentage>=80) {
			System.out.println("Your garde is A");
			
		}
		else if(percentage>=60 && percentage<80) {
			System.out.println("Your grade is B");
		}
		else if (percentage>45 && percentage<60) {
			System.out.println("Your grade is C");
		}
		else {
			System.out.println("Bhag yaha se");
		}
		
		

	}

}
