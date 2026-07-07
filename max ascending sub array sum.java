import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int max=0;
        int sum=a[0];
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                sum+=a[i+1];
            }
            else
            {
                 if(max<sum)
                    max=sum;
            }
            max=sum;
        }
        System.out.println(max);    
    }
}
