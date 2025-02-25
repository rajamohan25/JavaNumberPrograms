import java.util.Scanner;

public class DigitalSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int copy = num;
		int sum = 0;
		while(num>0) {
			int last = num % 10;
			sum += last;
			num /= 10;
		}
		System.out.println("Digital sum of "+copy+" is "+sum);
	}
}
//Sample Output
//Enter the number: 36476
//Digital sum of 36476 is 26
