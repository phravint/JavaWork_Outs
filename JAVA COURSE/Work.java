class A
{
    A()
    {
        System.out.println("HEY");
    }
    public void display()
    {
        System.out.println("HELLO");
    }
}
public class Work
{
    public static void main(String[] args)
    {
        new A().display();
        /*
        A.display() -> we can use but display should be static 
        */
    }
}