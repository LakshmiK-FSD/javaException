import java.util.Scanner;

class Employee {
    String name;
    float basic;

    void get_data() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = scan.nextLine();
        System.out.println("Please enter basic salary");
        basic = scan.nextFloat();
    }
}

class Salary extends Employee {
    float da, hra, gross, net, pf;

    void calculate() {
        da = (50.0f / 100.0f) * basic;
        hra = (10.0f / 100.0f) * basic;
        gross = basic + da + hra;
        pf = (8.33f / 100.0f) * (basic + da);
        net = gross - pf;
    }

    void display() {
        System.out.println("========================================================================================================");
        System.out.println("THE PAY SLIP");
        System.out.println("========================================================================================================");
        System.out.println("The Employee Name     = " + name);
        System.out.println("The Basic Pay         = " + basic);
        System.out.println("The DA is             = " + da);
        System.out.println("The HRA is            = " + hra);
        System.out.println("The Conveyance is     = " + hra); 
        System.out.println("The PF is             = " + pf);
        System.out.println("The Net Salary is     = " + net);
    }
}
public class Payslip {
    public static void main(String args[]) {
        Scanner scane = new Scanner(System.in);
        Salary sa = new Salary();
        for(;;){
        sa.get_data();
        sa.calculate();
        sa.display();
        System.out.println("If You Want To Continue Please Press Enter ");
        String esc= scane.nextLine();
        if (esc.isEmpty()) {
            continue;
        }
        else{
           break; 
        }
    }
    
    }
}
