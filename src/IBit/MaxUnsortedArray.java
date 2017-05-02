package IBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxUnsortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(subUnsort(ret));
		scan.close();
	}
	
	public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = A.size();
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.addAll(A);
		Collections.sort(B);
		
		for(int i=0;i<n;++i){
			if(A.get(i)!=B.get(i)){
				ans.add(i);
				break;
			}
		}
		
		for(int i=n-1;i>0;--i){
			if(A.get(i)!=B.get(i)){
				ans.add(i);
				break;
			}
		}
		
		if(ans.size()!=2){
			ans.clear();
			ans.add(-1);
		}
		
		return ans;
    }

}
