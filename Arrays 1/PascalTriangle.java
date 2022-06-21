import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
       ArrayList<ArrayList<Long>> res = new ArrayList<ArrayList<Long>>();
       ArrayList<Long> cur,prev=new ArrayList<>();
        for(int i=0;i<n;i++){
            cur=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i) cur.add(1l);
                else cur.add(prev.get(j)+ prev.get(j-1));
            }
            prev=cur;
            res.add(prev);
        }
        return res;
	}
}
