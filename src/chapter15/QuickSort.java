package chapter15;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){
        int[] myArray = {9,5,2,6,3,1,0};

        quickSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void quickSort(int[] myArray) {
        quickSort(myArray, 0, myArray.length-1);
    }

    private static void quickSort(int[] myArray, int left, int right) {
        if(left >= right)
            return;

        //get pivot
        int pivot = myArray[left];

        //partition
        int index = partition(myArray, pivot, left, right);

        //sort the halves
        quickSort(myArray, left, index-1);
        quickSort(myArray, index, right);
    }

    private static int partition(int[] myArray, int pivot, int left, int right) {
        while(left <= right){
            while(myArray[left]<pivot)
                left++;
            while(myArray[right]>pivot)
                right--;
            if(left<=right){
                swap(myArray, left, right);
                left++; right--;
            }
        }


        return left;
    }

    private static void swap(int[] myArray, int left, int right) {
        int temp = myArray[left];
        myArray[left] = myArray[right];
        myArray[right]=temp;
    }


}
