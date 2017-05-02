package cc;

import java.util.Scanner;

public class ROWSOLD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(;T>0;--T){
			String in = scan.next();
			char arr[] = in.toCharArray();
			long n = arr.length;
			
			long ans = 0;
			long count_one = 0;
			
			for(int i=0;i<n;++i){
				long count_zero = 0;
				while(i<n && arr[i]=='1'){
					count_one++;
					i++;
				}
				while(i<n && arr[i]=='0'){
					count_zero++;
					i++;
				}
				if(count_zero>0){
					ans += count_one * count_zero + count_one;
				}
				i--;
			}
			System.out.println(ans);
		}
		scan.close();
	}

}
