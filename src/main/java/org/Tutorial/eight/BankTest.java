package org.Tutorial.eight;

abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    @Override
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    @Override
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    @Override
    int getBalance() {
        return 200;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in BankA: $" + bankA.getBalance());
        System.out.println("Balance in BankB: $" + bankB.getBalance());
        System.out.println("Balance in BankC: $" + bankC.getBalance());
    }
}
