package Sorting;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class selectionSort {

    /* selection sort is revere of bubble sort
    * bubble sort we will make highest element to go to last index, so after each loop the last index will be sorted
    * for selection sort we will make the smallest element to come to the ist index and we dont condider it for next operation*/
    public static void sort(int[] arr){

        // looping thriugh all the elements
        for(int i=0;i<arr.length-1;i++){  // *********  O(N)
            int index=i;
            //created an index because we sort smallest element to that index
            // so the index will be incremente after every loop
            // now we will sort from index+1 to the end
            for(int j=i+1;j<arr.length;j++){  // ************ O(N)
                // if the index > any element ,
                // then we need to swap that element with index as that element is smaller than index element
                if(arr[index]>arr[j])
                    index=j;
            }

            //after looping and getting the smallest element at index no we will check if index ==i
            //if not swap index,i
            if(index!=i)
                swapClass.swap(arr,index,i);
        }
    }

    //total O(N^2)
}
