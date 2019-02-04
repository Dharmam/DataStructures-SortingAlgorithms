package utils;

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x){val =x;}
	
	static ListNode find(ListNode head, int x){
		if(head == null)return null;
		else{
			ListNode temp = head;
			while(temp != null){
				if(temp.val == x)return temp;
				temp = temp.next ;
			}
			return null;
		}
	}
	
	static void print(ListNode head){
		ListNode temp = head;
		while(temp!=null){
			System.out.println("--> " + temp.val);
			temp = temp.next;
		}
	}
	
}
