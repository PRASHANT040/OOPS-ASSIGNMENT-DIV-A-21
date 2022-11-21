import java.util.*;

class Student {
    String std_id, std_name, grade;
    double assignment1marks, assignment2marks, project_marks, totalmarks;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        std_id = sc.nextLine();
        System.out.println("Enter Student name:");
        std_name = sc.nextLine();
        System.out.println("Enter marks of Assignment 1:");
        assignment1marks = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter marks of Assignment 2:");
        assignment2marks = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Project marks:");
        project_marks = sc.nextDouble();
        sc.nextLine();
    }

    void cal() {
        totalmarks = assignment1marks + assignment2marks + project_marks;
        if (totalmarks >= 85) {
            grade = "HD";
        } else if (totalmarks >= 75 && totalmarks <85) {
            grade = "D";
        } else if (totalmarks >= 65 && totalmarks <75) {
            grade = "C";
        } else if (totalmarks > 50 && totalmarks <65) {
            grade = "P";
        } else if(totalmarks <50){
            grade = "F";
        }
    }

    void display() {
        System.out.println("Student ID:" + std_id);
        System.out.println("Student Name:" + std_name);
        System.out.println("Marks of Assignment 1:" + assignment1marks);
        System.out.println("Marks of Assignment 2:" + assignment2marks);
        System.out.println("Project Marks:" + project_marks);
        System.out.println("Individual Total Marks:" + totalmarks);
        System.out.println("Grade:" + grade);
    }

    class ASSIGNMENT {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int ch;
            Student[] ss = new Student[11];
            ss[1] = new Student();
            ss[2] = new Student();
            ss[3] = new Student();
            ss[4] = new Student();
            ss[5] = new Student();
            ss[6] = new Student();
            ss[7] = new Student();
            ss[8] = new Student();
            ss[9] = new Student();
            ss[10] = new Student();
            do {
                System.out.println("Menu------>");
                System.out.println("1. Enter Student Record.");
                System.out.println("2. Display all Student Grade.");
                System.out.println("3. Display Statistics.");
                System.out.println("4. Exit Application.");
                System.out.println("Enter Choice:");
                ch = s.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter records of 10 students->");
                        for (int i = 1; i <= 10; i++) {
                            ss[i].accept();
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= 10; i++) {
                            ss[i].cal();
                            System.out.println("Student " + ss[i].std_id + " grade:" + ss[i].grade);
                        }
                        break;
                    case 3:
                        for (int i = 1; i <=10; i++) {
                            ss[i].cal();
                            ss[i].display();
                        }
                        break;
                    case 4:System.out.println("Exit Successful. Thank You!");
                            System.exit(0);
                    default: System.out.println("Invalid Choice! Please Enter Again.");
                        
                }
            }while(ch!=4);
        
        }
    }

}