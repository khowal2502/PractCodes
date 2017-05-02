package IBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountTriangles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		System.out.println(nTriang(arr));
		scan.close();
	}
	
	public static int nTriang(ArrayList<Integer> A) {
		int count=0;
		Collections.sort(A);
		int n = A.size();
		for(int i = 0; i < n; i++) {    // first side
	        int k = i + 2;
	        for(int j = i + 1; j < n; j++) {    // second side
	            for(; (k < n) && (A.get(i) + A.get(j) > A.get(k)); k++);
	            count = count + (k - 1 - j);    // all indices of between j to k are possible
	            if(count >= 1000000007) count = count % 1000000007;
	        }
	    }
		
		return count;
    }
}
