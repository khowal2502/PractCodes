package IBit;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		System.out.println(longestPalindrome(s));
		scan.close();
	}
	
	public static String longestPalindrome(String a) {
		int start=0;
		int end=1;
		int n = a.length();
		boolean check[][] = new boolean[n][n];
		
		for(int i=0;i<n;++i){
			Arrays.fill(check[i], false);
			check[i][i]=true;
		}
		
		for(int i=2;i<=n;++i){
			boolean done = false;
			for(int j=0;j<=n-i;++j){
				boolean ans = checkPalin(a,j,j+i-1, check);
				check[j][j+i-1] = ans;
				if(ans && !done){
					start = j;
					end = j+i;
					done = true;
				}
			}
		}
		
		return a.substring(start, end);
	}
	
	public static boolean checkPalin(String a, int start, int end, boolean check[][]){
		int i = start+1;
		int j = end-1;
		if(i<=j){
			if(check[i][j]){
				if(a.charAt(start)==a.charAt(end)){
					return true;
				}
			}
		}else if(i>j){
			if(a.charAt(start)==a.charAt(end)){
				return true;
			}
		}
		
		return false;
	}

}
