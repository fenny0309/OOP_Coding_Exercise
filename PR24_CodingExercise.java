/* Aim:
   Write a Java program where Thread T1 prints 1 to 100,
   T2 prints 101 to 200 and T3 prints 201 to 300.
   Initiate execution of all the three threads but ensure
   that numbers should be printed sequentially.
*/

class T1 extends Thread
{
    public void run()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println("Thread T1 : " + i);
        }
    }
}

class T2 extends Thread
{
    public void run()
    {
        for(int i=101; i<=200; i++)
        {
            System.out.println("Thread T2 : " + i);
        }
    }
}

class T3 extends Thread
{
    public void run()
    {
        for(int i=201; i<=300; i++)
        {
            System.out.println("Thread T3 : " + i);
        }
    }
}

public class PR24_CodingExercise {
    public static void main(String args[])
    {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        t1.start();
        try
        {
            t1.join();
        }
        catch(Exception e) {}

        t2.start();
        try
        {
            t2.join();
        }
        catch(Exception e) {}

        t3.start();
        try
        {
            t3.join();
        }
        catch(Exception e) {}
    }
}

/* Output:

Thread T1 : 1
Thread T1 : 2
Thread T1 : 3
...
Thread T1 : 100

Thread T2 : 101
Thread T2 : 102
Thread T2 : 103
...
Thread T2 : 200

Thread T3 : 201
Thread T3 : 202
Thread T3 : 203
...
Thread T3 : 300

*/