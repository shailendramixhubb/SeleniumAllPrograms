/**
 * 
 */
package javaprograms;

/**
 * @Shailendra
 *
 */
public class Palindrom {
	public static void main(String[] args) {
		
		int r;
		int sum=0;
		int temp;
		int n=454;
		
		temp=n;
		
		while(n>0) {
			
			
			// Getting reminder
			r=n%10;
			
			sum=(sum*10)+r;
			n=n/10;
			
			
		}
		if(temp==sum) {
			
			System.out.println("This is palindrom number");
		}
		else {
			
			
			
			System.out.println("Not a palindrom");
		}
	}
}
