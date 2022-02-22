package com.lineconversion;
import java.util.Scanner;
public class Equality {
	public static void main(String[] args) {
		int x1,x2,y1,y2,x3,x4,y3,y4;
		Double lengthOfFirstLine,lengthOfSecondLine;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point");
		x1=sc.nextInt();
		System.out.println("Enter y1 point");
		y1=sc.nextInt();
		System.out.println("Enter x2point");
		x2=sc.nextInt();
		System.out.println("Enter y2 point");
		y2=sc.nextInt();
		lengthOfFirstLine=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Enter x3 point");
		x3=sc.nextInt();
		System.out.println("Enter y3 point");
		y3=sc.nextInt();
		System.out.println("Enter x4 point");
		x4=sc.nextInt();
		System.out.println("Enter y4 point");
		y4=sc.nextInt();
		lengthOfSecondLine=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
		System.out.println("lengthOfFirstLine "+lengthOfFirstLine+" lengthOfSecondLine "+lengthOfSecondLine);
		if (lengthOfFirstLine.equals(lengthOfSecondLine))
		{
			System.out.println("Both lines are equal");
		}else 
		{
			System.out.println("Both lines are not equal");
		}

	}

}
