import java.util.*;
public class Submenu {
    Menu Mn1 = new Menu();


    public void Submenu() {
        boolean subMenuLoop = true;
        while (subMenuLoop) {
            System.out.println("[1] Setup School Details");
            System.out.println("[2] Enter Subject Name");
            System.out.println("[3] Go Back");
            String choose = Main.scn.next();
            switch (choose) {
                case "1":
                    System.out.println("Enter School name: ");
                    String inputSchool = Main.scn.next();
                    Main.mySchool.name = inputSchool;
                    break;
                case "2":
                    boolean addSubjects = true;
                    while (addSubjects) {
                        System.out.println("Enter Subject name: ");
                        String subjectInput = Main.scn.next();
                        Main.mySchool.subjectList.add(subjectInput);
                        for(int i =0; i < Main.mySchool.studentList.size(); i++){
                            Subject sbj = new Subject();
                            sbj.name = subjectInput;
                            Main.mySchool.studentList.get(i).studentSubjectList.add(sbj);
                        }
                        System.out.println("Subject added. Add more subjects? (y/n)");
                        String addMore = Main.scn.next();
                        if (addMore.equals("n")) {
                            addSubjects = false;
                        }
                    }
                    break;
                case "3":
                    subMenuLoop = false;
                    break;

                    default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
}
