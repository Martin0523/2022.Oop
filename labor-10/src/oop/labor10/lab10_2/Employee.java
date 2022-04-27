package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private final int ID;
    private final String fristName;
    private String lastName;
    private double salary;
    private final MyDate birthDate;
    private static int counter = 0;

    public Employee(String fristName, String lastName, double salary, MyDate birthDate) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = ++counter;
    }

    public int getID() {
        return ID;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID;
    }

    @Override
    public int compareTo(Employee o) {
        return (this.fristName + " " + this.lastName).compareTo(o.fristName + " " + o.lastName);
    }
}
