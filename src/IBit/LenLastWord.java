package IBit;

import java.util.Scanner;

public class LenLastWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(lengthOfLastWord(s));
		
		scan.close();

	}
	
	public static int lengthOfLastWord(final String a) {
		int ans = 0;
		
		String arr[] = a.split(" ");
		int n = arr.length;
		
		if(n==0) return ans;
		
		ans = arr[n-1].length();
		
		return ans;
	}

}
