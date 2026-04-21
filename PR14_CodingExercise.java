/*
AIM:
Define a base class BankAccount with common attributes like accountNumber,
accountHolderName, and balance. Then, define two subclasses: SavingAccount and
FixedDepositAccount, which inherit from BankAccount. Implement basic operations like
openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The SavingAccount
should include a calculateInterest() method specific to savings accounts, and FixedDepositAccount
should have a maturityAmount() method considering fixed deposit terms.
*/

import java.util.Scanner;

class BankAccount {
    String accountNumber, accountHolderName;
    double balance;

    Scanner sc = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter account number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter account holder name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


class SavingAccount extends BankAccount {

    void calculateInterest() {
        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();

        double interest = (balance * rate) / 100;
        System.out.println("Interest = " + interest);
    }
}


class FixedDepositAccount extends BankAccount {

    void maturityAmount() {
        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (years): ");
        int years = sc.nextInt();

        double maturity = balance + (balance * rate * years) / 100;
        System.out.println("Maturity Amount = " + maturity);
    }
}


public class PR14_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Saving Account");
        System.out.println("2. Fixed Deposit Account");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            SavingAccount s = new SavingAccount();
            sc.nextLine(); 

            s.openAccount();

            System.out.print("Enter deposit amount: ");
            s.deposit(sc.nextDouble());

            System.out.print("Enter withdraw amount: ");
            s.withdraw(sc.nextDouble());

            s.checkBalance();
            s.calculateInterest();

        } else if (choice == 2) {

            FixedDepositAccount f = new FixedDepositAccount();
            sc.nextLine(); 

            f.openAccount();

            f.checkBalance();
            f.maturityAmount();

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

/*
OUTPUT:

Case 1: Saving Account
----------------------
1. Saving Account
2. Fixed Deposit Account
Enter your choice: 1

Enter account number: 101
Enter account holder name: Ravi
Enter initial balance: 5000
Enter deposit amount: 2000
Amount deposited successfully
Enter withdraw amount: 1000
Withdrawal successful
Current Balance: 6000
Enter interest rate: 5
Interest = 300.0


Case 2: Fixed Deposit Account
-----------------------------
1. Saving Account
2. Fixed Deposit Account
Enter your choice: 2

Enter account number: 202
Enter account holder name: Amit
Enter initial balance: 10000
Current Balance: 10000.0
Enter interest rate: 7
Enter time (years): 3
Maturity Amount = 12100.0
*/