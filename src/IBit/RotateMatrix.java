package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateMatrix {

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
		
		rotate(ret);
		System.out.println(ret);
		scan.close();

	}
	
	public static void rotate(ArrayList<ArrayList<Integer>> a) {
		int n = a.size();
		for(int i=0;i<n/2;++i){
			for(int j=i;j<n-i-1;++j){
				int temp = a.get(i).get(j);
				a.get(i).set(j, a.get(n-j-1).get(i));
				a.get(n-j-1).set(i, a.get(n-i-1).get(n-j-1));
				a.get(n-i-1).set(n-j-1, a.get(j).get(n-i-1));
				a.get(j).set(n-i-1, temp);
			}
		}
	}

}
