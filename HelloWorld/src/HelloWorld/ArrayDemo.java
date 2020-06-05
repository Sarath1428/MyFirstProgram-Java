package HelloWorld;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[] = new int[5]; // normal array initialization
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;

		System.out.println(a[0] + " " + a[1] + " " + a[2]);

		int b[] = { 4, 5, 3 }; // array initialization without specifing size

		for (int i = 0; i < 3; i++) {
			System.out.print(" " + b[i]);
		}
		System.out.println();

		int d[][] = { { 1, 2, 3 }, { 4, 5, 6 } }; // two dimentional array

		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				
				System.out.print(" " + d[j][k]);

			}
			System.out.println();
		}

	}

}
