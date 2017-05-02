package IBit;

import java.util.Scanner;

public class ExcelColumnTitle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		System.out.println(convertToTitle(N));
		scan.close();
	}

	public static String convertToTitle(int a) {
		String ans = "";
		StringBuilder str = new StringBuilder();
		while(a>0){
			int rem = a%26;
			if(rem==0) {
				rem = 26;
				a=(a-a*(a/26));
			}else{
				a=a/26;
			}
			str.append((char)('A' + (rem-1)));
		}
		ans = str.reverse().toString();
		return ans;
	}
}
