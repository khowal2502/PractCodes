import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		int e1 = scan.nextInt();
		int e2 = scan.nextInt();
		
		System.out.println(getEffort(s1, s2, e1, e2));
		scan.close();
	}
	
	public static int getEffort(String S1, String S2, int E1, int E2){
		char c1[] = S1.toCharArray();
        char c2[] = S2.toCharArray();
        int n1 = c1.length;
        int n2 = c2.length;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        
        for(int i=0;i<n1;++i){
            if(map1.containsKey(c1[i])){
                map1.put(c1[i], map1.get(c1[i]) + 1);
            }else{
                map1.put(c1[i], 1);
            }
        }
        
        for(int i=0;i<n2;++i){
            if(map2.containsKey(c2[i])){
                map2.put(c2[i], map2.get(c2[i]) + 1);
            }else{
                map2.put(c2[i], 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            char k = entry.getKey();
			int v = entry.getValue();
            if(map2.containsKey(k)){
                int s = map2.get(k);
                if(v>s){
                    map1.put(k, v-s);
                    map2.put(k, 0);
                }else if(v<s){
                    map2.put(k, s-v);
                    map1.put(k, 0);
                }else{
                	map1.put(k, 0);
                	map2.put(k, 0);
                }
            }
        }
        int cost = 0;
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
			int v = entry.getValue();
            cost += E1*v;
        }
        for(Map.Entry<Character, Integer> entry : map2.entrySet()){
			int v = entry.getValue();
            cost += E2*v;
        }
        return cost;
	}

}
