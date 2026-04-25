/* Aim:
   Write a Java program that uses an ArrayList<Integer> to store marks of students.
   Perform the following operations:
   ● Add at least 5 marks (taken from user)
   ● Display all marks
   ● Find and display highest and lowest marks using Collections.max() and Collections.min()
*/

import java.util.*;

public class PR29_CodingExercise
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();

        System.out.println("Enter 5 student marks:");

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter mark " + (i+1) + ": ");
            int m = sc.nextInt();
            marks.add(m);
        }

        System.out.println("\nAll Student Marks:");
        System.out.println(marks);

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);
    }
}

/* OUTPUT:

Enter 5 student marks:
Enter mark 1: 78
Enter mark 2: 85
Enter mark 3: 92
Enter mark 4: 67
Enter mark 5: 88

All Student Marks:
[78, 85, 92, 67, 88]
Highest Marks = 92
Lowest Marks = 67

*/