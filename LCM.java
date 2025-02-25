import java.util.Scanner;

public class LCM {
	
	static int lcm;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int fn = sc.nextInt();
		System.out.print("Enter second number: ");
		int sn = sc.nextInt();
		for(int i=1;i<=fn||i<=sn;i++) {
			calculateLCM(fn*i,fn,sn);
			if(lcm!=0) {
				break;
			}
		}
		System.out.println("LCM of "+fn+" and "+sn+" is "+lcm);
	}

	private static void calculateLCM(int i, int fn, int sn) {
		for(int j=1;j<=sn||j<=fn;j++) {
			if(sn*j==i) {
				lcm = i;
				return;
			}
		}
	}
}
/*
Sample Output
Enter first number: 7
Enter second number: 5
LCM of 7 and 5 is 35
*/
