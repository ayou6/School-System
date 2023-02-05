import java.io.*;
import java.util.Scanner;

public class Serialize {
	public static void serialize() {

		try {
			FileOutputStream file = new FileOutputStream(
					"C:\\Users\\Lenovo\\eclipse-workspace\\School\\transcript3.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(String.format("%20s %20s %20s %20s %20s\n", "School Name", "Student name", "Subject name",
					"Mark", "Email"));
			for (int i = 0; i < Main.mySchool.studentList.size(); i++) {
				for (int j = 0; j < Main.mySchool.subjectList.size(); j++) {
					out.writeObject(String.format("%20s %20s %20s %20s %20s\n", Main.mySchool.name,
							Main.mySchool.studentList.get(i).stuName, Main.mySchool.subjectList.get(j),
							Main.mySchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark,
							Main.mySchool.studentList.get(i).mailList));
				}
			}

			out.close();
			file.close();
			System.out.println("serialized and saved");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}