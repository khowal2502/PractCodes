package cc;

import java.util.HashMap;
import java.util.Scanner;

public class SIMDISH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(;N>0;--N){
			int cSim = 0;
			HashMap<String, Boolean> map = new HashMap<String, Boolean>();
			
			for(int a=0;a<4;++a){
				String i = scan.next();
				map.put(i, true);
			}
			
			for(int a=0;a<4;++a){
				String j = scan.next();
				if(map.containsKey(j)){
					cSim++;
				}
			}
			
			if(cSim>1){
				System.out.println("similar");
			}else{
				System.out.println("dissimilar");
			}
		}
		
		scan.close();
	}
}
