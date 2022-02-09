package com.program;
import java.util.Scanner;
public class Harmonic {
	public static void main(String[] args) {
System.out.println("Enter any number: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println("The Harmonic series is: ");
double result = 0.0;
while(num > 0)
{
	result = result + (double)1 / num;
	num--;
	System.out.println(result + " ");
}
System.out.println(" ");
System.out.println("Output of Harmonic Series is: " + result);
	// TODO Auto-generated method stub

	}

}
