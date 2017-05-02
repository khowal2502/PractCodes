package IBit;

import java.util.Scanner;

public class CountAndSay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		
		System.out.println(countAndSay(s));
		
		scan.close();
	}
	
	public static String countAndSay(int a) {
		String ans = "1";
		for(int i=2;i<=a;++i){
			ans = getNextStr(ans);
		}
		
		return ans;
	}
	
	public static String getNextStr(String a){
		StringBuilder str = new StringBuilder();
		char arr[] = a.toCharArray();
		int n = arr.length;
		int i=0;
		char app = arr[i];
		int cnt=0;
		while(i<n){
			if(app==arr[i]){
				cnt++;
				i++;
			}else{
				str.append(Integer.toString(cnt));
				str.append(app);
				app=arr[i];
				cnt=1;
				i++;
			}
		}
		
		str.append(Integer.toString(cnt));
		str.append(app);
		
		return str.toString();
	}

}
