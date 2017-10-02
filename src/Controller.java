import java.util.ArrayList;
import java.util.List;

public class Controller {
	public String[] commands;
	List<TextListener> fullListObservers = new ArrayList<>();
	TextState textState;
	
	public Controller() {
		commands = new String[]{"quit","register observers","status"};
		textState = new TextState();
		Observer01 object01  = new Observer01();
		fullListObservers.add(object01);
		Observer02 object02  = new Observer02();
		fullListObservers.add(object02);
		Observer03 object03  = new Observer03();
		fullListObservers.add(object03);
	}	
	public boolean parseInput(String s) {	
		if ((s.length()>5) && s.substring(0,5).equals("send ")){   // Use case 5
			this.textState.addText(s.substring(5)); // add the text after the key word "send " to the variable textState.text
			for (int i=0; i<this.textState.getObservers().size(); i++) {
				if(this.textState.getObservers().get(i).checkText(textState)) { // the size of array list will be reduced each time the condition is true 
					i--;
				}
			}
		}else if (s.equals("register observers")){		// Use case 2	
			for(TextListener object : fullListObservers) {
				object.display(); // The observer will print out the waiting for TextState notifications
				this.textState.register(object);
			}			
		}else if(s.equals("status")){					// Use case 3
			boolean inside;
			for(TextListener object : fullListObservers) {
				inside = false;
				for(TextListener observer : this.textState.getObservers()) {
					if (object.equals(observer)) {
						inside = true;
					}
				}
				object.registered(inside); // the observer will print out its registered status
			}						
		}else if (s.equals("unregister")) {			// Use case 4
					
			for (int i=0; i<this.textState.getObservers().size(); i++) {
				this.textState.unRegister(this.textState.getObservers().get(i)); // unregister all current observers
					i--;				
			}	
			/*for(TextListener object : this.textState.getObservers()) { // can't use this method because the function will unregister the observers, but the system still think it still in the array and check it -> error
				this.textState.unRegister(object);
			}*/
		}else if (s.equals("quit")) {			// Use case 1
			quit();
			return true;			
		}else			
		{
			System.out.println("Wrong command");
		}
		return false;
	}	
	public void quit() {
		System.out.println("Quit program");
	}
}
