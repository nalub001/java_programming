package binarySearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        
        binarySearch(arr, 8);
    }

    private static void binarySearch(int[] arr, int p) {
        int lowerBound = 1;
        int upperBound = arr.length;
        binarySearch(arr, p, lowerBound, upperBound);
    }

    private static void binarySearch(int[] arr, int p, int lowerBound, int upperBound) {
        if(upperBound < lowerBound) {
            System.out.println("P not found at location: ");
            return;
        }

        int mid = lowerBound + (upperBound-lowerBound)/2;
        if(p<mid){
            binarySearch(arr, p, lowerBound, mid-1);
        }
        else if(p>mid){
            binarySearch(arr, p, mid+1,upperBound);
        }
        else if(mid == p){
            System.out.println("P is found at location: "+ mid);
        }else{
            System.out.println("P not found at location: ");
            return;
        }
    }
}
