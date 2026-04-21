/*
Aim:
Design a class BankAccount with account_holder_name and balance. Use a static variable
interest_rate (same for all accounts). Include methods to calculate and display the interest earned.
Update interest rate using a static method.
*/

import java.util.Scanner;

class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }
}

public class PR10_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name 1: ");
        String n1 = sc.nextLine();
        System.out.print("Enter Balance 1: ");
        double b1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Name 2: ");
        String n2 = sc.nextLine();
        System.out.print("Enter Balance 2: ");
        double b2 = sc.nextDouble();

        BankAccount acc1 = new BankAccount(n1, b1);
        BankAccount acc2 = new BankAccount(n2, b2);

        System.out.println("\nBefore Updating Interest Rate:");
        acc1.display();
        acc2.display();

        System.out.print("\nEnter New Interest Rate: ");
        double r = sc.nextDouble();
        BankAccount.updateInterestRate(r);

        System.out.println("\nAfter Updating Interest Rate:");
        acc1.display();
        acc2.display();

        sc.close();
    }
}

/*
Output:
Enter Name 1: Kriva
Enter Balance 1: 10000
Enter Name 2: Jiya
Enter Balance 2: 20000

Before Updating Interest Rate:
Name: Kriva
Balance: 10000.0
Interest Earned: 500.0
Name: Jiya
Balance: 20000.0
Interest Earned: 1000.0

Enter New Interest Rate: 7.5

After Updating Interest Rate:
Name: Kriva
Balance: 10000.0
Interest Earned: 750.0
Name: Jiya
Balance: 20000.0
Interest Earned: 1500.0
*/