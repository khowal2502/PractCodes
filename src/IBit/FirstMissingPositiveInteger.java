package IBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositiveInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(firstMissingPositive(ret));
		scan.close();
	}
	public static int firstMissingPositive(ArrayList<Integer> a) {
		int miss = 0;
		int n = a.size();
		boolean arr[] = new boolean[n];
		Arrays.fill(arr, false);
		
		for(int i=0;i<n;++i){
			if(a.get(i)<=n && a.get(i)>0){
				arr[a.get(i)-1] = true;
			}
		}
		int i=0;
		
		while(i<n && arr[i]){
			i++;
		}
		miss = i+1;
		return miss;
	}

}
