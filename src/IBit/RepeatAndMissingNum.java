package IBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatAndMissingNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(repeatedNumber(ret));
		scan.close();
	}
	
	public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = a.size();
		
		boolean arr[] = new boolean[n];
		Arrays.fill(arr, false);
		int A = 0;
		int B = 0;
		
		for(int i=0;i<n;++i){
			if(!arr[a.get(i) - 1]){
				arr[a.get(i) -1] = true;
			}else{
				A = a.get(i);
			}
		}
		int i=0;
		while(arr[i]){
			i++;
		}
		B = i+1;
		
		ans.add(A);
		ans.add(B);
		
		return ans;
	}

}
