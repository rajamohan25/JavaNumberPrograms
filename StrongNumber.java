import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int copy = num;
		int snum = 0;
		while(num>0) {
			int last = num % 10;
			snum += factorial(last);
			num = num / 10;
		}
		if(snum==copy) {
			System.out.println(copy+" is a strong number");
		} else {
			System.out.println(copy+" is not a strong number");
		}
	}

	private static int factorial(int last) {
		
		int fact = 1;
		for(int i=last;i>=1;i--) {
			fact = fact * i;
		}
		return fact;
	}
}
/*
Sample Output 1
Enter number: 145
145 is a strong number
Sample Output 2
Enter number: 123
123 is not a strong number
*/
