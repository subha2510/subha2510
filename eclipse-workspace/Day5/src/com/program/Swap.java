package com.program;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		int x, y, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping numbers: " + x + " " + y);
		t = x;
		x = y;
		y = t;
		System.out.println("After Swapping: " + x + " " + y);

	}

}

