import java.util.Scanner;

public class CountEvenDigitExceptZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int copy = num;
		int count = 0;
		while(num > 0) {
			int last = num % 10;
			if(last%2 == 0 && last != 0) {
				count++;
			}
			num /= 10;
		}
		System.out.println("Even digits present in "+copy+" is "+count);
	}
}
