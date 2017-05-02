package IBit;

import java.util.Scanner;

public class MultiplyStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		System.out.println(multiply(a,b));
		scan.close();
	}
	
	public static String multiply(String a, String b) {
		int na = a.length();
		int nb = b.length();
		
		if(a.equals("0") || b.equals("0")){
			return "0";
		}
		
		StringBuilder arr[] = new StringBuilder[nb];
		for(int i=0;i<nb;++i){
			arr[i] = new StringBuilder("");
		}
		int max_len = 0;
		
		StringBuilder ans = new StringBuilder();
		int carry=0;
		for(int i=nb-1;i>=0;--i){
			for(int j=na-1;j>=0;--j){
				int mult = Integer.parseInt(Character.toString(b.charAt(i))) * 
						Integer.parseInt(Character.toString(a.charAt(j)));
				if(carry>0){
					mult+=carry;
					carry=0;
				}
				String s = Integer.toString(mult);
				if(mult>9){
					arr[i].append(s.charAt(1));
					carry = Integer.parseInt(Character.toString(s.charAt(0)));
				}else{
					arr[i].append(s);
				}
			}
			if(carry>0){
				arr[i].append(Integer.toString(carry));
				carry=0;
			}
			arr[i] = arr[i].reverse();
			for(int k=0;k<nb-i-1;++k){
				arr[i].append("0");
			}
			if(arr[i].length()>max_len){
				max_len = arr[i].length();
			}
		}
		for(int i=0;i<nb;++i){
			int n = arr[i].length();
			if(n<max_len){
				arr[i] = arr[i].reverse();
				for(int j=0;j<max_len-n;++j){
					arr[i].append(0);
				}
				arr[i] = arr[i].reverse();
			}
		}
		for(int i=max_len-1;i>=0;--i){
			int sum = carry;
			carry=0;
			for(int j=0;j<nb;++j){
				sum+=Integer.parseInt(Character.toString(arr[j].charAt(i)));
			}
			String s = Integer.toString(sum);
			if(sum>9){
				ans.append(s.charAt(s.length()-1));
				carry = Integer.parseInt(s.substring(0, s.length()-1));
			}else{
				ans.append(s);
			}
		}
		
		if(carry>0){
			ans.append(Integer.toString(carry));
			carry=0;
		}
		ans = ans.reverse();
		while(ans.charAt(0)=='0'){
			ans.delete(0, 1);
		}
		
		return ans.toString();
	}
}
