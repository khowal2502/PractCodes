package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class AddOneToNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(plusOne(ret));
		scan.close();
	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = a.size();
		int i=0;
		boolean added = false;
		for(i=0;i<n;++i){
			if(!added){
				if(a.get(n-i-1)<9){
					ans.add(a.get(n-i-1) + 1);
					added=true;
				}else{
					ans.add(0);
				}
			}else{
				ans.add(a.get(n-i-1));
			}		
		}
		if(!added){
			ans.add(1);
		}
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<ans.size();j++){
			ret.add(ans.get(ans.size()-j-1));
		}
		while(ret.get(0)==0) ret.remove(0);
		return ret;
	}
}
