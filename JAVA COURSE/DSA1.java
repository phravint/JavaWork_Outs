// BUBBLE SORT 
        // it takes time O(n*2)

class DSA1
{
    public static void main(String[] args)
    {
        int array[] = {2,9,7,4,1,6,5,6};
        int len = array.length;
        int temp;

        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-1;j++)
            {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        
        for(int i : array)
        {
            System.out.print(" " + i);
        }
    }
}