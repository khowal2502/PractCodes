package IBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreeSumZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		System.out.println(threeSumClosest(arr));
		scan.close();
	}
	
	public static ArrayList<ArrayList<Integer>> threeSumClosest(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Collections.sort(a);
		int n = a.size();
		for(int i=0;i<n-2;++i){
			int j=i+1, k=n-1;
			while(j<k){
				int c = a.get(i) + a.get(j) + a.get(k);				
				if(c<0){
					j++;
				}else if(c>0){
					k--;
				}else{
					ArrayList<Integer> ent = new ArrayList<Integer>();
					ent.add(a.get(i));
					ent.add(a.get(j));
					ent.add(a.get(k));
					if(!checkContains(ans, ent)){
						ans.add(ent);
					}
					j++;
					k--;
				}
			}
		}
		
		return ans;
	}
	
	public static boolean checkContains(ArrayList<ArrayList<Integer>> a, ArrayList<Integer> b){
		for(int i=0;i<a.size();++i){
			if(a.get(i).get(0).equals(b.get(0))){
				if(a.get(i).get(1).equals(b.get(1))){
					if(a.get(i).get(2).equals(b.get(2))){
						return true;
					}
				}
			}
		}
		return false;
	}

}
