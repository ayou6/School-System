
import java.io.File;
import java.io.FileWriter;

public class Folder {
	public static void saveDataFolder() {
		File newFolder = new File("C:\\Users\\Lenovo\\Documents\\Transcripts");
		if (!newFolder.exists()) {
			newFolder.mkdirs();
		}

		File file = new File("C:\\Users\\Lenovo\\Documents\\Transcripts\\transcripts.txt");
		try {
			FileWriter writer = new FileWriter(file, true);
			writer.write(String.format("%20s %20s %20s %20s %20s\n", "School Name", "Student name", "Subject name",
					"Mark", "Email"));
			writer.write(
					"_____________________________________________________________________________________________________________________\n");
			for (int i = 0; i < Main.mySchool.studentList.size(); i++) {
				for (int j = 0; j < Main.mySchool.subjectList.size(); j++) {
					writer.write(String.format("%20s %20s %20s %20s %20s\n", Main.mySchool.name,
							Main.mySchool.studentList.get(i).stuName, Main.mySchool.subjectList.get(j),
							Main.mySchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark,
							Main.mySchool.studentList.get(i).mailList));
				}
				writer.write(
						"_____________________________________________________________________________________________________________________\n");
			}
			writer.close();
			System.out.println("Sucessfully Created");
		} catch (Exception e) {
			System.out.println("an errrrroooooor");
		}
	}
}
