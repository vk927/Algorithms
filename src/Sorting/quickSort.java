package Sorting;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */

/* this is a complex yet interesting algorithm
but this is most widely used algo behind all programming languages
 */
public class quickSort {

    public static void sort(int[] arr){
        qsort(arr,0,arr.length-1);
    }

    // we use recursive algorithim here
    public static void qsort(int[] arr,int low,int high){
        if(low<high){
            int pivot = computePivot(arr,low,high);
            qsort(arr,low,pivot-1);
            qsort(arr,pivot+1,high);
        }
    }


    //this is important , computing the pivot
    public static int computePivot(int[] arr,int low,int high){
        //chnage the last element with the some mid element ,
        // we do it beacuse this will make last element not the sorted elemet
        int pi=(low+high)/2;


        swapClass.swap(arr,pi,high);

        //let's create wall , wall is very imp concept and we return wall from this method
        // initially we make wall the 1st element

        int wall=low;

        //now loop from low to high
        for(int i=low;i<high;i++){
            //if i less than high swap "i" element data with "wall" element data and wall++
            //make sure we don't swap high
            if(arr[i]<=arr[high]){
                swapClass.swap(arr,i,wall);
                wall++;
            }
        }

        //after completion of loop
        //swap the wall with high
        swapClass.swap(arr,wall,high);
        return wall;

    }

}
