package dharmam.sample.algorithm;
public class OutStackNode {

	public int value;
	public OutStackNode next;

	public OutStackNode(int value, OutStackNode next)
	{
		this.value = value;
		this.next = next;
	}

@Override
public String toString() {
	return "IntNode [data=" + value + "]";
}

}
