package dharmam.sample.algorithm;
public class StackEnqueue {

	public StackEnqueue(int i) {
		arrEn[topEn+1] = i;
		
	}
	public static int capacity = 10;
	public int arrEn[] = new int[capacity];
	public static int topEn = -1;
}	