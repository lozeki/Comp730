
public class Controller {
	public String[] commands;
	
	public Controller() {
		commands = new String[]{"quit","register observers","right"};
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
			TextState textState = new TextState();
			Observer01 object01  = new Observer01();
			textState.register(object01);
			object01.display();	
			Observer02 object02  = new Observer02();
			textState.register(object02);
			object02.display();	
			Observer03 object03  = new Observer03();
			textState.register(object03);
			object03.display();	
		}else
		{
			System.out.println("Wrong command");
		}
	}	
	public void quit() {
		System.out.println("Quit program");
	}
}
