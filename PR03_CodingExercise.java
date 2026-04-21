/*
Aim:
Write a Java program that prompts the user to enter a single character.
The program checks whether the entered character is a vowel or consonant.
If the input is a number, display "It is a number".
If the input is not an alphabet (symbol), display an appropriate message.
*/

import java.util.Scanner;

public class PR03_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = sc.next();

        // Check if only one character is entered
        if (input.length() != 1) {
            System.out.println("Invalid input! Please enter only ONE character.");
        } else {
            char ch = input.charAt(0);

            if (Character.isLetter(ch)) {

                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("The character is a Vowel.");
                } else {
                    System.out.println("The character is a Consonant.");
                }

            } else if (Character.isDigit(ch)) {
                System.out.println("The input is a Number.");
            } else {
                System.out.println("Invalid input! It is a special symbol.");
            }
        }

        sc.close();
    }
}

/*
Output 1:
Enter a single character: A
The character is a Vowel.

Output 2:
Enter a single character: b
The character is a Consonant.

Output 3:
Enter a single character: 5
The input is a Number.

Output 4:
Enter a single character: @
Invalid input! It is a special symbol.

Output 5:
Enter a single character: ab
Invalid input! Please enter only ONE character.
*/