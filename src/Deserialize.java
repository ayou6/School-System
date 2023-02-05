import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void deserialize() {
	 try
	    {
	        
	        FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\School\\transcript3.txt");
	        ObjectInputStream in = new ObjectInputStream(file);

	        // Method for deserialization of object
	        while (true) {
	        	try {
	    	        String object1 = (String) in.readObject();
	    	        System.out.println(object1);
	        	}
	        	catch (EOFException e) {
	        		break;
	        	}
	        }
	        
	        in.close();
	        file.close();
            
	        System.out.println("Object has been deserialized ");
	    }

	    catch(IOException ex)
	    {
	        System.out.println("IOException is caught");
	    }

	    catch(ClassNotFoundException ex)
	    {
	        System.out.println("ClassNotFoundException is caught");
	    }
	//
	}

	
}