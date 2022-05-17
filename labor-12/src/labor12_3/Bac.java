package labor12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bac {

    private final HashMap<Integer, Student> students = new HashMap<>();

    public Bac() {
        readStudents("nevek1.txt");
        assignMarks("magyar", "magyar.txt");
        assignMarks("matek", "matek.txt");
        assignMarks("roman", "roman.txt");
        for (int id: students.keySet()){
            students.get(id).average();
        }
    }

    public void readStudents(String filename){
        try (Scanner scanner = new Scanner(new File("labor-12/src/labor12_3/data/"+filename))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String[] items = line.split(" ");
                Student temp = new Student(Integer.parseInt(items[0].trim()), items[1].trim(), items[2].trim());
                students.put(Integer.parseInt(items[0].trim()), temp);
            }
        }
        catch (FileNotFoundException | NumberFormatException e){
            e.printStackTrace();
        }
    }

    private void assignMarks(String type, String filename){
        try (Scanner scanner = new Scanner(new File("labor-12/src/labor12_3/data/"+filename))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String[] items = line.split(" ");
//                students.get(Integer.parseInt(items[0].trim())).getMarks().put(type, Double.parseDouble(items[1].trim()));
                students.get(Integer.parseInt(items[0].trim())).assignMark(type, Double.parseDouble(items[1].trim()));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void printStudents(){
        for (int id: students.keySet()){
            System.out.println(students.get(id));
        }
    }

    public int numberOfPasses(){
        int nr = 0;
        for (int id: students.keySet()){
           if (students.get(id).bacPass()){
               nr++;
           }
        }
        return nr;
    }

    public ArrayList<Student> failedStudents(){
        ArrayList<Student> failed = new ArrayList<>();
        for (int id: students.keySet()){
            if (!students.get(id).bacPass()){
                failed.add(students.get(id));
            }
        }
        failed.sort(Student::compareTo);
        return failed;
    }
}
