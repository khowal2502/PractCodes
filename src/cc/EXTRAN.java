package cc;

import java.util.Arrays;
import java.util.Scanner;

public class EXTRAN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(;T>0;--T){
			int n = scan.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;++i){
				arr[i] = scan.nextInt();
			}
			
			Arrays.sort(arr);

			for(int i=0;i<n-1;++i){
				if(arr[1]-arr[0]!=1){
					System.out.println(arr[0]);
				}else{
					System.out.println(arr[n-1]);
				}
			}
		}
		
		scan.close();
	}

}
