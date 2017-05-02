package IBit;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		
		System.out.println(power(a));
		scan.close();
	}
	
	public static int power(String a) {
	    BigInteger m = new BigInteger(a);
	    int ans = 1;
	    
	    if(m.equals(BigInteger.ONE)) ans =0;
	    while(m.compareTo(BigInteger.ONE)==1){
		    if(m.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))){
		    	m = m.divide(BigInteger.valueOf(2));
		    }else{
		    	ans=0;
		    	break;
		    }
	    }
	    return ans;
	}

}
