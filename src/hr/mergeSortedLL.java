package hr;

import java.util.Scanner;



public class mergeSortedLL {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node l1 = null;
		for(;n>0;--n){
			int d = scan.nextInt();
			int p = scan.nextInt();
			
			l1 = InsertNth(l1, d, p);
		}
		removeDuplicates(l1);
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
	
	public static Node mergeLLs(Node headA, Node headB){
		Node curr = null;
		Node head = new Node();
		
		if (headA == null){
			return headB;
		}
		
		if (headB == null){
			return headA;
		}
		
		while(headA!=null && headB!=null){
			Node n = new Node();
			if(headA.data > headB.data){
				n.data = headB.data;
				headB = headB.next;
			}else{
				n.data = headA.data;
				headA = headA.next;
			}
			
			if (curr==null) {
				curr = n;
				head = curr;
			}else{
				curr.next = n;
				curr = curr.next;
			}
		}
		
		if (headA == null) {
			while(headB!=null) {
				Node n = new Node();
				n.data = headB.data;
				headB = headB.next;
				
				if (curr==null) {
					curr = n;
					head = curr;
				}else{
					curr.next = n;
					curr = curr.next;
				}
			}
		}else if (headB == null) {
			while(headA!=null) {
				Node n = new Node();
				n.data = headA.data;
				headA = headA.next;
				
				if (curr==null) {
					curr = n;
					head = curr;
				}else{
					curr.next = n;
					curr = curr.next;
				}
			}
		}
		
		return head;
	}
	
	public static int printPos(Node head, int pos){
		int n = 0;
		int c = 0;
		Node h = head;
		
		while(h!=null){
			h = h.next;
			c++;
		}
		
		int np = c - pos - 1;
		h = head;
		while(np>0){
			h = h.next;
			np--;
		}
		
		n = h.data;
		
		return n;
	}
	
	public static Node removeDuplicates(Node head){
		if (head == null || head.next==null){
			return head;
		}
		
		Node h = head;
		Node prev = h;
		Node curr = h.next;
		
		while(curr!=null){
			if(prev.data==curr.data){
				prev.next = curr.next;
				curr = prev;
			}
			prev = curr;
			if (curr!=null){
				curr = curr.next;
			}
		}
		
		return head;
	}
}
