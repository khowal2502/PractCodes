package IBit;

import java.util.Scanner;

public class ExcelColumnNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		System.out.println(titleToNumber(s));
		scan.close();
	}

	public static int titleToNumber(String a) {
		int ans = 0;
		int n = a.length();
		for(int i=n-1;i>=0;--i){
			ans += (a.charAt(i)-'A' + 1)*Math.pow(26, n-i-1);
		}
		return ans;
	}
}
