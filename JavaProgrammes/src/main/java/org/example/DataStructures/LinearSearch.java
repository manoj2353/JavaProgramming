package org.example.DataStructures;

public class LinearSearch {

    public static int linearsearch(int[] array,int target){
        for(int i=0; i<array.length; i++){
            if(array[i]==target){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args){

        int[] array = {1,2,4,5,7,8,12,13,32};

        int target = 10;

        int result = linearsearch(array,target);

        if(result == -1){
            System.out.print("Element not found in Array");
        }
        else {
            System.out.println("Element found at location: "+result);
        }


    }
}
