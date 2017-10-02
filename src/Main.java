import java.util.Observable;
import java.util.Observer;
public class Main {

	public static void main(String[] args) {
	    MyObserver board = new MyObserver();
	    Observer01 bob = new Observer01();
	    Observer01 joe = new Observer01();
	    board.addObserver(bob);
	    board.addObserver(joe);
	    board.changeMessage("More Homework!");
	  }

}
