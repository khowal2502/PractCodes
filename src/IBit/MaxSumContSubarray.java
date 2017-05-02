package IBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSumContSubarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(maxSubArray(ret));
		scan.close();
	}

	public static int maxSubArray(final List<Integer> a) {
		int max_sum = a.get(0);
		int n = a.size();
		int max_here = a.get(0);
		for(int i=1;i<n;++i){
			if(max_here<0){
				if(a.get(i)>max_here){
					max_here = a.get(i);
					
				}
			}else{
				if(max_here + a.get(i)>=0){
					max_here = max_here + a.get(i);
				}else{
					max_here = 0;
				}
			}
			if(max_here>max_sum){
				max_sum = max_here;
			}
		}
		
		return max_sum;
	}
}
