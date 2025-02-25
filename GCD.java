import java.util.Scanner;

public class GCD {
	
	static int gcd;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int fn = sc.nextInt();
		System.out.print("Enter Second number: ");
		int sn = sc.nextInt();
		for(int i=1;i<=fn;i++) {
			if(fn%i==0) {
				 anotherCheck(i,sn);
			}
		}
		System.out.println("GCD of "+fn+" and "+sn+" is "+gcd);
	}

	private static void anotherCheck(int i, int sn) {
		for(int j=1;j<=sn;j++) {
			if(sn%j==0 && i==j ) {
				gcd= i;
			}
		}
	}
}
// Sample Output
// Enter first number: 56
// Enter Second number: 98
// GCD of 56 and 98 is 14
