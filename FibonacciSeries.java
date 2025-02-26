import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the series: ");
		int num = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		if(num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        } else if(num==1) {
			System.out.print(n1);
		} else {
			System.out.print(n1+" "+n2+" ");
			for(int i=1;i<=num-2;i++) {
				int n3 = n1 + n2;
				System.out.print(n3+" ");
				n1 = n2;
				n2 = n3;
			}	
		}
	}
}
// Sample Output
// Enter the series: 16
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
