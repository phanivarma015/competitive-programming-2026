import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (b == 0) 
        {
            return;
        }

        boolean negative = (a < 0) ^ (b < 0);

        a = Math.abs(a);
        b = Math.abs(b);

        if (a < b) {
            System.out.println(0);
            return;
        }

        long low = 0;
        long high = a;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * b <= a) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (negative) {
            ans = -ans;
        }
        System.out.println(ans);
    }
}
