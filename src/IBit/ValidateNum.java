package IBit;

import java.util.Scanner;

public class ValidateNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		System.out.println(isNumber(s));
		scan.close();
	}
	
	public static int isNumber(final String a) {
		String s = a.trim();
	    if(s.length()==0){
	        return 0;
	    }
		
		int i=0;
		if(s.charAt(0)=='-' || s.charAt(0)=='+'){
			i++;
		}
		int ret = 0;
		boolean e = false;
		boolean d = false;
		while(i<s.length()){
			if(s.charAt(i)>='0' && s.charAt(i)<='9'){
				ret=1;
				i++;
			}else if(s.charAt(i)=='e'){
				if(!e && i>0 && s.charAt(i-1)>='0' && s.charAt(i-1)<='9'){
					e=true;
					d=true;
					i++;
				}else{
					return 0;
				}
			}else if(s.charAt(i)=='.'){
				if(!d && i!=(s.length()-1)){
					d=true;
					i++;
				}else{
					return 0;
				}
			}else if(s.charAt(i)=='-' || s.charAt(i)=='+'){
				if(s.charAt(i-1)=='e'){
					i++;
				}else{
					return 0;
				}
			}else{
				return 0;
			}
		}
		
		return ret;
	}

}
