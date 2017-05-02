package IBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WaveArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j=0;j<n;j++){
			ret.add(scan.nextInt());
		}
		
		System.out.println(wave(ret));
		scan.close();
	}
	
	public static ArrayList<Integer> wave(ArrayList<Integer> a) {
		int n = a.size();
	    Collections.sort(a);
	    for(int i=0;i<n;i+=2){
	        if(i+1<n){
	            int temp = a.get(i);
	            a.set(i, a.get(i+1));
	            a.set(i+1, temp);
	        }
	    }
	    return a;
	}

}
