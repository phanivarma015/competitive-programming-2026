import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i>j)
        {
            i=i^j;
            j=i^j;
            i=i^j;
        }
        int max=0;
        for(int k=i;k<=j;k++)
        {
            int c=1;
            int s=k;
            while(s!=1)
            {
                if(s%2==0)
                {
                    s=s/2;
                    c++;
                }
                else
                {
                    s=(3*s)+1;
                    c++;
                }
            }
            if(c>max)
                max=c;
        }
      System.out.println(i+" "+j+" "+max);
    }
}
