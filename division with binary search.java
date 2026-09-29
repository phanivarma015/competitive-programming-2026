import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int low=0;
        int high=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if((mid*k)==n)
            {
                System.out.print(mid);
                break;
            }
            else if((mid*k)>high)
            {
                high=mid-1;
            }
            else if((mid*k)<=high)
            {
                low=mid+1;
            }
        }
    }
}
