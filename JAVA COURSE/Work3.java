// ABSTRACT
//          we cannot create of on=bject of abstract class...

abstract class A //Abstract class
{
   abstract void show(); 
}
class B extends A //Concrete CLASS
{
    public void show() //Method
    {
        System.out.println("Showing..");
    }
    public B() // Constructor 
    {
        System.out.println("Displaying..");
    }
}
class Work3
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }
}

// 8:07:22//