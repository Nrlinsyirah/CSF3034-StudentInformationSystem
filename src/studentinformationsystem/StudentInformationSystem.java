
package studentinformationsystem;

import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
       
        String studentName = "Nurul";
        String studentID = "S86514";
        
        System.out.println("===== STUDENT INFORMATION =====");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("---------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mark 1: ");
        int mark1 = scanner.nextInt();
        System.out.print("Enter Mark 2: ");
        int mark2 = scanner.nextInt();

        int totalMark = mark1 + mark2;
        
        System.out.println("---------------------------------");
        System.out.println("Total Mark   : " + totalMark);
        
        String performanceMessage;
        if (totalMark >= 100) {
            performanceMessage = "Excellent";
        } else if (totalMark >= 50) {
            performanceMessage = "Good";
        } else {
            performanceMessage = "Needs Improvement";
        }
        System.out.println("Performance  : " + performanceMessage);
        System.out.println("=================================");
        
        scanner.close();
        
    }
}
