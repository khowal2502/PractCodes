package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPermutation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int i = scan.nextInt();
		
		System.out.println(findPerm(n, i));
		scan.close();
	}
	public static ArrayList<Integer> findPerm(final String A, int B) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int start = 1;
		for(int i=0;i<B-1;++i){
			if(A.charAt(i)=='D'){
				start++;
			}
		}
		ans.add(start);
		int inc = start + 1;
		int dec = start - 1;
		for(int i=0;i<B-1;++i){
			if(A.charAt(i)=='I'){
				ans.add(inc);
				inc++;
			}else{
				ans.add(dec);
				dec--;
			}
		}
		
		return ans;
    }

}
