package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class KthRowInPascalTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println(getNthRow(n));
		scan.close();
	}
	
	public static ArrayList<Integer> getNthRow(int a){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(1);
		int prev = 1;
		for(int i=1;i<=a;++i){
			if(prev%i==0){
				prev = prev/i;
				prev = prev*(a-i+1);
			}else if((a-i+1)%i==0){
				prev = prev * ((a-i+1)/i);
			}else{
				prev = (prev*(a-i+1))/i;
			}
			ans.add(prev);
		}
		return ans;
	}

}
