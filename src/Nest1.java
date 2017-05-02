import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Nest1 {

	public static void main(String[] args) {
		int max = 1000000;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=2;i<max; ++i){
            map.put(i ,0);
        }
        for(int i=2;i<max; ++i){
            if(map.get(i)==0){
            	int k=2;
                while(i*k<max){
                    int a =  map.get(i*k);
                    map.put(i*k, a + 1);
                    if(a==2){
                        ans.add(i*k);
                    }
                    k++;
                }
            }
        }
        Collections.sort(ans);
	}

}
