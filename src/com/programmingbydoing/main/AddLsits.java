package com.programmingbydoing.main;

public class AddLsits {

	public static void main( String[] args ) {
		

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode( l1.val+l2.val );
		result.next = addTwoNumbers( l1.next, l2.next );
		return result;
	}

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode( l1.val+l2.val );
		if (l1.next!=null && l2.next!=null) {
        
		result.next = addTwoNumbers( l1.next, l2.next );}
		return result;
	
    }
}