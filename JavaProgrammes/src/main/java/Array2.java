import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// calculating the sum of subArrays in an array and finding the number of arrays sum is negative.
public class Array2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int [n];
        int result = 0;
        for (int i = 0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }

        for (int j =0; j<n; j++)
        {
            for (int k =j; k<n; k++)
            {
                int summ = 0;
                for (int l=j; l<=k; l++)
                {
                    summ = summ + a[l];
                }
                if (summ < 0)
                {
                    result = result +1;
                }


            }
        }
        System.out.println(result);
    }

}
