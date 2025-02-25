import java.util.Scanner;

public class BinaryToNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int copy = num;
		int x = 1;
		int res = 0;
		while(num>0) {
			int last = num % 10;
			res = res + last * x;
			x *= 2;
			num /= 10;
		}
		System.out.println("Decimal number of "+copy+" is "+res);
	}
}
// Sample Output
// Enter number: 1101
// Decimal number of 1101 is 13
