// public class Strings
// {
// public static void main(String[] args)
// {
//     String name = new String("HELLO");
//     System.out.println(name.charAt(0));
// }

// }

// // StringBuffer to string use
//                         // varaiable name.toString();
/*
public class Strings
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("virat");
        sb.append(" kholi ");
        System.out.println(sb);
        // sb.deleteCharAt();
        // System.out.println(sb);
        sb.insert(12,"18");
        System.out.println(sb);
        String str=sb.toString();
        System.out.println(str);
        System.out.println(sb.length());
        
    }
}\




class About
{
    String name;
    String price;

     public void display()
    {
        System.out.println(name+ " "+price);
    }
}
public class Strings
{
    public static void main(String[] args)
    {
        About a1 = new About();
        a1.name="redmi";
        a1.price="19,000";
        a1.display();

    }
}


     Static variable can make that contains the same detais or value
     ex:
        static String n ="java";

        if u call n by any objects and if you prints it gives the values java;
        and
        also we can access by class name.

class Leo
{
    int id;
    String name;
    static
    {
        System.out.println("Staic is created");
    }
    public Leo()
    {
        id=67;
        name="Bloody";
        System.out.println("Constructor is created");
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
public class Strings
{
public static void main(String[] args)
{
    Leo l1=new Leo();
    
}
}
// In the above program class is loaded first and then staic is loaded and last the objects get loaded.
//In the above code if the object is not created it will not show any output.
// 
// Syntax : 
//class.forName("class name");



5.035.16;

class Human
{
    private String name="hello";
    private int age=01;

    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }

}
public class Strings
{
 public static void main(String[] args)
 {
    Human obj = new Human();
    System.out.println(obj.getname()+ " : "+obj.getage());
 }
}
*/
class Human
{
    private String name;
    private int age;
    public void Setname(String a)
    {
        name=a;
    }
    public void Setage(int a)
    {
        age=a;
    }
    public String getName()
    {

        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Strings
{
    public static void main(String[] args)
    {
        Human h1 = new Human();
        h1.Setage(18);
        h1.Setname("Hello");
        System.out.println("Age is : "+" "+h1.getAge()+" " +" Name is :"+h1.getName());

    }
}




