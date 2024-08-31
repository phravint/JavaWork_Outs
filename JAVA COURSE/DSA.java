class DSA
{
    public static void main(String args[])
    {
        int  array []={1,3,5,7,11,13,17};
        // int len=array.length;
        int target=11;
        int result=LinearSearch(array, target);
        System.out.println(result);
        result=BinarySearch(array, target);
        System.out.println(result);
        
    }

// LINEAR SEARCH.....................

    public static int LinearSearch(int [] array,int target)
    {
        for(int i=0;i<array.length;i++)
        {
            if(target==array[i])
            {
                return i;
            }
        }
        return -1;
    }

// BINARY SEARCH......................

    public static int BinarySearch(int [] array,int target)
    {
        int left=0;
        int right=array.length-1;
        while(left<=right)
        {
            int midpt=(left+right)/2;
            if(target==array[midpt])
            {
                return midpt;
            }
            else if(target>array[midpt])
            {
                left=midpt+1;
            }
            else
            {
                right=midpt-1;
            }
        }
        return -1;
    }
}