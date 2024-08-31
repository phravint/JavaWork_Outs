//ENUMERATION  -> ENUM
// enum Status
// {
//     Loading,Processing,Completed,Failed;
// }
// class Work6
// {
//     public static void main(String[] args)
//     {
//         Status s = Status.Loading;
//         System.out.println(s.ordinal());

//     }
// }

//8.44.00 
enum Laptop
{
    Hp(100),Dell(101),Lenovo(102),Mackbook(103),Surface;

private int price;

private Laptop()
{
    price=104;
}
private Laptop(int price)
{
    this.price=price;
}
public int Price()
{
    return price;
}
public void set(int price)
{
    this.price=price;
}
}

class Work6
{
    public static void main(String[] args)
    {
        Laptop lap = Laptop.Surface;
        System.out.println(lap + "  :  "+ lap.Price());
        // IN FOR LOOP 
            // for(Laptop.lap :lap.values())
            // {
            //     System.out.println(lap + "  :  "+ lap.Price());
            // }
    }
}


