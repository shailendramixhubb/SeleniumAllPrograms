/**
 * 
 */
package java_cod_Harry;

/**
 * @Shailendra
 *
 */
public class PS_6_Replace_spaceWith_UnderScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Shailendra Singh";
				
				System.out.println(name.replace(" ", "_"));
				
				String letter= "Dear </name>, Thanks a lot";
				String nameReplace=letter.replace("</name>", "Shailendra");
				System.out.println(nameReplace);
				
				String spcaefind="This is harry  for learn java";
				System.out.println(spcaefind.indexOf("   "));
				System.out.println(spcaefind.indexOf("  "));
				
				String letter2="Dear Harry,\n This java course is very nice!\n Thanks";
				
				System.out.println(letter2);

	}

}
