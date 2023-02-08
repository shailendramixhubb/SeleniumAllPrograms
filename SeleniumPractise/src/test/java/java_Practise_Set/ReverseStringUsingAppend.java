/**
 * 
 */
package java_Practise_Set;

/**
 * @Shailendra
 *
 */
public class ReverseStringUsingAppend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Laptop";
		StringBuilder sb= new StringBuilder();
		sb.append(str.toLowerCase());
		sb.reverse();
		System.out.println(sb);
		

	}

}
