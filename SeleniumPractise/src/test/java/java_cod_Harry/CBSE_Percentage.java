package java_cod_Harry;

import java.util.Scanner;

public class CBSE_Percentage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		System.out.println("Enter your maths marks");
		int maths=sc.nextInt();
		
		System.out.println("Enter your physics marks");
		int physics=sc.nextInt();
		
		System.out.println("Enter your english marks");
		int english=sc.nextInt();
		
		System.out.println("Enter your hindi marks");
		int hindi=sc.nextInt();
		
		System.out.println("enter you chemistry marks");
		int chemistry=sc.nextInt();
		
		int total=maths+physics+chemistry+english+hindi;
		
		int percentage=total*100/500;
		
		System.out.println(percentage);
		
		
		
	}

}
