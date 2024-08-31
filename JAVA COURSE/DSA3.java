// 1.32.32
// INSERTION SORT 
class DSA3
{
    public static void main(String[] args)
    {
        int array[]={4,1,3,5,2};
        for(int i=1;i<array.length;i++)
        {
            int key=array[i];
            int j=i-1;
            while(j >=0 && array[j]>key)
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
       for(int i=0;i<array.length;i++)
       {
        System.out.print(array[i]+" ");
       }
    }
}