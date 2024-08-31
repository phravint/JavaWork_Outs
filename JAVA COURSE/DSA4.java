// QUICK SORT
class DSA4
{
    private static int  partition(int [] array,int low,int high)
{
    int pivot = array[high];
    int i = low-1;
    for(int j=low;j<high;j++)
    {
        if(array[j] < pivot)
        {
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp; 
        }
    }
    int temp    = array[i+1];
    array[i+1]  = array[high];
    array[high] = temp;
    
    return i+1;
        
}
public static void  quickSort(int []array,int low,int high)
{
    if(low < high)
    {
    int  pi = partition(array,low,high);
    quickSort(array,low,pi-1);
    quickSort(array,pi+1,high);
    }
}

    public static void main(String[] args)
    {
        int array [] = {6,2,4,5,3,1};
        int len= array.length - 1;
        quickSort(array, 0 ,len);

        for(int nums : array)
        {
            System.out.print(nums + " ");
        }

    }
}