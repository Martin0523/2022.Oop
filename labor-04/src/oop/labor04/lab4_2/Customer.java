package oop.labor04.lab4_2;

import oop.labor04.lab4_2.BankAccount;

import java.util.ArrayList;

public class Customer {

    private final String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
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

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    public void closeAccount(String accountNumber){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)){
                accounts.remove(i);
                return;
            }
        }
    }

    public int getNumAccounts(){
        return accounts.size();
    }

    @Override
    public String toString() {
//        return "Customer{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", accounts=" + accounts +
//                '}';
        return firstName + " " + lastName + " accounts:\n"+
                "\t" + accounts;
    }
}
