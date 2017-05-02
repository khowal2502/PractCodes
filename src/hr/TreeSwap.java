package hr;

import java.util.Scanner;
import java.util.HashMap;

public class TreeSwap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		HashMap<Integer, Node> map = new HashMap<Integer, Node>();
		Node root = new Node();
		root.data = 1;
		map.put(1, root);
		int ncount = 1;
		for(int i=1;i<=N;++i){
			int a = scan.nextInt();
			int b = scan.nextInt();
			Node n = map.get(i);
			if(a!=-1){
				Node na = new Node();
				na.data = a;
				n.left = na;
				ncount++;
				map.put(ncount, na);
			}
			if(b!=-1){
				Node nb = new Node();
				nb.data = b;
				n.right = nb;
				ncount++;
				map.put(ncount, nb);
			}
		}
		int h = height(root);
		int T = scan.nextInt();
		for(int i=0;i<T;++i){
			int n = scan.nextInt();
			int a = 1;
			while(a*n<=h){
				treeSwap(root, a*n);
				a++;
			}
			inOrder(root);
			System.out.println();
		}
		
		scan.close();
	}
	
	public static int height(Node root) {
		if(root==null) return 0;
		
        if(root.left==null && root.right==null){
        	return 0;
        }
        
        return 1 + max(height(root.left),height(root.right));
    }

	public static int max(int a, int b){
        return a>b?a:b;
    }
	
	public static void treeSwap(Node root, int n){
		if(root==null || n<1) return;
		
		if(n==1){
			Node t = root.left;
			root.left = root.right;
			root.right = t;
		}else{
			treeSwap(root.left, n-1);
			treeSwap(root.right, n-1);
		}
	}
	
	public static void inOrder(Node root){
		if (root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
}
