/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @author shailendra
 *
 */
public class StringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = new String("Shailendra");
		System.out.println(name);
		
		String name2="Shailendra Singh";
		System.out.print(name2);
		
		String name3="Panwar";
		System.out.println(name3);
		
		int t=10;
		float b=5.6454f;
		char c='s';
		String naam="shailendra singh panwar";
		System.out.format("The value of t is %5d and value of b is %10.2f & first letter name is %c & name is %s",t,b,c,naam);
	//	System.out.printf("\"The value of t is %d and value of b is %f & first letter name is %c & name is %s",t,b,c,naam);
		
		// %d for int
		// %f for float
		// %c for char
		// %s for string
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String s=sc.nextLine();
		System.out.println(s);
				
		

	}

}
