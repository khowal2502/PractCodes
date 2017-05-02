package IBit;

import java.util.ArrayList;
import java.util.Scanner;

public class PrettyJson {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		
		System.out.println(prettyJSON(a));
		scan.close();
	}
	
	public static ArrayList<String> prettyJSON(String a) {
		a = a.replaceAll(" ", "");
		ArrayList<String> ans = new ArrayList<String>();
		int countt=0;
		char arr[] = a.toCharArray();
		int n = arr.length;
		StringBuilder newArr = new StringBuilder();
		
		for(int i=0;i<n;++i){
			if(arr[i]=='[' || arr[i]=='{'){
				newArr.append(arr[i]);
				newArr.append('\n');
				countt++;
				for(int j=0;j<countt;++j){
					newArr.append('\t');
				}
			}else if(arr[i]==','){
				newArr.append(arr[i]);
				newArr.append('\n');
				for(int j=0;j<countt;++j){
					newArr.append('\t');
				}
			}else if(arr[i]==']' || arr[i]=='}'){
				countt--;
				newArr.append('\n');
				for(int j=0;j<countt;++j){
					newArr.append('\t');
				}
				newArr.append(arr[i]);
			}else if(arr[i]==':'){
				newArr.append(arr[i]);
				if(arr[i+1]=='[' || arr[i+1]=='{'){
					newArr.append('\n');
					for(int j=0;j<countt;++j){
						newArr.append('\t');
					}
				}
			}else{
				newArr.append(arr[i]);
			}
		}
		
		String ansArr[] = newArr.toString().split("\\n");
		for(int i=0;i<ansArr.length;++i){
			ans.add(ansArr[i]);
		}
		return ans;
	}

}
