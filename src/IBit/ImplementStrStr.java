package IBit;

import java.util.Scanner;

public class ImplementStrStr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		System.out.println(strStr(s1, s2));
		scan.close();
	}
	
	public static int strStr(final String haystack, final String needle) {
		int ans = -1;
		int h = haystack.length();
		int n = needle.length();
		if(h==0 || n==0 || h<n){
			return ans;
		}
	
		for(int i=0;i<=h-n;++i){
			boolean check = checkEqual(haystack, needle, i);
			if(check){
				return i;
			}
		}
		return ans;
	}
	
	public static boolean checkEqual(String haystack, String needle, int start){
		int n = needle.length();
		for(int i=0;i<n;++i){
			if(haystack.charAt(i+start)!=needle.charAt(i)){
				return false;
			}
		}
		return true;
	}

}
