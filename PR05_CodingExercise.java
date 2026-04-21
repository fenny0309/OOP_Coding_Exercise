/*
Aim:
Write a Java program that takes the lengths of three sides of a triangle as input.
The program checks whether the given sides can form a valid triangle
(sum of any two sides must be greater than the third side).
If valid, it calculates the area using Heron's formula:
Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2.
*/

import java.util.Scanner;

public class PR05_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        
        if (a + b > c && a + c > b && b + c > a) {

           
            double s = (a + b + c) / 2;

           
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("Area of triangle: %.2f", area);

        } else {
            System.out.println("Invalid triangle! The given sides cannot form a triangle.");
        }

        sc.close();
    }
}

/*
Output 1:
Enter three sides of triangle: 3 4 5
Area of triangle: 6.00

Output 2:
Enter three sides of triangle: 5 5 5
Area of triangle: 10.83

Output 3:
Enter three sides of triangle: 1 2 3
Invalid triangle! The given sides cannot form a triangle.
*/