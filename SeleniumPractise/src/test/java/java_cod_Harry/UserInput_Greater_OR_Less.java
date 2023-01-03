package java_cod_Harry;

import java.util.Scanner;

public class UserInput_Greater_OR_Less {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your number");
		int b=sc.nextInt();
		
		System.out.println(b>10);
		
		boolean c=a>b;
		System.out.println(c);
		
		boolean d=a<b;
		System.out.println(d);

	}

}
