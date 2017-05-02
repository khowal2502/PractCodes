package IBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIndCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		int b = scan.nextInt();
		System.out.println(findCount(arr, b));
		scan.close();
	}
	
	public static int findCount(final List<Integer> a, int b) {
		int srch = binSearch(a, b);
		if(srch==-1){
			return 0;
		}else{
			return countElem(a, srch);
		}
	}
	
	public static int countElem(List<Integer> a, int pos){
		int elem = a.get(pos);
		while(pos>=0 && a.get(pos)==elem){
			pos--;
		}
		pos++;
		int cnt = 0;
		while(pos<a.size() && a.get(pos)==elem){
			cnt++;
			pos++;
		}
		return cnt;
	}
	
	public static int binSearch(List<Integer> a, int b){
		int ans = -1;
		int low=0;
		int high=a.size()-1;
		int mid = (low+high)/2;
		
		while(low<=high){
			if(a.get(mid)==b){
				ans = mid;
				break;
			}else if(a.get(mid)>b){
				high = mid-1;
			}else{
				low = mid+1;
			}
			mid = (low+high)/2;
		}
		
		return ans;
	}

}
