/*
Aim:
Develop a Java program that prompts the user to enter a distance in meters,
converts it into feet (1 meter = 3.28084 feet), and displays the result
formatted to two decimal places.
*/

import java.util.Scanner;

public class PR01_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");

    
        if (sc.hasNextDouble()) {
            double meters = sc.nextDouble();

        
            if (meters <= 0) {
                System.out.println("Invalid input! Distance must be greater than 0.");
            } else {
                double feet = meters * 3.28084;
                System.out.printf("Distance in feet: %.2f\n", feet);
            }

        } else {
            System.out.println("Invalid input! Please enter a numeric value only.");
        }

        sc.close();
    }
}
/*
Output:

1
Enter distance in meters: 100
Distance in feet: 32.81

2
Enter distance in meters: -5
Invalid input! Distance must be greater than 0.

3
Enter distance in meters: abc
Invalid input! Please enter a numeric value only.
*/