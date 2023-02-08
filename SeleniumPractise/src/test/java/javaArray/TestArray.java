/**
 * 
 */
package javaArray;

/**
 * @Shailendra
 *
 */
public class TestArray {
	public static void main(String[] args) {
		
		int[][][] x= {{{10,20,30},{40,50,60}},      {{70,80},{90,100,110}}};
		
		
		
		System.out.println(x[1][0][1]);
		System.out.println( x[0][0][1]);
		
		System.out.println(x[1][0][0]);
		System.out.println(x[1][1][0]);
		System.out.println(x[0][1][0]);
		System.out.println(x[0][0][2]);
	
		System.out.println("--------------");
		
		int[] y= new int [10];
		System.out.println(y.length);
		
		String s="shailendra";
		System.out.println(s.length());
		
		String[] str = {"A","Singh","Panwar"};
		System.out.println(str.length);
		System.out.println(str[0].length());
		System.out.println(str[2].length());
		
		System.out.println("--------------");
		
		int[][] j= new int [6][13];
	
		System.out.println(j[5].length);
		
		
	}

}
