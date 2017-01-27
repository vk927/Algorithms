package Sorting;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class shellSort {
    public static void sort(int[] arr){

        /* shell sort is similar to insertion sort
        * better than insertion sort -->
        * beacuse here instead of comparing with all previous elemnts here we compare only certain back elements
        * and these certain prev elements are depending upon gap*/

        //create a gap and rest is same as shell sort
        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int j=i;
                while(j>=gap && arr[j]<arr[j-gap]){
                    swapClass.swap(arr,j,j-gap);
                    j=j-gap;
                }
            }
        }
    }
}
