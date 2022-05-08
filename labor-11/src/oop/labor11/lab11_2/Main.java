package oop.labor11.lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("labor-11/src/oop/labor11/lab11_2/students.csv"))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String[] items = line.split(",");
                System.out.println("Input line: " + line);
                try {
                    String neptunId = items[0].trim();
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    int credits = Integer.parseInt(items[3].trim());
                    int birthYear = Integer.parseInt(items[4].trim());
                    int birthMonth = Integer.parseInt(items[5].trim());
                    int birthDay = Integer.parseInt(items[6].trim());
                    Student student = new Student(neptunId, firstName, lastName, credits, birthYear, birthMonth, birthDay);
                    students.add(student);
                }
                catch (IndexOutOfBoundsException ex){
                    System.out.println("INCOMPLETE LINE: " + line + '\n');
                }
                catch (NumberFormatException ex){
                    System.out.println("NUMBER FORMAT EXCEPTION: " + line + '\n');
                }
                catch (InvalidDateException ex){
                    System.out.println("INVALID DATE: " + line + '\n');
                }
                catch (Exception ex){
                    System.out.println("Something went wrong\n");
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    for (Student s:students){
        System.out.println(s);
    }
    }

}
