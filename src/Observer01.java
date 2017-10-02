
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
	public void registered(boolean b) {
		if (b==true) {
			System.out.println("Observer01 is registered");
		}else {
			System.out.println("Observer01 is not registered for notifications");
		}
	}
	public void upDate(TextState textState) {
		data = textState.text;
	}	
}
 