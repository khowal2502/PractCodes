package IBit;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		
		System.out.println(trailingZeroes(n));
		scan.close();
	}
	
	public static int trailingZeroes(int a) {
		int ans = 0;
		int m = 5;
		while(a/m>0){
			ans += (a/m);
			m=m*5;
		}
		return ans;
	}

}
