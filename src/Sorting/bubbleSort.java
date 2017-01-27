package Sorting;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class bubbleSort {

    public static void sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){ // O(N)
            for(int j=0;j<arr.length-i-1;j++){ //O(N)
                // here initially what we are doing is for every loop we are geeting the highest element
                // placed in the last index and later we don't operate on that array
                //that's why we use j<arr.length-i-1  ->
                // with this we will hit out the last element from the operations and that last index element is ordered
                if(arr[j]>arr[j+1])
                    swapClass.swap(arr,j,j+1);
            }
        }
    }
}


// total worse complexity O(N^2), although the input is sorted , we need to loop through N*N loops -> N^2

