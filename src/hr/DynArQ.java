package hr;

import java.util.Scanner;
import java.util.ArrayList;

public class DynArQ {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int lastAns = 0;
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<N;++i){
            ArrayList<Integer> s = new ArrayList<Integer>();
            a.add(s);
        }
        for(;Q>0;--Q){
            int q = scan.nextInt();
            if (q==1) {
                int s = scan.nextInt();
                int v = scan.nextInt();
                
                int in = ((s^lastAns)%N);
                a.get(in).add(v);
            } else {
                int s = scan.nextInt();
                int v = scan.nextInt();
                
                int in = ((s^lastAns)%N);
                int size = a.get(in).size();
                int pos = (v%size);
                lastAns = a.get(in).get(pos);
                System.out.println(lastAns);
            }
        }
        scan.close();
    }
}
