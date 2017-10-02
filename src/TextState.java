import java.util.ArrayList;
import java.util.List;
	
public class TextState {
	
	public String text;	
	private List<TextListener> observers = new ArrayList<>();	
	public TextState() {
		text = "";
	}
	public TextState(String t) {
		text = t;
	}
	public List<TextListener> getObservers() {
		return observers;
	}
	public String getText() {
	    return text;
	}    
	public void register(TextListener object) {
		observers.add(object);
	}
	public void unRegister(TextListener object) {
		observers.remove(object);
	}
	//public void notify() {		
	//}
	public void upDate() {
		for(TextListener object : observers) {
			object.upDate(this);
		}
	}
}

