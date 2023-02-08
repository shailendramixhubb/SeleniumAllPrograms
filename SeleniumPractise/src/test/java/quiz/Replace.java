/**
 * 
 */
package quiz;

/**
 * @Shailendra
 *
 */
public class Replace {
	public static void main(String[] args) {
		
		String str= "Shailendra singh";
		System.out.println(str.replace(" ", "_"));
		
		String st1="Laptop";
		System.out.println(st1.replace('L', 'k'));
	
		String st ="VIJAY";
		String nstr="";
		char ch;
		for(int i=0;i<st.length();i++) {
			ch=st.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println(nstr.toLowerCase());
	}
	

}
