package pps_12;

//https://leetcode.com/problems/middle-of-the-linked-list/

public class PPS_12_4 {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { 
			this.val = val; 
		}
	
		ListNode(int val, ListNode next) {
			this.val = val; 
			this.next = next; 
		}
	}
	
	public ListNode middleNode(ListNode head) {
	    
	    ListNode fastRunner = head;
	    ListNode slowRunner = head;

	    while(true){
	        if(fastRunner == null || fastRunner.next == null) {
	            break;
	        }
	        slowRunner = slowRunner.next;
	        fastRunner = fastRunner.next.next;
	    }

	    return slowRunner;
	  }
}
