
public class Observer03 implements TextListener{
	
	public String data;
	public int count;
	
	public Observer03() {
		count = 0;
		data ="";
	}
	public int getCount() {
		int n =0;
		// do st
		return n;
	}
	public void display() {
		System.out.println("Observer03 is waiting for TextState notifications");
	}
	public void registered(boolean b) {
		if (b==true) {
			System.out.println("Observer03 is registered");
		}else {
			System.out.println("Observer03 is not registered for notifications");
		}
	}
	public void print() {
		System.out.println("Observer03 : " +data +" ,count = " +count);
	}
	public void upDate(TextState textState) {
		String s = "";  // temp for vowels string
		int c = 0;					// temp for count
		for (int i = 0; i < textState.text.toLowerCase().length(); ++i) {
			if ("1234567890".contains(""+textState.text.toLowerCase().charAt(i)))
			{
				c++;
				s += textState.text.charAt(i);
			}
		}
		data = s;
		count = c;
	}	
	public boolean checkText(TextState textState) {
		this.upDate(textState); // update then print out the result
		this.print();
		return false;
	}	
}
 