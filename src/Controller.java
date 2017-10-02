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
	public void parseInput(String s) {
		boolean found = false;
		for (String element:commands) {
		    if ( element.equals( "quit" )) {
		        found = true;
		    }
		}
		if (found == true && s =="quit") {
			quit();
		}else if(s =="register observers"){
			//TextState textState = new TextState();
			for(TextListener object : fullListObservers) {
				object.display(); // The observer will print out the waiting for TextState notifications
				this.textState.register(object);
			}			
		}else if(s =="status"){
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
						
		}else
		{
			System.out.println("Wrong command");
		}
	}	
	public void quit() {
		System.out.println("Quit program");
	}
}
