import java.util.Scanner;
class Employee {
    int
    void display() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Employee Detailes");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Employee ID   : " + employeeId);
    }
+ employeeName);
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
