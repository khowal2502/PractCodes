import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.HashMap;

public class AnagSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		ArrayList<String> arr = new ArrayList<String>();
		for(;N>0;--N){
			arr.add(scan.next());
		}
	}
	
	public static void sortAnags(ArrayList<String> Arr){
		int n = Arr.size();
		HashMap<String, ArrayList> mainMap = new HashMap<String, ArrayList>();
		for(int i=0;i<n;++i){
			TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
			char ent[] = Arr.get(i).toCharArray();
			int k = ent.length;
			for(int j=0;j<k;++j){
				if(map.containsKey(ent[j])){
					int c = map.get(ent[j]);
					map.put(ent[j],c++);
				}else{
					map.put(ent[j],1);
				}
			}
			StringBuilder str = new StringBuilder("");
			for(Map.Entry<Character, Integer> entry : map.entrySet()){
				str.append(entry.getKey());
				str.append(entry.getValue());
			}
			
			if(mainMap.containsKey(str.toString())){
				ArrayList<String> na = mainMap.get(str.toString());
				na.add(Arr.get(i));
				mainMap.put(str.toString(), na);
			}else{
				ArrayList<String> na = new ArrayList<String>();
				na.add(Arr.get(i));
				mainMap.put(str.toString(), na);
			}
		}
		ArrayList<String> ans = new ArrayList<String>();
		for(Map.Entry<String, ArrayList> entry : mainMap.entrySet()){
			ans.addAll(entry.getValue());
		}
		//Print ans
	}

}
