import java.io.*;
public class Saver {
	

		public static void saveData() {
		    try {
		    	FileWriter writer = new FileWriter("Transcript.txt",true);
				writer.write(String.format("%20s %20s %20s %20s %20s\n", "School Name", "Student name", "Subject name", "Mark", "Email"));
				writer.write("_____________________________________________________________________________________________________________________\n");
				for(int i = 0; i<Main.mySchool.studentList.size(); i++) {
					for(int j = 0; j<Main.mySchool.subjectList.size(); j++) {
						writer.write(String.format("%20s %20s %20s %20s %20s\n", Main.mySchool.name, Main.mySchool.studentList.get(i).stuName , Main.mySchool.subjectList.get(j) , Main.mySchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark, Main.mySchool.studentList.get(i).mailList));
					}
					writer.write("_____________________________________________________________________________________________________________________\n");
				}
		        writer.close();
		        System.out.println("DATA SAVED!");
		    } catch(Exception e) {
		    	System.out.println("ERROR!!!!");
		        e.printStackTrace();
		    }
		}
	}


