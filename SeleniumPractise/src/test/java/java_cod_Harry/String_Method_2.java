/**
 * 
 */
package java_cod_Harry;

/**
 * @Shailendra
 *
 */
public class String_Method_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Shailendra singh";
		int findlength=name.length();
		
		System.out.println(findlength);
	
		// Remove space count
		System.out.println(name.replace(" ", "").length());
		
		String lc= "TESTING demo";
		System.out.println(lc.toLowerCase());
		System.out.println(lc.toUpperCase());

	}

}
