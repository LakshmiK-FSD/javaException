interface A
{
    int age = 44;
    String area = "Mumbai";

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{
    // inherits run() from X
}

class B implements A, Y
{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }

    public void run()
    {
        System.out.println("in run");
    }
}

public class Interface
{
    public static void main(String[] args)
    {
        // Object of B
        B obj = new B();

        obj.show();
        obj.config();
        obj.run();

        // Accessing interface variables
        System.out.println("Age : " + A.age);
        System.out.println("Area : " + A.area);
    }
}