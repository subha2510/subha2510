package com.lineconversion;
import java.util.Scanner;
public class Linecomparision {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation program");
		Linecomparision linecomp = new Linecomparision();
		linecomp.getLength();
			}
	public void getLength() {
		Scanner sc = new Scanner(System.in);
		int x1, x2, x3, x4, y1, y2, y3, y4;
		System.out.println("Enter x1 and x2 value");
		x1=sc.nextInt();
		x2=sc.nextInt();
		System.out.println("Enter y1 and y2 value");
		y1=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("Enter x3 and x4 value");
		x3=sc.nextInt();
		x4=sc.nextInt();
		System.out.println("Enter y3 and y4 value");
		y3=sc.nextInt();
		y4=sc.nextInt();
		int Length1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		int Length2=(int)Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		System.out.println("Length of line1 is : " + Length1);
		System.out.println("Length of line2 is : " + Length2);
		Integer lineLength1=Length1;
		Integer lineLength2=Length2;
		int result=lineLength1.compareTo(lineLength2);
		if(lineLength1.equals(lineLength2)) {
			System.out.println("Lines are equal");
		}
		else {
			System.out.println("Lines are not equal");
		}
		if(result>0) {
			System.out.println("Line1 is greater than Line2");
		}
		else if(result<0) {
			System.out.println("Line1 is less than line2");
		}
		else {
			System.out.println("Line1 is equal to Line2");
		}
	}

}
