import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=num;i>=1;i--) {
			fact = fact * i;
		}
		System.out.println("The factorial of "+num+" is "+fact);

	}
}
//Sample Output
//Enter the number: 8
//The factorial of 8 is 40320
