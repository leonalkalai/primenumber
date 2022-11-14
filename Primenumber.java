// Write a program to check if a  number is prime or not

import java.util.Scanner;
import java.lang.Math;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please insert a number"); // ask for user to type number
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // the user input number to be checked for palindrome  
		
		int count =0;
		for(int i=1;i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				count+=2;
			}	
		}
		if(count==2) {
			  System.out.println("is a prime");
		}
		else {
			 System.out.println("is not a prime");
		}

	}

	

}
