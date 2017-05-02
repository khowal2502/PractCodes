package hr;

import java.util.*;

class TNode {
	TNode left;
	TNode right;
    int data;
    
    TNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TreeNodes {
	
	public static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	public static int min = Integer.MAX_VALUE;
	
	public static int height(TNode root) {
		if(root==null) return 0;
		
        if(root.left==null && root.right==null){
        	return 0;
        }
        
        return 1 + max(height(root.left),height(root.right));
    }
	
	public static void inOrder(TNode root){
		if (root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void topView(TNode root, int ind){
		if (root==null){
			return;
		}
		if (ind<min){
			min = ind;
		}
		
		if(!map.containsKey(ind)){
			map.put(ind, root.data);
		}
		topView(root.left, ind-1);
		topView(root.right, ind+1);
	}

    public static int max(int a, int b){
        return a>b?a:b;
    }
    
    public static TNode insert(TNode root, int data) {
        if(root == null){
            return new TNode(data);
        }
        else {
        	TNode cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        TNode root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root, 0);
        while(map.containsKey(min)){
        	System.out.print(map.get(min)+" ");
        	min++;
        }
    }	
}