/* Aim:
   Write a generic method searchElement that accepts a LinkedList<T> and an element T to search.
   Return true if the element exists, otherwise false.

   ● Test with LinkedList<Integer> for roll numbers.
   ● Test with LinkedList<String> for names.
   Take all values from user and display true/false results.
*/

import java.util.*;

public class PR32_CodingExercise
{
    public static <T> boolean searchElement(LinkedList<T> list, T element)
    {
        return list.contains(element);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        
        LinkedList<Integer> rollNumbers = new LinkedList<Integer>();

        System.out.print("Enter number of roll numbers: ");
        int n1 = sc.nextInt();

        System.out.println("Enter roll numbers:");

        for(int i = 0; i < n1; i++)
        {
            rollNumbers.add(sc.nextInt());
        }

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        boolean rollResult = searchElement(rollNumbers, searchRoll);

        System.out.println("\nRoll Numbers List: " + rollNumbers);
        System.out.println("Roll Number Found (true/false): " + rollResult);

        sc.nextLine(); 

   
        LinkedList<String> names = new LinkedList<String>();

        System.out.print("\nEnter number of names: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names:");

        for(int i = 0; i < n2; i++)
        {
            names.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean nameResult = searchElement(names, searchName);

        System.out.println("\nNames List: " + names);
        System.out.println("Name Found (true/false): " + nameResult);
    }
}

/* OUTPUT:

Enter number of roll numbers: 4
Enter roll numbers:
101 102 103 104
Enter roll number to search: 103

Roll Numbers List: [101, 102, 103, 104]
Roll Number Found (true/false): true

Enter number of names: 4
Enter names:
Rahul
Amit
Priya
Neha
Enter name to search: John

Names List: [Rahul, Amit, Priya, Neha]
 Name Found (true/false): false */