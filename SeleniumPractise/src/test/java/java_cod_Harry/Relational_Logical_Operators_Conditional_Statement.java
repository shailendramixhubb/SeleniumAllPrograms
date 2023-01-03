/**
 * 
 */
package java_cod_Harry;

/**
 * @Shailendra
 *
 */
public class Relational_Logical_Operators_Conditional_Statement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// && use for both condition is true
		
		boolean a =true;
		boolean b=false;
		
		if(a==true && b==true) {
			
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		int age=30;
		if(age==18 || age>=18) {
			System.out.println("Yo can drive");
		}
		else {
			System.out.println("You can not drive");
		}
		
		int age1=30;
		if(age1==18 && age>=18) {
			System.out.println("Yo can drive");
		}
		else {
			System.out.println("You can not drive");
		}
	}

}
