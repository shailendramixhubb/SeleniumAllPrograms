package javaprograms;

public class Inverted_triangle_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		for (int i = 1; i >= row; i++) {
			
			for (int j = 1; j <= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
