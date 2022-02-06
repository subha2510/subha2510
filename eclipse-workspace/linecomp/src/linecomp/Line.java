package linecomp;
import java.util.Scanner;
public class Line {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2, x3, x4, y3, y4;
		int line1, line2;
		System.out.println("Enter the value of x1 and y1");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		System.out.println("Enter the value of X2 and y2");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		System.out.println("Enter the value of x3 and y3");
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		System.out.println("Enter the value of x4 and y4");
		x4 = sc.nextDouble();
		y4 = sc.nextDouble();
		line1 = (int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		line2 = (int)Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		if (line1 == line2)
		System.out.println("Lines are equal");
		else
			System.out.println("Lines are not equal");// TODO Auto-generated method stub

	}

}
