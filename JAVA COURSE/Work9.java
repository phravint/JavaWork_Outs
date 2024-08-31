// EXCEPTION
            // ArithmeticException
            // ArrayIndexOutOfBoundsException
            // NullPointerException
            // we declare 
            // catch(Exception e)
            // {

            // }
            // only in the last
// You can create a your own exception by 
// class Myexception extends Exception // or (RuntimeException)
// {
//     public Myexception(String msg)
//     {
//         super(msg);
//     }
// }
class Work9
{
    public static void main(String[] args)
    {
        int i=0;
        int j=10;

        try 
        {
            j=j/i;
            if(j==0)
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            System.out.println("Arithmetic exception  ");
        }
    }
}
// 9.45.00