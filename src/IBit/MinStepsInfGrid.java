package IBit;

import java.util.ArrayList;

public class MinStepsInfGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
		int count=0;
		int n = X.size();
		
		for(int i=1;i<n;++i){
			int x = Math.abs(X.get(i)-X.get(i-1));
			int y = Math.abs(Y.get(i)-Y.get(i-1));
			
			if (x>y) {
				count+= x;
			}else{
				count+= y;
			}
		}
		
		return count;
    }

}
