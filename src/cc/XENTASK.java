package cc;

import java.util.Scanner;

public class XENTASK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(;T>0;--T){
			int n = scan.nextInt();
			int xf = 0;
			int xs = 0;
			int af = 0;
			int as = 0;
			
			for(int i=0;i<n;++i){
				int t = scan.nextInt();
				if(i%2==0){
					xf += t;
				}else{
					xs += t;
				}
			}
			
			for(int i=0;i<n;++i){
				int t = scan.nextInt();
				if(i%2==0){
					af += t;
				}else{
					as += t;
				}
			}
			
			if((xf+as)>=(xs+af)){
				System.out.println(xs+af);
			}else{
				System.out.println(as+xf);
			}
		}
		
		scan.close();
	}

}
