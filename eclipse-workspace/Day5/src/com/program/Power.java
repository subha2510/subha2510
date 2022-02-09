package com.program;
public class Power {
	public static void main(String[] args) {
		int i = 0;
		int powerofTwo = 1;
		int n = 2;
		while (i <= n){
			System.out.println(i + " " + powerofTwo);
			powerofTwo = 2 * powerofTwo;
			i = i + 1;
		}

	}

}

