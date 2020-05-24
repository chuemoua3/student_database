import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args){
        // Student student1 = new Student();
        // student1.enroll();
        // student1.payTuition();
        // System.out.println(student1.toString());

        //Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //create n number of new students
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println("\n" + students[i].showInfo() + "\n");
        }
    }
}