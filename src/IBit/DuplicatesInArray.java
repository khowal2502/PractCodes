package IBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(repeatedNumber(ret));
		scan.close();
	}
	
	public static int repeatedNumber(final List<Integer> a) {
		int rep = -1;
		int n = a.size();
		boolean arr[] = new boolean[n];
		Arrays.fill(arr, false);
		for(int i=0;i<n;++i){
			if(!arr[a.get(i)-1]){
				arr[a.get(i)-1] = true;
			}else{
				rep = a.get(i);
				break;
			}
		}
		return rep;
	}

}
