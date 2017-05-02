package IBit;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class NobleInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		System.out.println(solve(arr));
		scan.close();
	}
	
	public static int solve(ArrayList<Integer> A) {
		int n = A.size();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i=0;i<n;++i){
			if(!map.containsKey(A.get(i))){
				map.put(A.get(i), 1);
			}else{
				int o = map.get(A.get(i));
				o++;
				map.put(A.get(i), o);
			}
		}
		int count=n;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int k = entry.getKey();
			int v = entry.getValue();
			count -= v;
			if(k==count){
				return 1;
			}
		}
		return -1;
	}

}
