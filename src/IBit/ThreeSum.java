package IBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		int b = scan.nextInt();
		System.out.println(threeSumClosest(arr, b));
		scan.close();
	}
	
	public static int threeSumClosest(ArrayList<Integer> a, int b) {
		int min_diff = Integer.MAX_VALUE;
		int sum=0;
		Collections.sort(a);
		int n = a.size();
		boolean ans = false;
		for(int i=0;i<n-2;++i){
			int j=i+1, k=n-1;
			int check = b-a.get(i);
			while(j<k){
				int c = check - a.get(j) - a.get(k);
				if(Math.abs(c)<min_diff){
					min_diff = Math.abs(c);
					sum = a.get(i) + a.get(j) + a.get(k);
				}
				if(c<0){
					k--;
				}else if(c>0){
					j++;
				}else{
					ans = true;
					break;
				}
			}
			if(ans) break;
		}
		
		return sum;
	}

}
