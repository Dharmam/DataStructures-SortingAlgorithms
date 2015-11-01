package dharmam.sample.algorithm;

public class InStackNode {

public int data ;
public InStackNode next ;

public InStackNode(int data, InStackNode next)
{
this.data = data;
this.next = next;
}

@Override
public String toString() {
	return "IntNode [data=" + data + "]";
}
}
