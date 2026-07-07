import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int p=n/2;
        if(a[p]==a[p+1]||a[p]==a[p-1])
        {
            System.out.println(a[p]);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
