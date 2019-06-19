package core;
import java.io.Console;
public class Input_Console {

	public static void main(String[] args) {
		Console c=System.console();
		if (c==null) {System.err.println("Console is not available!"); System.exit(0);}
		
	    String first_name=c.readLine("enter your first name:");
	    String last_name=c.readLine("enter your last name: ");
	    System.out.println("your full name is: " +first_name+" "+last_name);
	
		

	}

}
