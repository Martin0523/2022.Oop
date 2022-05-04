package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        /*
        Company company = new Company("Apple");
        company.hire(new Manager("Alpar", "Reszeg", 7000, new MyDate(2001, 8, 4), "Almaszedés"));
        company.hire(new Employee("Alfonz", "Biro", 4000, new MyDate(2000,4,8)));
        company.hire(new Employee("Etele", "Jakab", 4000, new MyDate(2001, 6,22)));
        company.hire(new Employee("Anita", "Matyas", 4000, new MyDate(2001, 3,6)));


//        try (PrintStream stream = new PrintStream("test.txt")){
//            company.printAll(stream);
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        company.printAll(System.out);

//        company.sortByComparator(Comparator.comparing(Employee::getBirthDate));
//        company.sortByComparator((o1, o2) -> o1.getBirthDate().compareTo(o2.getBirthDate()));
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
        });

        System.out.println("\n\nRendezes utan:");
        company.printAll(System.out);

         */

        Company company = new Company("Good name");
        company.hireAll("employees.csv");
        company.printAll(System.out);

        System.out.println("\nAlphabetically: \n");
        company.sortByComparator(Employee::compareTo);
        company.printAll(System.out);

        System.out.println("\nDecreasing salary order: \n");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() < o2.getSalary()){
                    return 1;
                } else if (o1.getSalary() > o2.getSalary()){
                    return -1;
                }
                return 0;
            }
        });
        company.printAll(System.out);

        System.out.println("\nManagers followed by employees, both categories sorted alphabetically:\n");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //próbáld ki a getClass metódust is
                if (o1 instanceof Manager && o2 instanceof Manager){
                    return (o1.getFirstName()+" "+o1.getLastName()).compareTo(o2.getFirstName()+" "+o2.getLastName());
                } else if (o1 instanceof Manager){
                    return -1;
                } else if (o2 instanceof Manager){
                    return 0;
                }
                return (o1.getFirstName()+" "+o1.getLastName()).compareTo(o2.getFirstName()+" "+o2.getLastName());
            }
        });
        company.printAll(System.out);
    }
}
