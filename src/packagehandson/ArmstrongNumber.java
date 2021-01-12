package packagehandson;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, q, qSum = 0;
		
		Scanner k = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = k.nextInt();
		
		temp = num;
		
		 for (; num != 0; num = num/10) {
			 
			 q = num%10;
			 qSum = qSum + (q*q*q);
					
		}
		 if(temp == qSum) {
			 System.out.println(temp+" is a Armstrong number");
		 }
		 else {
			 System.out.println(temp+" is a not a Armstrong number");
		 }
		

	}

}
