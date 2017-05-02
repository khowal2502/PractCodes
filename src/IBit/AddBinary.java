package IBit;

import java.util.Scanner;

public class AddBinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		System.out.println(addBinary(a,b));
		scan.close();
	}
	
	public static String addBinary(String a, String b) {
		StringBuilder ans = new StringBuilder();
		int carry = 0;
		
		if(a.length()<b.length()){
			String s = a;
			a = b;
			b = s;
		}
		
		int na = a.length();
		int nb = b.length();
		
		for(int i=na-1;i>=0;--i){
			if((i-(na-nb))<nb && (i-(na-nb))>=0){
				char ca = a.charAt(i);
				char cb = b.charAt(i-(na-nb));
				
				if(ca=='1' && cb=='1'){
					if(carry==1){
						ans.append(1);
					}else{
						ans.append(0);
					}
					carry=1;
				}else if(ca=='1' && cb=='0' || ca=='0' && cb=='1'){
					if(carry==1){
						ans.append(0);
					}else{
						ans.append(1);
					}
				}else{
					if(carry==1){
						ans.append(1);
						carry=0;
					}else{
						ans.append(0);
					}
				}
			}else{
				if(carry==1){
					if(a.charAt(i)=='0'){
						ans.append(1);
						carry=0;
					}else{
						ans.append(0);
					}
				}else{
					ans.append(a.charAt(i));
				}
			}
		}
		if(carry==1){
			ans.append(1);
		}
		
		return ans.reverse().toString();
	}

}
