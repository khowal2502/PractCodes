package IBit;

import java.util.Scanner;

public class ImplementATOI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		System.out.println(atoi(s));
		scan.close();
	}
	
	public static int atoi(final String a) {
		String s = a.trim();
		int ret = 0;
		StringBuilder ans = new StringBuilder("");
		int i=0;
		boolean neg=false;
		if(s.charAt(0)=='-'){
			neg=true;
			i++;
		}
		if(s.charAt(0)=='+'){
			i++;
		}
		
		while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
			ans.append(s.charAt(i));
			i++;
		}
		
		try{
			if(ans.length()>0){
				ret = Integer.parseInt(ans.toString());
				if(neg){
					ret *= -1;
				}
			}
		}catch(Exception e){
			if(neg){
				ret = Integer.MIN_VALUE;
			}else{
				ret = Integer.MAX_VALUE;
			}
		}
		
		return ret;
	}
}
