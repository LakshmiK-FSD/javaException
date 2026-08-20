class Student {
    StringBuilder SD = new StringBuilder("ID: 21EC26 |Name: Lakshmi Kandan L");
    void printingli(){
        System.out.println("------------------------------------------------------------------------------------------------");
    }
    void projectName(){
        System.out.println("\n============================== STUDENT MANAGEMENT SYSTEM =======================================\n");
    }
    void printing(){
        System.out.println("1) Initial Student Record: " + SD);
        printingli();
    }
}
class Manage extends Student {
    void appending(){
        SD.append("|CGPA : 8.5 ");
        System.out.println("2) Student Details with CGPA: " + SD);
        printingli();
    }
    void inserting(){
        SD.insert(46, "|Department :ECE ###");
        System.out.println("3) Details with Department: " + SD);
        printingli();
    }
    void replacing(){
        SD.replace(42, 46, "9.0 ");
        System.out.println("4) Changed CGPA : " + SD);
        printingli();
    }
    void deleting(){
        SD.delete(63, 66);
        System.out.println("5) Deleted ### : " + SD);
        printingli();
    }
    void reversing(){
        SD.reverse();
        System.out.println("6) For Fun (Reversed) :" + SD);
        printingli();
        SD.reverse();
        System.out.println("7) Final Detail of Student :" + SD);
        printingli();
    }
}
public class Student_management_system {
   public static void main(String[] args) {
        Manage m = new Manage();
        m.projectName();
        m.printing();
        m.appending();
        m.inserting();
        m.replacing();
        m.deleting();
        m.reversing();
   }
}
