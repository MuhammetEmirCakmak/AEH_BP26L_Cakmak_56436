package pl.pp;

public class Account {
    // Private fields
    private String accountNumber;
    private double availableFunds;
    private String ownerName;
    private String email;
    private String phoneNumber;

    // Constructor
    public Account(String accountNumber, double availableFunds, String ownerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.availableFunds = availableFunds;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public double getAvailableFunds() { return availableFunds; }
    public String getOwnerName() { return ownerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    // Setters
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setAvailableFunds(double availableFunds) { this.availableFunds = availableFunds; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Credit account (deposit)
    public void credit(double amount) {
        if (amount > 0) {
            this.availableFunds += amount;
            System.out.println("Deposit of PLN " + amount + " was made. New balance PLN " + this.availableFunds);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > this.availableFunds) {
            System.out.println("Insufficient funds. You have PLN " + this.availableFunds + " in your account.");
        } else if (amount > 0) {
            this.availableFunds -= amount;
            System.out.println("Withdrew PLN " + amount + " from the account, Remaining balance = PLN " + this.availableFunds);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
