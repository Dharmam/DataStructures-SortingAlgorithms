package utils;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x){val =x;}
	
	public static ListNode find(ListNode head, int x){
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
	
	public static void print(ListNode head){
		ListNode temp = head;
		while(temp!=null){
			System.out.print(" --> " + temp.val);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void addAtTail(ListNode head, int x){
		if(head == null)head = new ListNode(x);
		else{
			ListNode temp = head;
			while(temp.next != null){
				temp = temp.next ;
			}
			temp.next = new ListNode(x);
		}
	}
	
	
	
}
