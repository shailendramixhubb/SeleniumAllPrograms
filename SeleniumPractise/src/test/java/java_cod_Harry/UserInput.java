package java_cod_Harry;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter your first name");
		// Next line is use for showing after space text
		String name=s.nextLine();
	
		
		System.out.println("Please enter you last name");
		// Next only showing first text not showing after space
		String lname=s.next();
		
		System.out.println("Please enter your package");
		float packages=s.nextFloat();
		
		
		System.out.println("Please enter your age");
		int age=s.nextInt();
		
		System.out.println("Please enter mobile number");
		boolean b1= s.hasNextDouble();
		
		
		
		
		
		System.out.println("Please enter your name first letter");
		char c= s.next().charAt(0);
		
		System.out.println("Your full name is "+name+" "+lname);
		System.out.println("Your package is "+packages);
		System.out.println("Your age is "+age);
		System.out.println(b1);
		System.out.println("Your name first letter is "+c);
	}

}
