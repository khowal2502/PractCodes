package IBit;

import java.util.Scanner;

public class PalindromicNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		System.out.println(isPalindrome(i));
		scan.close();
	}
	
	public static boolean isPalindrome(int a) {
		if(a<0) return false;
		
		int revNum = 0;
		int origNum = a;
		while (a != 0) {
			revNum = revNum * 10 + a % 10;
			a = a / 10;   
		}
		if(revNum==origNum){
			return true;
		}
		return false;
	}
}
