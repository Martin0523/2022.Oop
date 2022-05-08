package oop.labor11.lab11_2;

import oop.labor10.lab10_1.MyDate;
import oop.labor10.lab10_1.DateUtil;

public class Student {

    private final String NeptunId;
    private final String firstname;
    private final String lastname;
    private int credits;
    private final MyDate birthDate;

    public Student(String neptunId, String firstname, String lastname, int credits, int birthYear, int birthMonth, int birthDay) throws InvalidDateException {
        if (!DateUtil.isValidDate(birthYear, birthMonth, birthDay)){
            throw new InvalidDateException("INVALID DATE");
        }
        this.birthDate = new MyDate(birthYear, birthMonth, birthDay);
        this.NeptunId = neptunId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "NeptunId='" + NeptunId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", credits=" + credits +
                ", birthDate=" + birthDate +
                '}';
    }
}
