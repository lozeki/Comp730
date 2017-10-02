import java.util.Observable;
import java.util.Observer;

public class MyObserver extends Observable{

	  private String message;

	  public String getMessage() {
	    return message;
	  }

	  public void changeMessage(String message) {
	    this.message = message;
	    setChanged();
	    notifyObservers(message);
	  }
	  
}