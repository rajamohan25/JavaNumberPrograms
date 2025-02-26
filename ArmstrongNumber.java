import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int copy = num;
		int count = 0;
		while(num>0) {
			num = num / 10;
			count++;
		}
		num = copy;
		int arm = 0;
		while(num>0) {
			int last = num % 10;
			arm += power(last,count);
			num = num / 10;
		}
		if(copy==arm) {
			System.out.println(copy+" is an armstrong number");
		} else {
			System.out.println(copy+" is not an armstrong number");
		}
	}

	private static int power(int last, int count) {
		
		int pow = 1;
		for(int i=1;i<=count;i++) {
			pow = pow * last;
		}
		return pow;
	}
}
/*
Sample Output 1
Enter number: 1634
1634 is an armstrong number
Sample Output 2
Enter number: 335
335 is not an armstrong number
*/
