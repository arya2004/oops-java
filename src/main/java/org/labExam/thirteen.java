package org.labExam;

// Abstract class Bank
abstract class Bank {
    // Abstract method getBalance
    public abstract int getBalance();
}

// Subclass BankA
class BankA extends Bank {
    private int balance;

    public BankA() {
        this.balance = 100;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

// Subclass BankB
class BankB extends Bank {
    private int balance;

    public BankB() {
        this.balance = 150;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

// Subclass BankC
class BankC extends Bank {
    private int balance;

    public BankC() {
        this.balance = 200;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

// Main class to test the implementation


public class thirteen {
    public static void main(String[] args) {
        // Creating objects of BankA, BankB, and BankC
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        // Calling the getBalance method and printing the balances
        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}
