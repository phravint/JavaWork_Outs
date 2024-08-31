import java.util.Scanner;
class Grade
{
    public void grade(int a)
    {
        if(10>=a && a>=9)
        {
            System.out.println("EXCELLENT");
        }
        else if (8>a  && a>9)
        {
            System.out.println("Satistactory");
        }
        else{
            System.out.println("not satifactory");
        }
    }
}
public class Rough
{
    public static void main(String[] args)
    {
        String name;
        int roll_no;
        int cgpa;
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        Grade g1=new Grade();
        for(int i=0;i<n;i++)
        {
            name=input.next();
            roll_no=input.nextInt();
            cgpa=input.nextInt();
            System.out.println(name);
            System.out.println(roll_no);
            g1.grade(cgpa);
        }
    }
}