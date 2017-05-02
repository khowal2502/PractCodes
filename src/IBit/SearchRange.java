package IBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		int b = scan.nextInt();
		System.out.println(binSearch(arr, b));
		scan.close();
	}
		
	public static ArrayList<Integer> binSearch(List<Integer> a, int b){
		int low=0;
		int high=a.size()-1;
		int mid = (low+high)/2;
		
		while(low<high){
			if(a.get(mid)>=b){
				high = mid;
			}else{
				low = mid+1;
			}
			mid = (low+high)/2;
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(low);
		ans.add(high);
		return ans;
	}
	
	public static ArrayList<Integer> getRange(List<Integer> a, int pos){
		int elem = a.get(pos);
		while(pos>=0 && a.get(pos)==elem){
			pos--;
		}
		pos++;
		int start = pos;
		while(pos<a.size() && a.get(pos)==elem){
			pos++;
		}
		int end = pos-1;
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(start);
		ans.add(end);
		return ans;
	}

}
