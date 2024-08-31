// SELECTION SORT
class DSA2
{
    public static void main(String[] args)
    {
        int nums [] = {6,5,2,8,9,4};
        int len=nums.length;
        int temp,min_index;
        for(int i=0;i<len-1;i++)
        {
            min_index=i;
            for(int j=i+1;j<len;j++)
            {
                if(nums[min_index]>nums[j])
                {
                    min_index=j;
                }
            }
            temp=nums[min_index];
            nums[min_index]=nums[i];
            nums[i]=temp;
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
} 