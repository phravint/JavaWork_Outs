// Linear search

// class Work13
// {
//     public static void main(String[] args)
//     {
//         int array [] ={1,3,5,7,9,11,13};
//         int target = 1;
//         int result = LinearSearch(array,target);
//         if(result==-1)
//         {
//             System.out.println("Element is not found");
//         }
//         else
//         {
//             System.out.println("Element is found at the index " + result);
//         }
//     }
//     public static int LinearSearch(int array[] , int target)
//         {
//         for(int indx=0;indx<array.length;indx++)
//         {
//             if(target==array[indx])
//             {
//                 return indx;
//             }
//         }
//         return -1;
//         }
// }


// -------------------------------------------------------------------------------------------------------------------------------------------


// BinarySearch

// class Work13
// {
//     public static void main(String[] args)
//     {
//         int array [] ={1,3,5,7,9,11,13};
//         int target = 5;
//         int result = BinarySearch(array,target,0,array.length-1);
//         if(result==-1)
//         {
//             System.out.println("Element is not found");
//         }
//         else
//         {
//             System.out.println("Element is found at the index " + result);
//         }
//     }

//     public static int BinarySearch(int array [],int target,int left,int right)
//     {
//         while(left <= right)
//         {
//          int midpoint = (left+right)/2;

//         if(array[midpoint]==target)
//         {
//             return midpoint;
//         }
//         else if(target<array[midpoint])
//         {
//             right = midpoint-1;
//         }
//         else{
//             left = midpoint+1;
//         }
//         }
//         return -1;
//     }
// }


// -------------------------------------------------------------------------------------------------------------------------------------------

// Bubblesort

// class Work13
// {
//     public static void main (String[] args)
//     {
//         int array [] = {11,13,9,5,1,15};
//         int temp;
//         for(int indx = 0;indx<array.length;indx++)
//         {
//             for(int indx1 = 0;indx1<array.length-1;indx1++)
//             {
//                 if(array[indx1] > array[indx1 + 1])
//                 {
//                     temp=array[indx1];
//                     array[indx1]=array[indx1+1];
//                     array[indx1+1]=temp;
//                 }
//             }
//         }

//         for(int indx : array)
//         {
//             System.out.print(indx +" ");
//         }
//     }
// }


// -------------------------------------------------------------------------------------------------------------------------------------------
// SELECTION SORT


// class Work13
// {
//     public static void main(String[] args)
//     {
//         int array [] = {7,11,1,13,5,3};
//         int size = array.length;
//         for(int i=0;i<size;i++)
//         {
//             int minIndex=i;
//             for(int j=i+1;j<size;j++)
//             {
//                 if(array[minIndex]>array[j])
//                 {
//                     minIndex=j;
//                 }
//             }
//             int temp = array[minIndex];
//             array[minIndex]=array[i];
//             array[i]=temp;
//             //  for( int indx : array)
//             // {
//             //      System.out.print(indx + " ");
//             // }
//             //  System.out.println();

//         } 
    
//     for( int indx : array)
//     {
//         System.out.print(indx + " ");
//     }
//     }
// }

// -------------------------------------------------------------------------------------------------------------------------------------------

// Insertion Sort

// class Work13
// {
//     public static void main(String[] args)
//     {
//         int array[]={7,4,5,6,3,1,2};

//         for(int i=1;i<array.length;i++)
//         {
//             int key = array[i];
//             int j = i-1;

//             while(j>=0 && array[j]>key )
//             {
//                 array[j+1]=array[j];
//                 j--;
//             }
//             array[j+1]=key;
//         }

//         for(int i : array)
//         {
//             System.out.print(i + " ");
//         }
//     }
// }


// -------------------------------------------------------------------------------------------------------------------------------------------

// Quick Sort

// import java.util.*;
// class Work14
// {
//     public static void Quicksort(int []array,int low,int high)
//     {
//         if(low<high)
//         {
//         int pi=partiton(array,low,high);

//         Quicksort(array,low,pi-1);
//         Quicksort(array,pi+1,high);
//         }             
//     }
//     public static int partiton(int []array,int low,int high)
//     {
        
//         int pivot=array[high];
//         int i=low-1;

//         for(int j=low;j<high;j++)
//         {
//             if(array[j]<pivot)
//             {
//                 i++;
//                 int temp=array[i];
//                 array[i]=array[j];
//                 array[j]=temp;
//             }
//             int temp = array[i+1];
//             array[i+1]=array[high];
//             array[high] = temp;
//         }

//         return i+1;
//     }


//     public static void main(String[] args)
//     {
//         int array [] = {5,2,1,3,4};
//         Quicksort(array,0,array.length-1);

//         for(int i:array)
//         {
//             System.out.print(i+" ");
//         }
//     }
// }


// -----------------------------------------------------------------------------------------------------------------------------------------------------------

// MERGE SORT


// class Work15
// {

//     public static void mergesort(int [] arr,int l,int r)
//     {
//         if(l<r)
//         {
//             int mid=(l+r)/2;
//             mergesort(arr,l,mid);
//             mergesort(arr,mid+1,r);
//             merge(arr,l,mid,r);
//         }
//     }

//     public static void merge(int []arr,int l,int mid,int r)
//     {
//         int n1 = mid - l + 1;
//         int n2 = r - mid;

//         int larr [] = new int [n1];
//         int rarr [] = new int [n2];

//         for(int indx=0;indx<n1;indx++)
//         {
//             larr[indx]=arr[l+indx];
//         }

//         for(int indx=0;indx<n2;indx++)
//         {
//             rarr[indx]=arr[mid+1+indx];
//         }

//         int i = 0;
//         int j = 0;
//         int k=l;

//         while(i<n1 && j<n2)
//         {
//             if(larr[i] <= rarr[j])
//             {
//                 arr[k]=larr[i];
//                 i++;
//             }
//             else
//             {
//                 arr[k]=rarr[j];
//                 j++;
//             }

//             k++;
//         }

//         while(i < n1)
//         {
//             arr[k]=larr[i];
//             i++;
//             k++;
//         }

//         while(j < n2)
//         {
//             arr[k]=rarr[j];
//             j++;
//             k++;
//         }

//     }

//     public static void main(String [] args)
//     {
//         int arr []={4,5,6,1,2,3};

//         mergesort(arr,0,arr.length-1);

//         for( int i : arr)
//         {
//             System.out.print(i + " ");
//         }
//     }
// }