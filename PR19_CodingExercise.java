import student.Student;
import java.util.Scanner;

public class Result extends Student {
    int marks1, marks2, marks3;

    public Result(int r, String n, int m1, int m2, int m3) {
        super(r, n);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        displayStudent();
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll no: ");
        int r = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String n = sc.nextLine();

        System.out.print("Enter marks1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks3: ");
        int m3 = sc.nextInt();

        Result res = new Result(r, n, m1, m2, m3);
        System.out.println("\n--- Marksheet ---");
        res.displayResult();
    }
}
