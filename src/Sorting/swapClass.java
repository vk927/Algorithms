package Sorting;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class swapClass {
    public static void swap(int[] arr,int i,int j){
        int k=arr[j];
        arr[j]=arr[i];
        arr[i]=k;
    }
}
