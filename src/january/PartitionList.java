package january;

import utils.ListNode;

public class PartitionList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode.addAtTail(head, 4);
		ListNode.addAtTail(head, 3);
		ListNode.addAtTail(head, 2);
		ListNode.addAtTail(head, 5);
		ListNode.addAtTail(head, 2);

		ListNode.print(head);

		partition(head, 3);

		ListNode.print(head);
	}

	static ListNode partition(ListNode head, int x) {
		ListNode lessHead = new ListNode(-1);
		ListNode moreHead = new ListNode(-1);
		ListNode curr = head ;
		ListNode lessCurr = lessHead ;
		ListNode moreCurr = moreHead ;
		
		while(curr != null) {
			if(curr.val<x) {
				lessCurr.next = new ListNode(curr.val);
				lessCurr = lessCurr.next;
			}else {
				moreCurr.next = new ListNode(curr.val);
				moreCurr = moreCurr.next;
			}
			curr = curr.next;
			System.out.println("Less queue - " ); ListNode.print(lessHead);
			System.out.println("More queue - " ); ListNode.print(moreHead);

		}
		
		lessCurr.next=moreHead.next;
		
		System.out.println("Queue - "); ListNode.print(lessHead.next);
		return lessHead.next;

	}

}
