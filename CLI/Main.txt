
import java.util.Scanner; 
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException 
	{
		String current = "C:\\"; 
		Terminal obj_parse = new Terminal(); 
		Scanner Input = new Scanner(System.in);
		System.out.print(current + " ");
		String command = Input.nextLine();
		obj_parse.ls();
				
			
			
		
		
		
		
		
		
		
		
		
		
		
		/*
		String[] M = obj1.getArguments();  // forcing for Argument 
	    for(int i=0; M[i]!=null; i++)
	    {
	    	System.out.println(M[i]);
	    }
	    */
	    Input.close();
	}
}
