// /*
// To create the object we need create class 1st.
// JVM it creates the objects.


// object --> Class
// method --> Functions 
// */
// import java.util.Scanner;
// class calculator
// {
//     public int add(int a,int b)
//     {
//         return a+b;
//     }
//     public int sub(int a,int b)
//     {
//         return a-b;
//     }
//     public int mul(int a, int b)
//     {
//         return a*b;
//     }
//     public int div(int a, int b)
//     {
//         return a/b;
//     }
// }
// public class Object
// {
//     public static void main(String[] args)
// {
//     Scanner input = new Scanner(System.in);
//     int num1=input.nextInt();
//     int num2=input.nextInt();
//     System.out.printf("ENTER THE OPERATIONS:\n ADD ->1\n SUB->2\n MUL->3\n DIV->4\n");
//     int value=input.nextInt();
//     calculator cal=new calculator();
//     switch(value)
//     {
//         case 1:
//             System.out.println(cal.add(num1,num2));
//             break;
//         case 2:
//             System.out.println(cal.sub(num1,num2));
//             break;
//         case 3:
//             System.out.println(cal.mul(num1,num2));
//             break;
//         case 4:
//             System.out.println(cal.div(num1,num2));
//             break;
//         default:
//             System.out.println("INVALID CHOICE");        
//     }
// }
// }
/*class calculator
{
    int  num=140;

    public int add(int n,int n1)
    {
        return n+n1;
    }
}

public class Object
{
    public static void main(String[] args)
{
    int n=10,m=10;
    calculator cal=new calculator();
    int result = cal.add(n,m);
    System.out.println(result);
    calculator cal1=new calculator();
    cal.num=100;
    System.out.println(cal.num);
    System.out.println(cal1.num);

}}
*/
import java.util.Scanner;
class Choice 
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class Array
{
    public static void main(String[] args)
    {
        int n1=10;
        int n2=10;
        int
        Choice ch=new Choice();
        System.out.println(ch.add(n1,n2,n3));
    }
}

//  THESE ABOVE CONCEPT IS  CALLED AS METHOD OVERLOADING .
//  Heap memory is used to stored the global variables in java.