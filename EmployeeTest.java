import java.util.Scanner;
class Employee {
    int employeeId;
    String employeeName;
    static String companyName = "FITA Academy";

    Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    void display() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Employee Detailes");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Employee ID   : " + employeeId);
    }

    void secondDisplay() {
        System.out.println("Company Name  : " + companyName);
        System.out.println("Employee Name : " + employeeName);
    }
}

// Child class
class SubClass extends Employee {
    SubClass(int employeeId, String employeeName) {
        super(employeeId);     
        this.employeeName = employeeName;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
       
        System.out.println("enter the ID");
        int id=SC.nextInt();
        SC.nextLine();
        System.out.println("enter the name");
        String name=SC.nextLine();
        SubClass p = new SubClass( id, name); 
        p.display();
        p.secondDisplay();
    }
}
