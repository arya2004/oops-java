package org.labExam;

// Class Customer to store personal details
class Customerss {
    private String name;
    private String address;
    private String phoneNumber;

    public Customerss(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// Class Account to store account details
class Accounts {
    private String accountNumber;
    private double balance;

    public Accounts(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Class RBI as the base class
class RBI {
    protected Customerss customer;
    protected Accounts account;

    public RBI(Customerss customer, Accounts account) {
        this.customer = customer;
        this.account = account;
    }

    public double getInterestRate() {
        return 4.0;
    }

    public double getMinimumBalance() {
        return 1000.0;
    }

    public double getWithdrawalLimit() {
        return 10000.0;
    }
}

// Class SBI extending RBI
class SBI extends RBI {
    public SBI(Customerss customer, Accounts account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 5.0; // SBI offers 5% interest rate
    }

    @Override
    public double getWithdrawalLimit() {
        return 20000.0; // SBI offers higher withdrawal limit
    }
}

// Class ICICI extending RBI
class ICICI extends RBI {
    public ICICI(Customerss customer, Accounts account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 4.5; // ICICI offers 4.5% interest rate
    }

    @Override
    public double getWithdrawalLimit() {
        return 15000.0; // ICICI offers moderate withdrawal limit
    }
}

// Class PNB extending RBI
class PNB extends RBI {
    public PNB(Customerss customer, Accounts account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 4.2; // PNB offers 4.2% interest rate
    }

    @Override
    public double getWithdrawalLimit() {
        return 12000.0; // PNB offers a slightly higher withdrawal limit
    }
}


public class eighteen {
    public static void main(String[] args) {
        // Create a customer and account
        Customerss customer = new Customerss("John Doe", "123 Main St", "555-1234");
        Accounts account = new Accounts("ACC123456", 5000.0);

        // Create instances of banks
        RBI sbi = new SBI(customer, account);
        RBI icici = new ICICI(customer, account);
        RBI pnb = new PNB(customer, account);

        // Display interest rates and withdrawal limits
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("SBI Withdrawal Limit: " + sbi.getWithdrawalLimit());

        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
        System.out.println("ICICI Withdrawal Limit: " + icici.getWithdrawalLimit());

        System.out.println("PNB Interest Rate: " + pnb.getInterestRate() + "%");
        System.out.println("PNB Withdrawal Limit: " + pnb.getWithdrawalLimit());
    }
}
