/* Aim:
   Create a file named students.txt. Write at least three student
   records (roll number, name, marks) into the file. Read the file
   content and display all student records on the console.
   Handle exceptions like IOException properly using try-catch-finally.
*/

import java.io.*;

public class PR27_CodingExercise
{
    public static void main(String[] args)
    {
        FileWriter fw = null;
        BufferedReader br = null;

        try
        {
            fw = new FileWriter("students.txt");

            fw.write("101 Jiya 80\n");
            fw.write("102 Riya 75\n");
            fw.write("103 Sneha 90\n");

            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));

            String line;

            System.out.println("Student Records:");

            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("File error");
        }
        finally
        {
            try
            {
                if(br != null)
                    br.close();
            }
            catch(Exception e)
            {
            }
        }
    }
}

/* Output:

Student Records:
101 Jiya 80
102 Riya 75
103 Sneha 90

*/