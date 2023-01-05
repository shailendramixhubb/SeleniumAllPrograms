/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class Table_Using_For_Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number which you want table");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
