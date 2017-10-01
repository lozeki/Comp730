
public class Observer01 implements TextListener{
	
	public String data;
	public int count;
	
	public Observer01() {
		count = 0;
		data ="";
	}
	public int getCount() {
		int n =0;
		// do st
		return n;
	}
	public void display() {
		System.out.println("Observer01 is waiting for TextState notifications");
	}
	public void upDate(TextState textState) {
		data = textState.text;
	}	
}
 