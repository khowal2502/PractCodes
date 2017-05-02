package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class RemElem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		int b = scan.nextInt();
		System.out.println(removeElement(arr, b));
		scan.close();
	}
	
	public static int removeElement(ArrayList<Integer> a, int b) {
		int i=0;
		int n = a.size();
		for(int j=0;j<n;++j){
			if(a.get(j)!=b){
				a.set(i, a.get(j));
				i++;
			}
		}
		return i;
	}
}
