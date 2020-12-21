package chapter17;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        int[] myArray = {2,4,1,2,1,6,7,4,3};

        mergeSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void mergeSort(int[] myArray) {
        if(myArray.length <=1)
            return;

        //get middle of the array
        int middle = myArray.length/2; int rightArraySize = myArray.length - middle;

        //create temp arrays
        int[] leftArray = new int[middle];
        int[] rightArray = new int[rightArraySize];

        //fill temp arrays
        for(int i=0; i<leftArray.length; i++)
            leftArray[i] = myArray[i];
        for(int i=0; i<rightArray.length; i++)
            rightArray[i] = myArray[i+middle];

        //recursive call on half arrays
        mergeSort(leftArray);
        mergeSort(rightArray);

        //merge half arrays
        merge(myArray, leftArray, rightArray, middle, rightArraySize);

    }

    private static void merge(int[] myArray, int[] leftArray, int[] rightArray, int leftSize, int rightSize) {
        int i=0,l=0,r=0;
        while(l<leftSize && r<rightSize){
            if(leftArray[l]<rightArray[r]){
                myArray[i] = leftArray[l];
                i++; l++;
            }else {
                myArray[i]=rightArray[r];
                i++; r++;
            }
        }
        while(l<leftSize){
            myArray[i]=leftArray[l];
            i++; l++;
        }
        while (r<rightSize){
            myArray[i] = rightArray[r];
            i++; r++;
        }
    }

}
