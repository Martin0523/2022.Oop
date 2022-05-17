package labor12_3;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bac bac = new Bac();
//        bac.printStudents();
        System.out.println("Number of students that passed: " + bac.numberOfPasses() + '\n');
        ArrayList<Student> failedStudents = bac.failedStudents();
        System.out.println("Failed students:");
        for (Student s:failedStudents){
            System.out.println(s);
        }
    }
}
