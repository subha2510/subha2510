package com.logical;

public class Coupon {

	public static void main(String[] args) {
		char[] chars = "abcdefghijklmnopqrstuvwyzABCDEFGHIJKLMNOPQRSTUVWYZ123456789" . toCharArray();
		int max = 100000000;
		int random = (int)(Math.random() * max);
		StringBuffer sb = new StringBuffer();
		while(random > 0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}
		String coupon = sb.toString();
		String couponcode = null;
		System.out.println("Coupon code: " + couponcode);
	}

}