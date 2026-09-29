import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int max=0;
                    
        for(int i=0;i<(1<<n);i++)
        {
            String sub="";
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                    sub+=s.charAt(j);
            }
            int l=0,r=sub.length()-1;
            boolean p=true;
            while(l<r)
            {
                if(sub.charAt(l)!=sub.charAt(r))
                {
                    p=false;
                	break;                    
                }
                l++;
                r--;
            }
            if(p)
                max=Math.max(max,sub.length());
        }
    System.out.println(max);
    }
}
