import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		System.out.print("The factors of "+num+" are ");
		boolean comma = true;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				if(!comma) {
					System.out.print(", ");
				}
				System.out.print(i);
				comma = false;
			}
		}
	}
}
// Sample Output
// Enter number: 24
// The factors of 24 are 1, 2, 3, 4, 6, 8, 12, 24
