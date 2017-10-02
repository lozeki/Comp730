import java.util.ArrayList;
import java.util.List;
	
public class TextState {
	
	public String text;	
	private List<TextListener> observers = new ArrayList<>();	
	
	public TextState() {
		text = "";
	}
	public TextState(String s) {
		text = s;
		observers = null;
	}
	public void addText(String s) {
		text = s;
		this.upDate();
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
	public void upDate() {
		for(TextListener object : this.observers) {
			object.upDate(this);
		}
	}
}

