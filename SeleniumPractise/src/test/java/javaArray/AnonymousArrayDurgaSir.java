/**
 * 
 */
package javaArray;

/**
 * @Shailendra
 *
 */
public class AnonymousArrayDurgaSir {
	public static void main(String[] args) {
		
		sum(new int[] {10,20,30,40});
		System.out.println();
		
	}
	
	public static void sum(int[]x) {
		
		int total=0;
		for(int x1:x) {
			
			total=total+x1;
		}
		System.out.println("The total sum of : "+total);
	}

}
