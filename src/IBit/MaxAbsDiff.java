package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxAbsDiff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(maxArr(ret));
		scan.close();
	}
	
	public static int maxArr(ArrayList<Integer> A) {
		int ms=Integer.MIN_VALUE, md=Integer.MIN_VALUE, 
				mis=Integer.MAX_VALUE, mid=Integer.MAX_VALUE;
		int n = A.size();
				
		for(int i=0;i<n;++i){
			int a = A.get(i) + i;
			int b = A.get(i) - i;
			if(a>ms){
				ms = a;
			}
			if(a<mis){
				mis = a;
			}
			if(b>md){
				md = b;
			}
			if(b<mid){
				mid = b;
			}
		}
		
		return Math.max(ms - mis, md - mid);
	}

}
