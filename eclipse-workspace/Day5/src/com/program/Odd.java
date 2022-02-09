package com.program;
import java.util.Scanner;
public class Odd {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = s.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("The given number " + n + " is even");
		}
		else
		{
			System.out.println("The given number " + n + " is odd");
		}

	}

}
