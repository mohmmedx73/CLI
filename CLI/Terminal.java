
import java.util.Date;
import java.io.*;




public class Terminal{
	
    public void ls() 
	{
		int i = 0 ;
        File obj = new File("C:/Ubuntu");
        
        File[] lstFiles = obj.listFiles(); 
         
        int Size = lstFiles.length; 
        while (i < Size)
        {
        	System.out.println(lstFiles[i].getName()); 
        	i++; 
        }
             
    }
    
    public void more(String nameF)
    {
    	try
        {
            FileInputStream inputStream = new FileInputStream("C:/Ubuntu/" + nameF);
            int data = inputStream.read();
            while(data != -1)
            {
                System.out.print((char)data);
                data = inputStream.read();
            }
            inputStream.close();
            System.out.println(); 
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    public void date()
    {
        Date date = new Date();
        System.out.println(date.toString());
    }

    public void clear() 
    {
    	for(int i=0; i<10; i++)
    	{
    		System.out.print("\n"); 
    	}

    }
}


