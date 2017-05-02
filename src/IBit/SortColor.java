package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class SortColor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		sortColors(arr);
		System.out.println(arr);
		scan.close();
	}
	
	public static void sortColors(ArrayList<Integer> a) {
		int n = a.size();
		int r=0, w=0, b=0;
		for(int i=0;i<n;++i){
			switch(a.get(i)){
				case 0:
					r++;
					break;
				case 1:
					w++;
					break;
				case 2:
					b++;
					break;
				default:
					break;
			}
		}
		a.clear();
		for(int i=0;i<r;++i){
			a.add(0);
		}
		for(int i=0;i<w;++i){
			a.add(1);
		}
		for(int i=0;i<b;++i){
			a.add(2);
		}
	}

}
