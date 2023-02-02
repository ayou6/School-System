import java.io.*;
import java.util.Scanner;
public class Serialize  {
	public static void serialize() {

	Student student = new Student();
	student.stuName = "As3ad";
	   try{
	       FileOutputStream file = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\School\\transcript.txt");
	       ObjectOutputStream out = new ObjectOutputStream(file);
	       out.writeObject(student);
	       out.close();
	       file.close();
	       System.out.println("serialized and saved");

	   }catch (Exception e){
	     e.printStackTrace();

	   }
	}
}