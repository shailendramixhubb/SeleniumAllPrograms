/**
 * 
 */
package quiz;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class Reverse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enetr your name");
		String name=sc.next();
		String nstr="";
		char ch;
		for(int i=0;i<name.length();i++) {
			
			ch=name.charAt(i);
			nstr=ch+nstr;
			
		}
		System.out.println(nstr.toUpperCase());
		
	}

}
