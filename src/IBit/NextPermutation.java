package IBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		nextPermutation(ret);
		scan.close();
	}
	
	public static void nextPermutation(ArrayList<Integer> a) {
		int n = a.size();
		boolean permuted = false;
		for(int i=n-2;i>=0;--i){
			for(int j=n-1; j>i; --j){
				if(a.get(j)>a.get(i)){
					a.add(i, a.get(j));
					a.remove(j+1);
					a.add(j+1, a.get(i+1));
					a.remove(i+1);
					Collections.sort(a.subList(i+1, n));
					permuted = true;
					break;
				}
			}
			if(permuted){
				break;
			}
		}
		
		if(!permuted){
			Collections.sort(a);
		}
		System.out.println(a);
	}

}
