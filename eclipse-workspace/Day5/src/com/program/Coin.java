package com.program;
import java.util.Random;
public class Coin {
	public static void main(String[] args) {
		int coin;
		Random rand = new Random();
		coin = rand.nextInt(4);
		if(coin == 1)
		{
System.out.println("Heads");
	}
		else
		{
			System.out.println("Tails");
		}
}
}
