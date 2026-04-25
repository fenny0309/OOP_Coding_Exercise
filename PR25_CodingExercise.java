/* Aim:
   Write a Java program where two threads print multiplication tables.
   Take table values from user (e.g., Table of 5 and Table of 7).
   Use a synchronized method so that table outputs do not mix and remain consistent.
*/

import java.util.Scanner;

class Table
{
    synchronized void printTable(int n)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        System.out.println();
    }
}

class T1 extends Thread
{
    Table t;
    int n;

    T1(Table t, int n)
    {
        this.t = t;
        this.n = n;
    }

    public void run()
    {
        t.printTable(n);
    }
}

class T2 extends Thread
{
    Table t;
    int n;

    T2(Table t, int n)
    {
        this.t = t;
        this.n = n;
    }

    public void run()
    {
        t.printTable(n);
    }
}

public class PR25_CodingExercise {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first table number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second table number: ");
        int n2 = sc.nextInt();

        Table obj = new Table();

        T1 t1 = new T1(obj, n1);
        T2 t2 = new T2(obj, n2);

        t1.start();
        t2.start();
    }
}

/* Output:

Enter first table number: 5
Enter second table number: 7

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70

*/