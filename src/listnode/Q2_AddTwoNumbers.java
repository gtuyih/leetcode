package listnode;

public class Q2_AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if(l2.next==null && l2.val==0) return l1;
    	if(l1.next==null && l1.val==0) return l2;
    	ListNode first = new ListNode(0);
    	int carry=0;
    	ListNode pos ;
    	while(l1!=null && l2!=null){
    		int a = l1.val+l2.val;
    		if(a>9) {
    			carry=1;
    			pos = new ListNode(a-9);
    		}else{
    			pos = new ListNode(a);
    		}
    		l1=pos;
    		pos.next=l1.next;
    		l2=l2.next;
    		carry=0;
    	}
    	
        return l1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(4);
		ListNode c = new ListNode(3);
		
		a.next=b;
		b.next=c;
		
		ListNode h = new ListNode(5);
		ListNode i = new ListNode(6);
		ListNode j = new ListNode(4);
		h.next=i;
		i.next=j;
		
		ListNode x = addTwoNumbers(a,h);
		while(x!=null){
			if(x.next==null) System.out.println(x.val); 
			else System.out.print(x.val+"->");
			x=x.next;
		}
	}

}
