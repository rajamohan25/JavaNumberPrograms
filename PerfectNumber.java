import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum += i;
			}
		}
		if(sum==num) {
			System.out.println(num+" is a perfect number");
		} else {
			System.out.println(num+" is not a perfect number");
		}
	}
}
/*
Sample Output 1
Enter number: 28
28 is a perfect number
Sample Output 2
Enter number: 12
12 is not a perfect number
*/
