import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//calculating the biggestnum of hallowArray
public class Array {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the Array numbers:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        int biggestNum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size()-2; i++)
        {
            for(int j=0; j < arr.size()-2; j++)
            {
                int topsum = arr.get(i).get(j) + arr.get(i).get(j+1)+arr.get(i).get(j+2);
                int midsum = arr.get(i+1).get(j+1);
                int botsum = arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                int sum = topsum + midsum + botsum;
                if(biggestNum < sum)
                {
                    biggestNum = sum;
                }
            }
        }
        System.out.println("Sum of Biggest Num: "+biggestNum);
        System.out.println("Size of an Array: "+ (arr.size()-2));
        bufferedReader.close();
    }

}
