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
		
		// Find length of the string
		
		String name ="Shailendra singh";
		int findlength=name.length();
		
		System.out.println(findlength);
		System.out.println("-----------------------");
	
		// Remove space count
		System.out.println(name.replace(" ", "").length());
		
		// String LowerCase And UpperCase
		
		String lc= "TESTING demo";
		System.out.println(lc.toLowerCase());
		System.out.println(lc.toUpperCase());
		
		System.out.println("-----------------------");
		
		// Trim is used for remove space
		
		String nontrimstring="           Shailendra            ";
		System.out.println(nontrimstring);
		String trimmedstring=nontrimstring.trim();
		System.out.println(trimmedstring);
		System.out.println(nontrimstring.trim());
		
		System.out.println("-----------------------");
		
		// Substring start index matlab hum jaha se number dalenge waha se start hoga 
		// Example shailendra ab me substring me 4 add karta hu to l se start hoga word
		
		String substring="Shailendra";
		System.out.println(substring.substring(4));

	}

}
