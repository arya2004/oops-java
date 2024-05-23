package org.labExam;

interface Account {
    void setAccountDetails(String accountNumber, double balance);
    void displayAccountDetails();
}

interface Persons {
    void storePersonDetails(String name);
    void dispPersonDetails();
}

class Customer implements Account, Persons {
    private String name;
    private String accountNumber;
    private double balance;
    private final double INTEREST_RATE = 0.03;

    @Override
    public void setAccountDetails(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + calculateInterest());
    }

    @Override
    public void storePersonDetails(String name) {
        this.name = name;
    }

    @Override
    public void dispPersonDetails() {
        System.out.println("Name: " + name);
    }

    private double calculateInterest() {
        return balance * INTEREST_RATE;
    }


}


public class seven {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Setting details
        customer.storePersonDetails("John Doe");
        customer.setAccountDetails("123456789", 1000.00);

        // Displaying details
        customer.dispPersonDetails();
        customer.displayAccountDetails();
    }
}
