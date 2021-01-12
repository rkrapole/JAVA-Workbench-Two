package packagehandson;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, fact = 1;
		Scanner k = new Scanner(System.in);
		System.out.println("enter the number: ");
		n = k.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
				}
		System.out.println("factorial of "+n+" is: "+fact);

	}

}
