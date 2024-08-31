/* if you don't know the value 
SYNTAX:
       int num[]=new int[];


-------------------------------------------------------------------
ONE DIMESION ARRAY :

public class Array
{
        public static void main(String[] args)
{
        int num[]={10,20,30,40};
        for(int i=0;i<4;i++)
        {
                System.out.println(num[i]);
        }
}
}
--------------------------------------------------------------------


public class Array
{
        public static void main(String[] args)
{
        int num[][]=new int[3][4];
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<4;j++)
           {
                System.out.print(num[i][j] + " ");
           }
            System.out.println();
        }

}
}

import java.util.Scanner;
public class Array
{
        public static void main(String[] args)
{
        System.out.println("ENTER THE NUMBER OF ELEMENT:");
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
                num[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
                System.out.println(num[i]);
        }
} 
}

*/
class Array
{
        public static void main(String[] args)
        {
         int n=6;
         int p[]=new int [n];
         for(int i=0;i<n;i++)
        {
                System.out.println("Hi");
        }        
        }
}