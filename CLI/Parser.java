
import java.util.*;
import static java.lang.System.*;
import java.io.File;
import java.io.IOException; 
public class Parser {
	private String command; 
	ArrayList<String> args = new ArrayList<String>(); 
	String cmd; 
	
	Terminal objT = new Terminal(); 
	
	
	public Parser(String c) 
	{
	    command = c;
	    Check(command);
	}
	
	public void Check(String input) 
	{
	    int c = 0;
	    String[] content = command.split(" ");
	    int size = content.length; 

	    for(int i=0; i<size; i++)
	    {
	        if(i==0)
		    cmd = content[0];
	        else
		    args.add(content[i]); 
	    }
	    if(cmd.equals("ls")) {
		objT.ls();
	    }
	    else if(cmd.equals("more")) 
		objT.more(args.get(0)); 

	    else if(cmd.equals("date"))
		objT.date(); 
	    else if(cmd.equals("clear")) 
		objT.clear(); 
	    
	}
	
	
}



