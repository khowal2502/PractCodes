package IBit;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(reverseWords(s));
		
		scan.close();

	}
	
	public static String reverseWords(String a) {
		StringBuilder ans = new StringBuilder();
		String arr[] = a.split(" ");
		int n = arr.length;
		
		for(int i=n-1;i>=0;--i){
			if(arr[i].length()>0){
				ans.append(arr[i]);
				ans.append(" ");
			}
		}
		
		return ans.toString().trim();
	}

}
