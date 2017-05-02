package IBit;

public class ReverseInteger {

	public static void main(String[] args) {
		
	}
	
	public static int reverse(int a) {
		int ans = 0;
		boolean neg = false;
		if(a<0){
			neg = true;
			a *= -1;
		}
		
		StringBuilder s = new StringBuilder();
		s = s.append(Integer.toString(a));
		String rs = s.reverse().toString();
		try{
			ans = Integer.parseInt(rs);
		}catch(Exception e){
			return ans;
		}
		if(neg){
			ans *= -1;
		}
		return ans;
	}

}
