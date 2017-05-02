package IBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumConsecutiveGap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(maximumGap(ret));
		scan.close(); 

	}
	
	public static int maximumGap(final List<Integer> a) {
		int ans = 0;
		int n = a.size();
		
		if(n<2) return 0;
		if(n==2) return Math.abs(a.get(0)-a.get(1));
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i=0;i<n;++i){
			if(a.get(i)>max){
				max=a.get(i);
			}
			if(a.get(i)<min){
				min=a.get(i);
			}
		}
		
		int gap = (max-min)/(n-1);
		int add = 0;
		if((max-min)%(n-1)!=0){
			add++;
		}
		gap += add;
		
		if(gap==0) return 0;
		
		ArrayList<Bucket> ret = new ArrayList<Bucket>();
		for(int i=0;i<n-1;++i){
			ret.add(new Bucket());
		}
		
		for(int i=0;i<n;++i){
			int v = a.get(i);
			int bn = (v - min)/gap;
	
			if(bn>=(n-1) && v==max)bn--;
			ret.get(bn).insert(v);
		}
		
		for(int i=0;i<ret.size();++i){
			if(ret.get(i).min==-1){
				ret.remove(i);
				i--;
			}
		}
		
		for(int i=1;i<ret.size();++i){
			int diff = ret.get(i).min - ret.get(i-1).max;
			if(diff>ans){
				ans =diff;
			}
		}
		
		return ans;
	}
}

class Bucket{
	int min=-1;
	int max=-1;
	
	public void insert(int n){
		if(n>max || max==-1){
			max = n;
		}
		if(n<min || min==-1){
			min = n;
		}
	}
}