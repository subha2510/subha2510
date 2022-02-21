package com.logical;
import java.util.Scanner;
public class Perfect {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = s.nextInt();
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				sum = sum + i;
			}
		}
				// TODO Auto-generated method stub
if(sum == n)
{
	System.out.println("It is perfect number");
}
else
{
	System.out.println("It is not a perfect number");
}

	}

}