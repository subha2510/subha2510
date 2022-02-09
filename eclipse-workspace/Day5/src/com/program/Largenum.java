package com.program;
import java.util.Scanner;
public class Largenum {
	public static void main(String[] args) {
int x, y, z;
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number: ");
x = s.nextInt();
System.out.println("Enter the second number: ");
y = s.nextInt();
System.out.println("Enter the third number: ");
z = s.nextInt();
if(x > y && x > z)
{
	System.out.println("Largest number is x: " + x);
}
else if(y > z)
{
	System.out.println("Largest number is y: " + y);
}
else
{
	System.out.println("Largest number is z: " + z);
}
	}

}
