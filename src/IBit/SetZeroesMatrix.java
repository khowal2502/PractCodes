package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class SetZeroesMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++){
			ArrayList<Integer> row = new ArrayList<Integer>();
			for(int j=0;j<m;j++){
				row.add(scan.nextInt());
			}
			ret.add(row);
		}		
		setZeroes(ret);
		System.out.println(ret);
		scan.close();
	}
	
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int rows = a.size();
		int cols = a.get(0).size();
		boolean r = true;
		
		for(int i=0;i<cols;++i){
			if(a.get(0).get(i)==0){
				r = false;
				break;
			}
		}
		for(int i=0;i<rows;++i){
			if(a.get(i).get(0)==0){
				a.get(0).set(0, 0);
				break;
			}
		}
		
		for(int i=1;i<rows;++i){
			ArrayList<Integer> row = a.get(i);
			for(int j=0;j<cols;++j){
				if(row.get(j)==0){
					a.get(i).set(0,0);
					break;
				}
			}
		}
		
		for(int i=1;i<cols;++i){
			for(int j=0;j<rows;++j){
				if(a.get(j).get(i)==0){
					a.get(0).set(i, 0);
				}
			}
		}
		
		for(int i=1;i<rows;++i){
			if(a.get(i).get(0)==0){
				for(int j=0;j<cols;++j){
					a.get(i).set(j, 0);
				}
			}
		}
		
		for(int i=1;i<cols;++i){
			if(a.get(0).get(i)==0){
				for(int j=1;j<rows;++j){
					a.get(j).set(i, 0);
				}
			}
		}
		
		if(a.get(0).get(0)==0){
			for(int j=0;j<rows;++j){
				a.get(j).set(0, 0);
			}
		}
		
		if(!r){
			for(int j=0;j<cols;++j){
				a.get(0).set(j, 0);
			}
		}
	}
}
