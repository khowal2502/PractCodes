package IBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxDistance {

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
		int ans = -1;
		int n = a.size();
		
		for(int i=0;i<n;++i){
			
		}
		
		return ans;	
	}

}
