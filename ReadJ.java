import java.util.Scanner;
import java.io.*;
public class ReadJ
{
    public static void main(String[] args) {
        try{
        File files= new File("C:\\Users\\seethalakshmi\\OneDrive\\Desktop\\seetha\\seethare.txt");
        Scanner rej = new Scanner(files);
      while(rej.hasNext())
        {
        System.out.print("\n"+rej.nextLine()+"\n");
      }
    }
      catch(IOException e){
       System.out.println("Unable to open the file");
      }
      finally
      {
        
      }
    }
}