
import java.util.*;
import static java.lang.System.*;
import java.io.File; 
public class Parser {
	
	String[] args; 
	String cmd; 
	
	
	
	
	
	
	public boolean parse(String input)
	{
		return true; 
	}
	public String getCmd()
	{
		return ""; 
	}
	public String[] getArguments() 
	{
		 String M[] = new String[100];
		 M[0] = "mohmmed"; 
		 
		 return M ; 
	}
	
}


class Terminal{
	
	public void ls() 
	{
        
        File obj = new File("C:/Ubuntu");
        
        File[] lstFiles = obj.listFiles(); 
        int i = 0 ; 
        int size = lstFiles.length; 
        while (i < size)
        {
            if(lstFiles[i].isFile())            // file 
            	System.out.println(lstFiles[i].getName());
            
            else if(lstFiles[i].isDirectory())  // folder
            	System.out.println(lstFiles[i].getName());
        	
        	i++; 
        }
            
     
        
    }
}


