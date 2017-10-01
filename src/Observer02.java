
public class Observer02 implements TextListener{
	
	public String data;
	public int count;
	
	public Observer02() {
		count = 0;
		data ="";
	}
	public int getCount() {
		int n =0;
		// do st
		return n;
	}
	public void display() {
		System.out.println("Observer02 is waiting for TextState notifications");
	}
	public void upDate(TextState textState) {
		data = textState.text;
	}	
}
 