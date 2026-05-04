package pl.pp;

public class myEighthApp {
    public static void main(String[] args) {
        // Initialize the account with PLN 1000.0
        Account myAccount = new Account("TR123456789", 1000.0, "Muhammet Emir Cakmak", "cakmamu6335_aehit@students.vizja.pl", "+48123456789");

        // Example operations exactly as in the instructions
        myAccount.withdraw(900.0);
        myAccount.credit(250.0);
        myAccount.withdraw(50.0);
        
        // Try to withdraw an amount greater than the balance to show the insufficient funds message
        myAccount.withdraw(400.0);
    }
}
