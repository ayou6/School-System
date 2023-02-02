import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static School mySchool = new School();

	public static void main(String[] args) throws Throwable {
		int cntStat1 = 0;
		int cntStat2 = 0;
		int cntStat3 = 0;
		int cntStat4 = 0;
		int cntStat5 = 0;
		int cntStat6 = 0;
		int cntStat7 = 0;
		int cntStat8 = 0;
		int cntStat9 = 0;
		int cntStat10 = 0;
		int cntStat11 = 0;
		
		Menu Mn1 = new Menu();
		Submenu Mn2 = new Submenu();
		Fainalize fnl = new Fainalize();

		fnl.finalize();
		while (true) {
			Mn1.Menu();
			System.out.println("Select an option");
			String Select = scn.next();

			if (Select.equals("1")) {

				cntStat1++;
				boolean op = true;

				Mn2.Submenu();
			} else if (Select.equals("2")) {
				cntStat2++;
				boolean addStudent = true;
				while (addStudent) {
					System.out.println("Enter Student Name :");
					String stuInput = scn.next();
					Student Stu = new Student();

					Stu.setStuName(stuInput);
					mySchool.studentList.add(Stu);
					while (true) {
						System.out.println("Student added. Add more students? (y/n)");
						String addStu = scn.next();
						if (addStu.equals("n")) {
							addStudent = false;
							break;

						} else if (addStu.equals("y")) {
							break;
						} else {
							System.out.println("Invalid input. Please enter 'y' or 'n'.");
						}

					}
					for (int i = 0; i < mySchool.studentList.size(); i++) {
						for (int j = 0; j < mySchool.subjectList.size(); j++) {
							Subject sbj = new Subject();
							sbj.name = mySchool.subjectList.get(j);
							mySchool.studentList.get(i).studentSubjectList.add(sbj);
						}
					}
				}

			} else if (Select.equals("3")) {
				cntStat3++;
				while (true) {
					for (int i = 0; i < mySchool.studentList.size(); i++) {
						System.out.println("[" + (i + 1) + "] " + mySchool.studentList.get(i).stuName);
					}
					System.out.println("Select Student no:");
					int stuNo = scn.nextInt();
					for (int i = 0; i < mySchool.subjectList.size(); i++) {
						System.out.println("[" + (i + 1) + "] " + mySchool.subjectList.get(i));
					}
					System.out.println("Select Subject no :");
					int subjNo = scn.nextInt();
					System.out.println("Insert Mark");
					int markInput = scn.nextInt();
					mySchool.studentList.get((stuNo - 1)).studentSubjectList
							.get((subjNo - 1)).studentMark.mark = markInput;
					System.out.println("Do you want to add more :");
					String answer = scn.next();
					if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {

					} else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
						break;
					} else {
						System.out.println("Invalid input");
						break;
					}

				}

			} else if (Select.equals("4")) {
				cntStat4++;
				if (mySchool.studentList.isEmpty()) {
					System.out.println("Add Student!");
				} else if (mySchool.subjectList.isEmpty()) {
					System.out.println("Add Subject");
				} else {
					System.out.printf("%20s %20s %20s %20s %20s\n", "School Name", "Student Name", "Student Email",
							"Subject Name", "Mark");
					System.out.println(
							"__________________________________________________________________________________________________________________");
					for (int i = 0; i < mySchool.studentList.size(); i++) {
						for (int j = 0; j < mySchool.subjectList.size(); j++) {
							System.out.printf("%20s %20s %20s %20s %20s\n", mySchool.name,
									mySchool.studentList.get(i).stuName, mySchool.studentList.get(i).mailList,
									mySchool.subjectList.get(j),
									mySchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark);
						}
					}
				}

			} else if (Select.equals("5")) {
				cntStat5++;
				int x = 0;
				boolean loop = true;
				while (loop) {
					System.out.println("Enrer Name: ");
					String searchIn = scn.next();
					for (int i = 0; i < mySchool.studentList.size(); i++) {
						if (mySchool.studentList.get(i).stuName.equalsIgnoreCase(searchIn)) {
							System.out.println("School Name: " + mySchool.name);
							System.out.println("Student Name:" + mySchool.studentList.get(i).stuName);
							for (int j = 0; j < mySchool.subjectList.size(); j++) {
								System.out.println(mySchool.subjectList.get(j) + " mark is: "
										+ mySchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark);
							}
							x = x + 1;
						}
					}
					if (x == 0) {
						System.out.println("NOT FOUND!!!");
					}
					break;
				}

			} else if (Select.equals("6")) {
				cntStat6++;
				System.out.println("[1] Setup School Details: " + cntStat1);
				System.out.println("[2] Enter Student Name :" + cntStat2);
				System.out.println("[3] Enter Grades: " + cntStat3);
				System.out.println("[4] Print All / Transcript: " + cntStat4);
				System.out.println("[5] Search Students: " + cntStat5);
				System.out.println("[6] App Statistics: " + cntStat6);
				System.out.println("[7]  Enter Email " + cntStat7);
				System.out.println("[8] Save" + cntStat8);
				System.out.println("[9] Save at Folder " + cntStat9);
	            System.err.println("[10] Serialize " + cntStat10);
	            System.out.println("[11] Deserialize " + cntStat11);
	            

			} else if (Select.equals("7")) {
				cntStat7++;
				if (mySchool.studentList.size() == 0) {
					System.out.println("No Student Found!!!!!");

				} else {
					for (int i = 0; i < mySchool.studentList.size(); i++) {
						System.out.println("[" + (i + 1) + "] " + mySchool.studentList.get(i).stuName);
					}
					System.out.println("Enter Student Number: ");
					String stuNoEntry = scn.next();
					try {
						Integer stuNo = Integer.parseInt(stuNoEntry);
						if (stuNo > mySchool.studentList.size() || stuNo < 1) {
							System.out.println("Invalid Input ");
						} else {
							System.out.println("Enter Email: ");
							String eMail = scn.next();
							mySchool.studentList.get(stuNo - 1).mailList.add(eMail);
						}

					} catch (Exception e) {
						System.out.println("Enter Valid Input!");
					}

				}

			} else if (Select.equals("8")) {
				cntStat8++;
				Saver.saveData();
				
			}else if (Select.equals("9")) {
				cntStat9++;
				Folder.saveDataFolder();
			}
			else if (Select.equals("10")) {
				cntStat10++;
				
				Serialize.serialize();
				
			} else if (Select.equals("11")) {
				cntStat11++;
				
				Deserialize.deserialize();
				
			} 
			
			else if (Select.equals("12")) {
				System.out.println("Chao <3");
				break;

			}
			
			else {
				System.out.println("Invalid Input");
			}

		}
	}
}
