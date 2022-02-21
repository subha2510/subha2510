package com.logical;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
int temp;
boolean isPrime = true;
Scanner s = new Scanner(System.in);
System.out.println("Enter any number: ");
int num = s.nextInt();
s.close();
for(int i = 2; i <= num/2; i++)
{
	temp = num % i;
	if(temp == 0)
	{
		isPrime = false;
		break;
	}
}
if(isPrime)
	System.out.println(num + " is a prime number");
else 
	System.out.println(num + " is not a prime number");
	}

}

