package oop.labor05.models;

import oop.labor02.date.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student){
        for (Student s:enrolledStudents){
            if (s.getID().equals(student.getID())){
                return false;
            }
        }
        enrolledStudents.add(student);
        return true;
    }

    public Student findStudentById(String ID){
        for (Student s:enrolledStudents){
            if (s.getID().equals(ID)){
                return s;
            }
        }
        return null;
    }

    public Course getCourse() {
        return course;
    }

    public int numEnrolled(){
        return enrolledStudents.size();
    }

    public void printToFile(){
        String dateStart = startDate.getYear() + "." + startDate.getMonth() + "." + startDate.getDay();
        String dateEnd = endDate.getYear() + "." + endDate.getMonth() + "." + endDate.getDay();
        String fileName = String.format("%s_%s_%s", course.getName(), dateStart, dateEnd);
        try(PrintStream output = new PrintStream(fileName)){
            for (Student s:enrolledStudents){
                output.println(s);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Training{" +
                "\n\tcourse=" + course +
                "\n\tstartDate=" + startDate +
                "\n\tendDate=" + endDate);
        for (Student student:enrolledStudents){
            result.append("\n\t\t" + student);
        }
        result.append("\n}\n");
        return result.toString();
    }

    public void unEnroll(String ID){
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getID().equals(ID)){
                enrolledStudents.remove(i);
                return;
            }
        }
    }
}
