/*
Aim:
Develop a Java application that calculates a person's Body Mass Index (BMI).
The program asks the user for weight in pounds and height in inches,
converts them into kilograms and meters respectively
(1 pound = 0.45359237 kg, 1 inch = 0.0254 meters),
and calculates BMI using the formula:
BMI = weight (kg) / (height (m))^2.
The program also displays the converted values.
*/

import java.util.Scanner;

public class PR04_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter weight in pounds: ");
        double weightPounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = sc.nextDouble();

        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

   
        double bmi = weightKg / (heightMeters * heightMeters);

       
        System.out.printf("Weight in kilograms: %.2f\n", weightKg);
        System.out.printf("Height in meters: %.2f\n", heightMeters);
        System.out.printf("BMI is: %.2f\n", bmi);

        sc.close();
    }
}

/*
Output:
Enter weight in pounds: 150
Enter height in inches: 65
Weight in kilograms: 68.04
Height in meters: 1.65
BMI is: 24.96
*/