import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		if(num <= 1) {
			System.out.println(num+" is not a prime number");
			return;
		}
		String prime = "prime";
        for(int i=2;i<num;i++) {
        	if(num%i==0) {
        		prime = "not a prime";
        		break;
        	}
        }
        System.out.println(num+" is a "+prime+" number");
	}
}
/*
Sample Output 1
Enter number: 17
17 is a prime number
Sample Output 2
Enter number: 1
1 is not a prime number
*/
