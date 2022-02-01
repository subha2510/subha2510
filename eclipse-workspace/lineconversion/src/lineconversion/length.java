package lineconversion;
import java.util.Scanner;
public class length {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1, x2, y1, y2, x, y;
		double distance;
		System.out.println("Enter the first coordinates: ");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		System.out.println("Enter the second coordinates: ");
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		x = x2 - x1;
		y = y2 - y1;
		distance = Math.sqrt(x*x + y*y);
		System.out.println("Distance between them = " + distance);

	}

}
