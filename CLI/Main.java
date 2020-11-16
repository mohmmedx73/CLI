
import java.util.Scanner; 
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) 
	{
		String current = "C:/Ubuntu"; 
		
		
		Terminal objT = new Terminal();
		Scanner Input = new Scanner(System.in);
		
		while(true) {
			System.out.print(current + " ");
			String command = Input.nextLine();
			Parser objP = new Parser(command); 
			
		}
	    
	}
}
