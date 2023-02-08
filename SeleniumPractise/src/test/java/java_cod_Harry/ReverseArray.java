/**
 * 
 */
package java_cod_Harry;

/**
 * @Shailendra
 *
 */
public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] marks= {10,20,30,40,50};
		
		
		
		for(int i=0;i<marks.length;i++) {
			
			System.out.println(marks[i]);
		}
		System.out.println("Reverse order");
		
		for (int i=marks.length-1;i>=0;i--) {
			
			System.out.println(marks[i]);
			
			
		}
	}

}
