package hellojava;
import java.util.Scanner;
public class Program1 {
public static void main(String[] args) {
	int num1,num2,result;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number 1");
	num1 = input.nextInt();
	System.out.println("Enter the numbe 2");
	num2 = input.nextInt();
	input.close();
	result = num1 + num2;
	 System.out.printf("%d + %d = %d",num1,num2,result);
}
}

