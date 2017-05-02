package IBit;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SortedPermRank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		System.out.println(findRank(s));
		
		scan.close();
	}
	
	public static int findRank(String a){
		BigInteger ans = BigInteger.ONE;
		char arr[] = a.toCharArray();
		int n = arr.length;
		Arrays.sort(arr);
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		for(int i=0;i<n;++i){
			map.put(arr[i], false);
		}
		
		for(int i=0;i<n;++i){
			for(int j=0;j<n;++j){
				if(a.charAt(i)!=arr[j] && !map.get(arr[j])){
					ans = ans.add(factorial(n-1-i));
				}else if(a.charAt(i)==arr[j]){
					map.put(arr[j], true);
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
