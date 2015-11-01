package dharmam.sample.algorithm;
public class StackExample {
	static InStackNode top1;
	static OutStackNode top2;
	public static void main(String[] args) {

		Push(10);
		Push(20);
		pop();
		Push(30);
		pop();
		Push(40);
		pop();
		pop();
		Push(50);
		pop();
	}
	public static void Push(int i)
	{
		if( top1 == null)
		{ 
			top1 = new InStackNode(i, null) ;
		}
		else
		{ 
			InStackNode temp = top1;
			top1 = new InStackNode(i, temp);
		}
		System.out.println("Value "+ top1.data + " en-qued.");
		
	}
	public static void PushOutStack(InStackNode tm)
	{
		if(!isempty(tm))
		{
			while(tm != null)
			{
				if(top2 == null)
				{
					top2 = new OutStackNode(tm.data, null);
				}
				else
				{
					OutStackNode newone = top2;
					top2 = new OutStackNode(tm.data,newone);
				}
				tm = tm.next;
			}
		}
		else
		{

		}
	}
	private static boolean isempty(InStackNode tm) {
		if( tm != null)
			return false;
		else return true;
	}
	public static void pop()
	{
		top2 = null;
		PushOutStack(top1);
		if(!isempty(top2))
		{
			System.out.println("Value "+top2.value+" de-qued.");
			top2 = top2.next;
		}
		else
		{
			System.out.println("Stack is empty.");
		}
		top1 = null;
		PushInStack(top2);
	}
	private static void PushInStack(OutStackNode top22) {
		if(!isempty(top22))
		{
			while(top22 != null)
			{
				if(top1 == null)
				{
					top1 = new InStackNode(top22.value, null);
				}
				else
				{
					InStackNode newtwo = top1;
					top1 = new InStackNode(top22.value,newtwo);
				}
				top22 = top22.next;
			}
		}
		else
		{

		}

	}
	public static boolean isempty(OutStackNode node) {
		if( node != null)
			return false;
		else return true;
	}

}
