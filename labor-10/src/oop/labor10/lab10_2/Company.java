package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company{
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee newEmployee){
        if (!employees.contains(newEmployee)){
            employees.add(newEmployee);
        }
    }

    public void hireAll(String fileName){
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                double salary = Double.parseDouble(items[2].trim());
                int birtYear = Integer.parseInt(items[3].trim());
                int birthMonth = Integer.parseInt(items[4].trim());
                int birthDay = Integer.parseInt(items[5].trim());
                MyDate birtDate = new MyDate(birtYear, birthMonth, birthDay);
                if (items.length == 7){
                    String department = items[6].trim();
                    hire(new Manager(firstName, lastName, salary, birtDate, department));
                } else {
                    hire(new Employee(firstName, lastName, salary, birtDate));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fire(int emplID){

        //vigyázat ez nem index alapján kell történjen, hanem id! - javitva
//        employees.remove(index);
        employees.removeIf(e -> e.getID() == emplID);
    }

    void printAll(PrintStream stream){
        for (Employee e:employees){
            stream.println(e);
        }
    }

    void printManagers(PrintStream stream){
        for (Employee e:employees){
            if (e instanceof Manager){
                stream.println(e);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> employeeComparator){
        employees.sort(employeeComparator);
    }
}
