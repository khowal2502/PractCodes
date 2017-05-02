package IBit;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortedPermRankRep {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		System.out.println(findRank(s));
		
		scan.close();
	}
	
	public static int findRank(String a){
		BigInteger ans = BigInteger.ONE;
		char inp[] = a.toCharArray();
		int n = inp.length;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<n;++i){
			if(map.containsKey(inp[i])){
				int cnt = map.get(inp[i]);
				map.put(inp[i],cnt+1);
			}else{
				map.put(inp[i],1);
			}
		}
		
		char arr[] = new char[map.size()];
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		BigInteger divide = BigInteger.ONE;
		int k=0;
		while(it.hasNext()){
			Map.Entry<Character, Integer> ent = (Map.Entry<Character, Integer>)it.next();
			divide = divide.multiply(factorial(ent.getValue()));
			arr[k] = ent.getKey();
			k++;
		}
		
		for(int i=0;i<n;++i){
			for(int j=0;j<k;++j){
				if(a.charAt(i)!=arr[j] && map.get(arr[j])!=0){
					ans = ans.add(factorial(n-1-i).divide(divide.divide(BigInteger.valueOf(map.get(arr[j])))));
				}else if(a.charAt(i)==arr[j]){
					map.put(arr[j], map.get(arr[j])-1);
					divide = divide.divide(BigInteger.valueOf(map.get(arr[j])+1));
					break;
				}
			}
		}
		
		ans = ans.mod(BigInteger.valueOf(1000003));
		return Integer.parseInt(ans.toString());
	}
	
	public static BigInteger factorial(int n){
		BigInteger ans = BigInteger.ONE;
		while(n>0){
			ans = ans.multiply(BigInteger.valueOf(n));
			n--;
		}
		
		return ans;
	}

}
