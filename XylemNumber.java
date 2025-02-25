import java.util.Scanner;

public class XylemNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int copy = num;
		int fl = num % 10;
		num /= 10;
		int mid = 0;
		while(num>9) {
			mid += num % 10;
			num /= 10;
		}
		fl += num;
		if(fl==mid) {
			System.out.println(copy+" is xylem number");
		} else {
			System.out.println(copy+" is not a xylem number");
		}
	}
}
/*
Sample Output 1
Enter number: 43515
43515 is xylem number
Sample Output 2
Enter number: 7631
7631 is not a xylem number
*/
