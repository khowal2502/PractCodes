package IBit;

import java.util.Scanner;

public class PlaindromicString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(isPalindrome(s));
		scan.close();
	}
	
	public static int isPalindrome(String a) {
		int ans = 1;
		a = a.replaceAll("[^a-zA-Z0-9]", "");
		a = a.toLowerCase();
		int n = a.length();
		
		for(int i=0;i<(n/2);++i){
			if(a.charAt(i)!=a.charAt(n-i-1)){
				return 0;
			}
		}
		return ans;
	}

}
