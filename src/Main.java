import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static School mySchool = new School();

	public static void main(String[] args) throws Throwable {
        Menu Mn1 = new Menu();
        Submenu Mn2 = new Submenu();
        Fainalize fnl = new Fainalize();

        fnl.finalize();
        while (true) {
            Mn1.Menu();
            System.out.println("Select an option");
            int Select = scn.nextInt();
            if (Select == 1) {
                boolean op = true;

                Mn2.Submenu();
            } else if (Select == 2) {

                boolean addStudent = true;
                while (addStudent) {
                    System.out.println("Enter Student Name :");
                    String stuInput = scn.next();
                    Student Stu = new Student();

                    Stu.stuName = stuInput;
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

            }
            else if (Select == 3) {
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
                    mySchool.studentList.get((stuNo - 1)).studentSubjectList.get((subjNo - 1)).studentMark.mark = markInput;
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

            }
            else if (Select == 4) {
            	System.out.printf("%20s %20s %20s %20s\n", "School Name", "Student Name" ,"Subject Name","Mark");
            	System.out.println("________________________________________________________________________________");
            	for (int i = 0; i < mySchool.studentList.size(); i++) {
            		for (int j = 0; j < mySchool.subjectList.size(); j++) {
            			System.out.printf("%20s %20s %20s %20s\n", School.name, mySchool.studentList.get(i).stuName ,mySchool.subjectList.get(j),mySchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark);
            		}
            	}
            	
            }
            else if (Select == 5) {
            	int x = 0;
            	boolean loop = true;
            	while(loop) {
            		System.out.println("Enrer Name: ");
            		String searchIn = scn.next();
            		for (int i = 0; i<mySchool.studentList.size(); i++) {
            			if (mySchool.studentList.get(i).stuName.equalsIgnoreCase(searchIn)) {
            				System.out.println("School Name: " + School.name);
            				System.out.println("Student Name:" + mySchool.studentList.get(i).stuName);
            				for (int j =0; j<mySchool.subjectList.size(); j++) {
            					System.out.println(mySchool.subjectList.get(j) + " mark is: " + mySchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark);
            				}
            				x = x+1;
            			}
            		}
            		if (x==0) {
            			System.out.println("NOT FOUND!!!");
            		}
            		break;
            	}
            	
            	
            }
        }
    }

}
