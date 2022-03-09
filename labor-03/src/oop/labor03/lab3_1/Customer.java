package oop.labor03.lab3_1;

public class Customer {
    private final String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void closeAccount(){
        this.account = null;
    }

    @Override
    public String toString(){
        if (this.account == null){
            return "Account does not exist!";
        }
        return this.firstName + " " + this.lastName + "\n\t" + this.account;
    }
}
