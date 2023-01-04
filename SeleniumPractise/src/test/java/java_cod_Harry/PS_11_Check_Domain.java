/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class PS_11_Check_Domain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter website domain");
		
		String website=sc.next();
		
		if(website.endsWith(".com")) {
			
			System.out.println("This is commercial website");
		}
		else if(website.endsWith(".in")) {
			
			System.out.println("Indian Website");
		}
		else if(website.endsWith(".org")) {
			System.out.println("Organization website");
		}
		else {
			System.out.println("Not included");
		}
	}

}
