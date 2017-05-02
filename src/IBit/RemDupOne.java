package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class RemDupOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			arr.add(scan.nextInt());
		}
		
		System.out.println(removeDuplicates(arr));
		scan.close();
	}
	
	public static int removeDuplicates(ArrayList<Integer> a) {
		int i=1;
		int node = a.get(0);
		while(i<a.size()){
			if(a.get(i)==node){
				a.remove(i);
			}else{
				node = a.get(i);
				i++;
			}
		}
		
		return a.size();
	}
}
