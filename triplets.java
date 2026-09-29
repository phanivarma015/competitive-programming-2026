import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < n - 2; i++) 
        {
            for (int j = i + 1; j < n - 1; j++) 
            {
                for (int k = j + 1; k < n; k++) 
                {
                    if (arr[i] + arr[j] + arr[k] == x) 
                    {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No Triplet Found");
        }
    }
}
