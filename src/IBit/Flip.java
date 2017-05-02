package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class Flip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		
		System.out.println(flip(n));
		scan.close();
	}
    
	public static ArrayList<Integer> flip(String A) {
		int n = A.length();
		int arr[] = new int[n];
		boolean retDirectly = true;
		for(int i=0;i<n;++i){
			if(A.charAt(i)=='1'){
				arr[i] = -1;
			}else{
				arr[i] = 1;
				retDirectly=false;
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		if(retDirectly){
			return ans;
		}
		
		int max_here = arr[0];
		int max_sum = arr[0];
		int ms = 0;
		int me = 0;
		int s = 0, e = 0;
		
		for(int i=1;i<n;++i){
			if((max_here + arr[i])>0){
				max_here += arr[i];
				e++;
			}else{
				max_here = arr[i];
				s=i;
				e=i;
			}
			if(max_sum<max_here){
				max_sum = max_here;
				ms = s;
				me = e;
			}
		}
		
		s = ms-1;
		max_here = 0;
		while(s>=0){
			max_here += arr[s];
			if(max_here==0){
				ms=s;
			}
			s--;
		}
		
		ans.add(ms+1);
		ans.add(me+1);
		return ans;
    }

}
