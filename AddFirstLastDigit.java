import java.util.Scanner;

public class AddFirstLastDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int copy = num;
		int sum = num % 10;
		while(num>9) {
			num /= 10;
		}
        sum += num;
        System.out.println("Addition of first and last digit of "+copy+" is "+sum);
	}
}
