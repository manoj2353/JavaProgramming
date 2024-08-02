package org.example.DataStructures;

import java.util.Scanner;

public class heapSort {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
             for(int i=0; i<n; i++)
             {
                 a[i]=scn.nextInt();
             }
             scn.close();
             for(int i=0; i<n; i++)
             {
                 System.out.println(a[i]);
             }
    }
}
