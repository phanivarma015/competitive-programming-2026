import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++)
            a[i]=sc.nextInt();
            
        int n = sc.nextInt();
        int b[] = new int[n];
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
            
        int c[]=new int[m+n];
        int i=0;
        int j=0;  
        int k=0; 
        while(i<m && j<n)
        {
                if(a[i]<=b[j])
                {
                    c[k++]=a[i++];
                }
                else
                {
                    c[k++]=b[j++];
                }
        }
        while(i<m)
        {
            c[k++]=a[i++];
        }
        while(j<n)
        {
            c[k++]=b[j++];
        }
        for(i=0;i<m+n;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
