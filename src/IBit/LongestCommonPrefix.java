package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<N;++i){
			arr.add(scan.next());
		}
		
		System.out.println(longestCommonPrefix(arr));
		scan.close();
	}
	
	public static String longestCommonPrefix(ArrayList<String> a) {
		StringBuilder ans = new StringBuilder();
		int n = a.size();
		
		if(n==0) return "";
		
		int min_size = Integer.MAX_VALUE;
		for(int i=0;i<n;++i){
			if(a.get(i).length()<min_size){
				min_size = a.get(i).length();
			}
		}
		
		for(int i=0;i<min_size;++i){
			boolean appen = true;
			for(int j=1;j<n;++j){
				if(a.get(j).charAt(i)!=a.get(j-1).charAt(i)){
					appen=false;
					break;
				}
			}
			if(appen){
				ans.append(a.get(0).charAt(i));
			}else{
				break;
			}
		}
	
		return ans.toString();
	}

}
