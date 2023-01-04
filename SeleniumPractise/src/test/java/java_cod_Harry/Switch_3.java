/**
 * 
 */
package java_cod_Harry;

import java.util.Scanner;

/**
 * @Shailendra
 *
 */
public class Switch_3 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Plese enter your age");
		int a=s.nextInt();
		
		switch(a) {
		
		case 30:
			System.out.println("You can drive the Bike");
			break;
		case 45:
			System.out.println("You can drive the Bike and car");
			break;
		case 60:
			System.out.println("You can drive the Bike,car and truck");
			break;
		case 75:
			System.out.println("You can drive the Bike,car,truck and heavy wheel");
			break;
			default:
				System.out.println("You ar not eligible");
		}
		
	}

}
