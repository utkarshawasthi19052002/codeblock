//approach 1
import java.util.*;
public class Gfg {
    
    public static void move(int[] arr)
    {
        Arrays.sort(arr);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        move(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}

//Approach 2  partition process of quicksort. 
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int arr[]={-1, 2, -3, 4, 5, 6, -7, 8, 9 };
	    int n=arr.length;
	    rearrange(arr,n);
	    printArray(arr,n);

	}
	static void printArray(int arr[],int n)
	{
	    for(int i=0;i<n;i++)
	       System.out.print(arr[i]+" ");
	}
	static void rearrange(int arr[],int n)
	{
	    int j=0,temp;
	    for (int i=0;i<n ;i++ )
	    {
	        if(arr[i]<0){
	            if(i!=j){
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	            j++;
	        }
	    }
	}
}
