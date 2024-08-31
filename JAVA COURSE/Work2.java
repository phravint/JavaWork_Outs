//7.41.20
class A
{
    public void display()
    {
        System.out.println("DISPLAYING ...");
    }
    public void show()
    {
        System.out.println("SHOWING ...");
    }
}
class B extends A
{
//     public void display()
//     {
//         System.out.println("DISPLAYING B...");
//     }
}
public class Work2
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        obj.display();
    }
}