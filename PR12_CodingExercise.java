/*
Aim:
Write a Java program that demonstrates method overloading to calculate the volume of different
3D shapes. Implement overloaded methods named calculateVolume() for a Cube (takes one side
length), a RectangularCube (takes length, width, height), and a Sphere (takes radius).
*/

import java.util.Scanner;

class ShapeVolume {

    
    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

  
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class PR12_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShapeVolume obj = new ShapeVolume();

        System.out.print("Enter one side length of Cube: ");
        double side = sc.nextDouble();

    
        System.out.print("Enter length, width, height of Rectangular Cube: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();

      
        System.out.print("Enter radius of Sphere: ");
        float radius = sc.nextFloat();

       
        System.out.println("\nVolume of Cube: " + obj.calculateVolume(side));
        System.out.println("Volume of Rectangular Cube: " + obj.calculateVolume(length, width, height));
        System.out.println("Volume of Sphere: " + obj.calculateVolume(radius));

        sc.close();
    }
}

/*
Output:
Enter one side length of Cube: 3
Enter length, width, height of Rectangular Cube: 4 5 6
Enter radius of Sphere: 2.5

Volume of Cube: 27.0
Volume of Rectangular Cube: 120.0
Volume of Sphere: 65.44984694978736
*/