package IBit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class N3RepeatNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(repeatedNumber(ret));
		scan.close();
	}
	
	public static int repeatedNumber(final List<Integer> a) {
		int rep = -1;
		int n = a.size();
		if(n<3){
			return a.get(0);
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;++i){
			if(map.containsKey(a.get(i))){
				int count = map.get(a.get(i));
				count++;
				if(count>(int)(n/3)){
					rep = a.get(i);
				}
				map.put(a.get(i), count);
			}else{
				map.put(a.get(i), 1);
			}
		}
		
		return rep;
	}

}
