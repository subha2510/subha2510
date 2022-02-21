package com.logical;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		int num = 456;
		int reversenum = 0;
		System.out.println("Enter the number: ");
		Scanner n = new Scanner(System.in);
		num = n.nextInt();
		while(num != 0)
		{
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;// TODO Auto-generated method stub
		}
System.out.println("Reverse number: " + reversenum);
	}

}
