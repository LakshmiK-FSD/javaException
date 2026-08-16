import java.util.*; 
public class Exception {
    public static void main(String args[]){
        void div() throws Exception{
            int a= 10;
            int b=0;
            int c=a/b;

        }

        Exception EX = new Exception();
        try{
            Ex.div();
        }
        catch(Exception e){
         System.out.println(e);
        }

    }
}
