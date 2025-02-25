import java.util.Scanner;

public class NumberToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int copy = num;
		int inc = 1;
		int res = 0;
		while(num>0) {
			int last = num % 2;			
			res = res + last * inc;
			inc *= 10;
			num /= 2;
		}
		System.out.println("Binary number of "+copy+ " is "+res);
	}
}
