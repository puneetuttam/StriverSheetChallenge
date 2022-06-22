import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int lo=0,mid=0,hi=arr.length-1;
        while(mid<=hi){
            switch(arr[mid]){
                case 0:
                    int k=arr[mid];
                    arr[mid]=arr[lo];
                    arr[lo]=k;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    k=arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=k;
                    hi--;
                    break;
            }
        }
    }
}
/*

0 1 2 2 1 0
^         ^ 

*/