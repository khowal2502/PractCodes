package cc;

import java.util.HashMap;
import java.util.Scanner;

public class DISHLIFE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(;T>0;--T){
			int N = scan.nextInt();
			int K = scan.nextInt();
			int maxCount = 0;
			boolean all = true;
			
			HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
			
			for(int i=0;i<N;++i){
				int n = scan.nextInt();
				boolean req = false;
				for(int j=0;j<n;++j){
					int a = scan.nextInt();
					if(!map.containsKey(a)){
						map.put(a, true);
						maxCount++;
						req=true;
					}
				}
				if(!req){
					all=false;
				}
			}
			
			if(maxCount>=K){
				if(all){
					System.out.println("all");
				}else{
					System.out.println("some");
				}
			}else{
				System.out.println("sad");
			}
		}
		scan.close();
	}

}
