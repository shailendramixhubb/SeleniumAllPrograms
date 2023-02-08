/**
 * 
 */
package java_Practise_Set;

/**
 * @Shailendra
 *
 */
public class ReverseString {
	public static void main(String[] args) {
	
		String str= "Vijay";
		String nstr="";
		char ch;
		for(int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			nstr=ch+nstr;
			
		}
		System.out.println(nstr.toLowerCase().toUpperCase());
	}

}
