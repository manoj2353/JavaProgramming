package org.example.DataStructures;

public class BinarySearch {


    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int mid = (low+high)/2;
            if(array[mid] == target){
                return mid;
            }
            else if (array[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[] array = {1,3,4,5,6,8,9,12,14,15,45};

        int target = 9;

        int result = binarySearch(array,target);

        if(result == -1){
            System.out.println("Element not found in an array");
        }
        else {
            System.out.println("Element found at the index : "+result);
        }

    }

}
