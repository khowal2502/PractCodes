package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNonNegSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(maxset(ret));
		scan.close();
	}
	
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = a.size();
		long max_sum = 0;
		long sum = 0;
		int s=0,e=0;
		int ms=-1,me=-1;

		for(int i=0;i<n;++i){
			if(a.get(i)<0){
				sum = 0;
				s = i+1;
				e = i+1;
			}else{
				sum+= a.get(i);
				e = i;
				if(max_sum<sum){
					max_sum = sum;
					ms = s;
					me = e;
				}else if(max_sum==sum){
					if((me-ms)<(e-s)){
						ms=s;
						me=e;
					}
				}
			}
		}
		
		if(ms==-1){
			return ans;
		}
		for(int i=ms;i<=me;++i){
			ans.add(a.get(i));
		}
		return ans;
	}

}
