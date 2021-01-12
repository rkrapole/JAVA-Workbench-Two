package packagehandson;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1, n3, num, temp;
		Scanner k = new Scanner(System.in);
		System.out.println("enter the number: ");
		num = k.nextInt();

		System.out.print(n1 + " " + n2);
		for (int i = 1; i <= num - 2; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
