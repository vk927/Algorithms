package Sorting;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class insertionSort {
    public static void sort(int[] arr){

        /*
        * this is different from bubble n selection sort
        * in insertion sort u will have an sorted array and you will insert an element
        * by comparing the element from the last index and place it order while comparing
        * -- this is what we do in while loop*/


        //loop the unsorted array
        for(int i=0;i<arr.length;i++){  //***** O(N)
            int j=i;
            // take the element and compare it with previous elemnts -- thse prev elements are in sorted array
            // loop till you reach the 1st element and or till you find smallest elemet than our element
            while(j>0 && arr[j]<arr[j-1]) {  // **** O(N)
                swapClass.swap(arr, j, j - 1);
                j--;
            }
        }
    }
}


// so total complexity is O(N*N) --> O(N^2)