import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Controller control = new Controller();
		// to get input
		InputStreamReader cin = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(cin);
		String input = "nothing";
		// test
		System.out.println("command: register observers");
		control.parseInput("register observers");
		System.out.println("command: status");
		control.parseInput("status");
		System.out.println("command: send The Observer Pattern has been a staple of software design patterns even before it was codified in 1994");
		control.parseInput("send The Observer Pattern has been a staple of software design patterns even before it was codified in 1994");
		//control.parseInput("quit");
		// test
		while(true) {
			System.out.print("Your command : ");
			input = br.readLine();			
			if (control.parseInput(input)) {
				break;
			}	
		}
	}
}
