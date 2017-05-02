package IBit;

import java.util.Scanner;

public class LargestCoprimeDivisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(cpFact(A,B));
		scan.close();
	}
	
	public static int cpFact(int A, int B) {
		int ans = 0;
		for(int i=1;i<=Math.sqrt(A);++i){
			if(A%i==0){
				int gcd = gcd(i,B);
				if (gcd==1){
					if(ans<i){
						ans = i;
					}
				}
				gcd = gcd(A/i,B);
				if (gcd==1){
					if(ans<(A/i)){
						ans = (A/i);
					}
				}
			}
		}
		return ans;
    }
	
	public static int gcd(int a, int b) {
	    if (a == 0)
	        return b;
	    return gcd(b % a, a);
	}

}
