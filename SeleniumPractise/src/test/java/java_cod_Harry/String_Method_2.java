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
		
		System.out.println(substring.substring(0));
		
		System.out.println(substring.substring(4, 9));
		
		System.out.println("-----------------------");
		
		// Replce method
		
		String nam="Harry  p";
		System.out.println(nam.replace('r', 'p'));
		System.out.println(nam.replace('r', 'p').toUpperCase().trim().replace(" ", ""));
		System.out.println("-----------------------");
		
		// Startwith and endwith boolean check
		
		String startwith="Shailendra";
		System.out.println(startwith.startsWith("Sha"));
		System.out.println(startwith.startsWith("LAI"));
		
		String endwith="Shailendra";
		System.out.println(endwith.endsWith("ra"));
		System.out.println(endwith.endsWith("pp"));
		
		System.out.println("-----------------------");
		
		// CharAt
		String charat="shailendra";
		System.out.println(charat.charAt(0));
		System.out.println(charat.charAt(9));
		
		System.out.println("-----------------------");
		
		// Index of matlab kon se number pr wo text aa rha he 
		
		String naaam="Shailendra";
		System.out.println(naaam.indexOf("i"));
		System.out.println(naaam.indexOf("a"));
		
		// isme hume kon si index se find karna start krna he 
		
		System.out.println(naaam.indexOf("a",5));
		
		// Last index of 
		
		System.out.println(naaam.lastIndexOf("a"));
		System.out.println(naaam.lastIndexOf("a",3));
		
		
		// Equals returns true if the given string 	is equl to name otherwise false
		
		String myname="Shailendra";
		System.out.println(myname.equals("Shailendra"));
		System.out.println(myname.equals("shailendra"));
		System.out.println(myname.equalsIgnoreCase("shailendra"));
		System.out.println(myname.equalsIgnoreCase("SHAILENDRA"));
		
		// Escape sequence charecters :   sequence of charecters after backslash '\'=escape sequence chareters
		// /n = New line charecters
		// /t = tab
		// \" for double qotes
		//
		
		
		
		System.out.println("My name is \"Shailendra Sing\"");
		System.out.println("Learning Jav from \\ Harry");
		System.out.println("Java is most powerfull \n lnguage");
		System.out.println("String method is main in \t \t java");
		
	
		
		
		

	}

}
