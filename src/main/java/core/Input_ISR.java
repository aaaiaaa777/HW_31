package core;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input_ISR {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		System.out.print("enter your first name:");
	    String first_name=br.readLine();
	    System.out.println("enter your last name: ");
	    String last_name=br.readLine();
	    System.out.println("your full name is: " +first_name+" "+last_name);
	    br.close();
		

	}

}
