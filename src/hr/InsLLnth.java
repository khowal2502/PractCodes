package hr;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node right;
	Node left;
}

public class InsLLnth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node ll = null;
		for(;n>0;--n){
			int d = scan.nextInt();
			int p = scan.nextInt();
			
			ll = InsertNth(ll, d, p);
		}
		
		reversePrint(ll);
		scan.close();
	}
	
	public static Node InsertNth(Node head, int data, int position) {
		Node n = new Node();
	    n.data = data;
	    n.next = null;
	    
	    if (head==null) {
	        return n;
	    }
	    
	    if (position>0) {
	        Node curr = head;
	        for(int i=1;i<position;++i){
	            curr = curr.next;
	        }
	        if(curr!=null){
	        	n.next = curr.next;
	        } else {
	        	n.next = null;
	        }
	        curr.next = n;
	    }else{
	        n.next = head;
	        head = n;
	    }

	    return head;
	}
	
	public static void reversePrint(Node head){
		if (head==null) {
	        return;
	    }
		
		if(head.next==null){
			System.out.println(head.data);
			return;
		}
	    
	    Node prev = null;
	    Node curr = head;
	    Node next = head.next;
	    
	    while(next.next!=null){
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	        next = next.next;
	    }
	    
	    curr.next = prev;
	    next.next = curr;
	    
	    while(next.next!=null){
	        System.out.println(next.data);
	        next = next.next;
	    }
	    System.out.println(next.data);
	}

}
