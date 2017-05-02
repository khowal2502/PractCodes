package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class AntiDiagonals {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		for(int j=0;j<n;j++){
			ArrayList<Integer> ent = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				ent.add(scan.nextInt());
			}
			ret.add(ent);
		}
		
		System.out.println(diagonal(ret));
		scan.close();

	}
	
	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
		int n = a.size();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=(2*n - 2);++i){
			ArrayList<Integer> entry = new ArrayList<Integer>();
			ans.add(entry);
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				ans.get(i+j).add(a.get(i).get(j));
			}
		}
		
		
		return ans;
	}
}
