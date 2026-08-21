import java.util.Scanner;
interface Book {
    public abstract void addBook();
    public abstract void showBook();
    public abstract void searchBook();
}
interface Members {
    
    //also define like this
     void addMembers();
     void displayMembers();
}
interface IssueBook extends Members {
     void issueBook();
     void returnBook();
}
class Librarys implements Book, IssueBook {
    Scanner sc = new Scanner(System.in);
    //declare class variables for use in all methods
    String bkName,nameMem;
    int idBook,idMem;
    // public key wor important for define interface methods
    public void addBook() {
        System.out.println("Enter Book Name:");
        bkName = sc.nextLine();
        System.out.println("Enter Book ID:");
        idBook = sc.nextInt();
        sc.nextLine(); 
    }
    void ud(){
        System.out.println("---------------------------------------------------------------------------------------");
    }
    public void showBook() {
        ud();
        System.out.println("The Book Name: " + bkName);
        System.out.println("Book ID: " + idBook);
        ud();
    }

    public void searchBook() {
        System.out.println("Enter Book Name for search:");
        String srbkName = sc.nextLine();
        System.out.println("Enter Book ID for search:");
        
        int sridBook = sc.nextInt();
        sc.nextLine();
        ud(); 
        if (srbkName.equals(bkName) || sridBook == idBook) {
            System.out.println("The Book is Available");
        } else {
            System.out.println("The Book is Not Available");
        }
        ud();
    }

    public void addMembers() {
        System.out.println("Enter Student Name:");
        nameMem = sc.nextLine();
        System.out.println("Enter Student ID:");
        
        idMem = sc.nextInt();
        sc.nextLine();
    }

    public void displayMembers() {
        ud();
        System.out.println("The Student Name: " + nameMem);
        System.out.println("The Student ID: " + idMem);
        ud();
    }

    public void issueBook() {
        System.out.println("Enter Student Name:");
        
        String issNameMem = sc.nextLine();
        System.out.println("The Book was Issued for " + issNameMem);
        ud();
    }

    public void returnBook() {
        System.out.println("Enter Book ID for Return:");
        
        int reBookId = sc.nextInt();
        sc.nextLine();
        System.out.println("Book ID " + reBookId + " was Returned");
        ud();
    }
}

public class InterfaceAsgin {
    public static void main(String[] args) {
        Librarys obj = new Librarys();
        obj.addBook();
        obj.showBook();
        obj.searchBook();
        obj.addMembers();
        obj.displayMembers();
        obj.issueBook();
        obj.returnBook();
    }
}
