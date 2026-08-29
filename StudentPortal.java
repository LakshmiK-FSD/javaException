import java.util.Scanner;
public class StudentPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        // Simple conditional logic
        String status = (gpa >= 3.0) ? "Great job, keep it up!" : "Don’t worry, you can improve!";

        System.out.println("\n--- Student Summary ---");
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Status: " + status);
    }
}
