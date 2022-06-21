import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
    {
        // Write your code here.
        int n=permutation.size();
        if(n<=1)
            return permutation;
        int i=n-2;
        while(i>=0 && permutation.get(i)>=permutation.get(i+1)){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(permutation.get(i)>=permutation.get(j)){
                j--;
            }
            Collections.swap(permutation,i,j);
        }
        int low=i+1,hi=n-1;
        while(low<hi){ 
            Collections.swap(permutation,low,hi);
            low++;hi--;
        }
        return permutation;
    }
}
