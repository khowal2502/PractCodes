package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class NumSpiralOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println(generateMatrix(n));
		scan.close();

	}
	
	public static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a;++i){
			ArrayList<Integer> row = new ArrayList<Integer>();
			for(int j=0;j<a;++j){
				row.add(0);	
			}
			ans.add(row);
		}
		
		int num = a*a;
		int i=1;
		int dir=0;
		int l=0,r=a,t=0,b=a;
		while(i<=num){
			switch(dir){
				case 0:
					for(int k=l;k<r;++k){
						ans.get(t).set(k,i);
						i++;
					}
					dir=1;
					t++;
					break;
				case 1:
					for(int k=t;k<b;++k){
						ans.get(k).set(r-1,i);
						i++;
					}
					dir=2;
					r--;
					break;
				case 2:
					for(int k=r-1;k>=l;--k){
						ans.get(b-1).set(k, i);
						i++;
					}
					dir=3;
					b--;
					break;
				case 3:
					for(int k=b-1;k>=t;--k){
						ans.get(k).set(l,i);
						i++;
					}
					dir=0;
					l++;
					break;
			}
		}
		
		return ans;
	}
}
