
public class Observer02 implements TextListener{
	
	public String data;
	public int count;
	
	public Observer02() {
		count = 0;
		data ="";
	}
	public int getCount() {		
		return count;
	}
	public void display() {
		System.out.println("Observer02 is waiting for TextState notifications");
	}
	public void registered(boolean b) {
		if (b==true) {
			System.out.println("Observer02 is registered");
		}else {
			System.out.println("Observer02 is not registered for notifications");
		}
	}
	public void print() {
		System.out.println("Observer02 : " +data +" ,count = " +count);
	}
	public void upDate(TextState textState) {
		String s = "";  // temp for vowels string
		int c = 0;					// temp for count
		for (int i = 0; i < textState.text.length(); ++i) {
			if ("bcdfghjklmnpqrstvwxyz".contains(""+textState.text.toLowerCase().charAt(i)))
			{
				c++;
				s += textState.text.charAt(i);
			}
		}
		data = s;
		count = c;
	}	
	public boolean checkText(TextState textState) {
		String s = "";  // temp for vowels string
		boolean b = false;
		int c = 0;					// temp for count
		for (int i = 0; i < textState.text.length(); ++i) {
			if ("bcdfghjklmnpqrstvwxyz".contains(""+textState.text.toLowerCase().charAt(i)))
			{
				c++;
				s += textState.text.charAt(i);
			}
			if (c==10) {				
				b = true;
				break;
			}
		}
		data = s;
		count = c;
		this.print(); // Display the current vowels
		textState.unRegister(this); // DeTach this observer from TextState
		return b;
	}	
}
 