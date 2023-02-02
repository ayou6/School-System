import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void deserialize() {
	 try
	    {
	        
	        FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\School\\transcript.txt");
	        ObjectInputStream in = new ObjectInputStream(file);

	        // Method for deserialization of object
	        Student object1 = (Student) in.readObject();
	        
	        in.close();
	        file.close();
            
	        System.out.println("Object has been deserialized ");
	        System.out.println("Student Name:  " + object1.getStuName() );
	   
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