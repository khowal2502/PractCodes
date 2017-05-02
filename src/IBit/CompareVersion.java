package IBit;

import java.util.Scanner;

public class CompareVersion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		System.out.println(compareVersion(a, b));
		scan.close();
	}
	
	public static int compareVersion(String a, String b) {
		int ans = 0;
		String[] arra = a.split("\\.");
		String[] arrb = b.split("\\.");
		
		if(arra.length<arrb.length){
			ans=-1;
		}else if(arra.length>arrb.length){
			ans=1;
		}
		
		int i=0;
		while(i<arra.length && i<arrb.length){
			int n = compareStrings(arra[i], arrb[i]);
			if (n==1){
				return 1;
			}else if(n==0){
				i++;
			}else{
				return -1;
			}
		}
		boolean c = false;
		if(i<arra.length){
			c = checkZero(arra, i);
		}else if(i<arrb.length){
			c = checkZero(arrb, i);
		}
		
		if(c) ans=0;
		
		return ans;
	}
	
	public static boolean checkZero(String arr[], int i){
		while(i<arr.length){
			String a = arr[i];
			while(a.length()>0 && a.charAt(0)=='0'){
				a = a.substring(1, a.length());
			}
			if(a.length()!=0){
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static int compareStrings(String a, String b){
		while(a.length()>0 && a.charAt(0)=='0'){
			a = a.substring(1, a.length());
		}
		
		while(b.length()>0 && b.charAt(0)=='0'){
			b = b.substring(1, b.length());
		}
		
		if(a.length()>b.length()){
			return 1;
		}else if (a.length()<b.length()){
			return -1;
		}else{
			int i=0;
			while(i<a.length()){
				if(a.charAt(i)>b.charAt(i)){
					return 1;
				}else if(a.charAt(i)<b.charAt(i)){
					return -1;
				}
				i++;
			}
		}
		
		return 0;
	}
}
