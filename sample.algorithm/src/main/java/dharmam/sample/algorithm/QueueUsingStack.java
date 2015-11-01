package dharmam.sample.algorithm;
public class QueueUsingStack {

	public static  StackEnqueue EnStack;
	public static StackDequeue DeStack;

	public static void main(String[] args) {

		push(1);
		pop();
		push(2);
		pop();
		push(3);
		push(4);
		push(5);
		push(6);
		pop();
		pop();
		pop();
		pop();
		pop();
		
		
	}

	private static void push(int i) 
	{
		if(StackEnqueue.topEn < StackEnqueue.capacity)
		{
			if(StackEnqueue.topEn == -1)
			{
				EnStack = new StackEnqueue(i);
				StackEnqueue.topEn++;
			}
			else
			{
				EnStack.arrEn[StackEnqueue.topEn+1] = i;
				StackEnqueue.topEn++;
			}
			System.out.println( "It's a PUSH - Key " + i + " Enqued.");
		}
		else
		{System.out.println("Can't PUSH - Queue is full, please Dequeue some element to proceed.");}
	}

	private static void pop() 
	{
		// Take data from Enqueue Stack to Dequeue stack only when dequeue stack is empty.

		if(StackDequeue.topDe == -1)
		{
			int count = StackEnqueue.topEn;
			while(count != -1)
			{
				if(StackDequeue.topDe == -1)
				{
					DeStack = new StackDequeue(EnStack.arrEn[count]);
					StackDequeue.topDe++;
				}
				else
				{
					DeStack.arrDn[StackDequeue.topDe+1] = EnStack.arrEn[count];
					StackDequeue.topDe++;
				}

				StackEnqueue.topEn--;
				count--;
			}

		}
		
		// Check if Dequeue stack is empty.
		
		if (StackDequeue.topDe >-1)
		{
			System.out.println( "Its's a POP - Key " + DeStack.arrDn[StackDequeue.topDe] + " Dequed.");
			StackDequeue.topDe--;
		}
		else
		{
			System.out.println("Can't POP - Queue is empty, please enqueue some values.");
		}


	}

}
