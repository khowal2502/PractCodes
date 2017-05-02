package IBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingNumOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(;N>0;--N){
			l.add(scan.nextInt());
		}
		System.out.println(singleNumber(l));
		scan.close();
	}
	
	public static int singleNumber(final List<Integer> a) {
		int ans = a.get(0);
		int n = a.size();
		for(int i=1;i<n;++i){
			ans ^= a.get(i);
		}
		return ans;
	}

}
