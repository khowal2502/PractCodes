package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class DiffK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		int b = scan.nextInt();
		System.out.println(diffPossible(arr, b));
		scan.close();
	}

	public static int diffPossible(ArrayList<Integer> a, int b) {
		int i=0;
		int j=1;
		while(j<a.size() && i<a.size()){
			int c = a.get(j)-a.get(i);
			if(c==b){
				return 1;
			}else{
				if(c>b){
					i++;
					j=i+1;
				}else{
					j++;
				}
			}
		}
		return 0;
	}
}
