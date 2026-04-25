/* Aim:
   Write a Java program that reads a text file named data.txt. The program should count and display:
   The total number of lines, The total number of words, The total number of characters (excluding
   spaces and newline characters), Use FileReader / BufferedReader for reading the file. Handle
   exceptions like FileNotFoundException and IOException.
*/

import java.io.*;

public class PR28_CodingExercise {
    public static void main(String args[])
    {
        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try
        {
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while((line = br.readLine()) != null)
            {
                lineCount++;

                String words[] = line.trim().split("\\s+");

                if(line.trim().length() != 0)
                {
                    wordCount = wordCount + words.length;
                }

                for(int i = 0; i < line.length(); i++)
                {
                    if(line.charAt(i) != ' ')
                    {
                        charCount++;
                    }
                }
            }

            System.out.println("Total number of lines = " + lineCount);
            System.out.println("Total number of words = " + wordCount);
            System.out.println("Total number of characters (excluding spaces and newlines) = " + charCount);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + e);
        }
        catch(IOException e)
        {
            System.out.println("Input/output error: " + e);
        }
        finally
        {
            try
            {
                if(br != null)
                    br.close();
            }
            catch(IOException e)
            {
                System.out.println("Error closing file: " + e);
            }
        }
    }
}

/* OUTPUT:

(Assume data.txt contains:)

Hello Java
This is OOP Lab
File handling program

---------------------------------

Output:

Total number of lines = 3
Total number of words = 9
Total number of characters (excluding spaces and newlines) = 41

*/