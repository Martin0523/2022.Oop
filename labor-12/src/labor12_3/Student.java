package labor12_3;

import java.util.HashMap;
import java.util.Map;

public class Student implements Comparable<Student>{
    private final int ID;

    private final String firstname;
    private final String lastname;
    private final HashMap<String,Double> marks = new HashMap<>();

    private double average;
    public Student(int ID, String firstname, String lastname) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public double getAverage() {
        return average;
    }

    public HashMap<String, Double> getMarks() {
        return marks;
    }

    public void assignMark(String markType, Double markValue){
        marks.put(markType, markValue);
    }


    public void average(){
        double sum = 0;
        for (String key: marks.keySet()){
            sum += marks.get(key);
        }
        this.average = sum/ marks.size();
    }

    public String getMarkDetails(){
        StringBuilder result = new StringBuilder("");

//        for (String key: marks.keySet()){
//            result.append(key).append(" : ").append(marks.get(key));
//        }

        for (Map.Entry<String, Double> entry : marks.entrySet()){
            result.append(entry.getKey()).append(": ").append(entry.getValue());
            result.append(" ");
        }

//        marks.forEach(
//                (key, val) -> result.append(key).append(" : ").append(val)
//        );
        return result.toString();
    }

    public boolean bacPass(){
        if (average < 6){
            return false;
        }
        for (String key: marks.keySet()){
            if (marks.get(key) < 5){
                return false;
            }
        }
        return true;
    }


    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", marks=" + getMarkDetails() +
                ", average=" + average +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (this.firstname + " " + this.lastname).compareTo(o.firstname + " " + o.lastname);
    }
}
