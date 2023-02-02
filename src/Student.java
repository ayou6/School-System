import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class Student implements Serializable{
   
	public String stuName;
	
     public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
    ArrayList<Subject> studentSubjectList = new ArrayList<Subject>();
    HashSet <String> mailList = new HashSet<String>();
 }
