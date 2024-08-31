// OVERLOADING MEANS :
//  METHOD OVERLOAD :
//         METHOD CAN HAVE SAME NAME 
//         BUT DIFFERENT PARAMETER 
//         AND ALSO DIFFERENT RETURN TYPE
// CONSTRUCTOR OVERLOAD :
//          Default,Paramaterised constructor
// 



// LOCAL VARIABLES ARE PART OF STACK
// INSTANCES "      "    "   " HEAP
class E
{
    E() // default constructor
    {
        System.out.println("Hello world");
    }
    E(String a)
    {
        System.out.println(a);
    }
}
class Work4
{
    public static void main(String[] args)
    {
        E e = new E("hello world");
    }  
}
