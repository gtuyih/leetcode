package listnode;


public class Q21_MergeTwoLists {
	  
	public static ListNode mergeTwoLists(ListNode x,ListNode y){
		if(x==null) return y;
		if(y==null) return x;
		ListNode head=new ListNode(0);
		head.next=x;
		ListNode res=head;
		while(head.next!=null){
			while(y!=null && y.val<=head.next.val ){				
					ListNode insert = y;
					y=y.next;
					insert.next=head.next;
					head.next=insert;												
			}			
			head=head.next;
		}
		while(y!=null){
			head.next=y;
			y=y.next;
			head=head.next;
		}
		return res.next;   
    }


}
