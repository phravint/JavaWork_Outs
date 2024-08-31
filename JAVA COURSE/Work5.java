abstract class Computer
{
    abstract void show();
}
class Desktop extends Computer
{
    public void show()
    {
        System.out.println("IN DESKTOP...");
    }  
}
class Laptop extends Computer
{
    public void show()
    {
        System.out.println("IN LAPTOP..");
    }
}
class Developer
{
    public void func(Computer obj)
    {
    
        obj.show();
    }
}

class Work5
{
    public static void main(String[] args)
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer d = new Developer();
        d.func(lap);
        d.func(desk);
    }
}