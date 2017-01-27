package Sorting;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class demo {
    public static void main(String[] args){
        int[] arr={5,3,7,2,4,1,9,0};


        bubbleSort.sort(arr);

        System.out.print("printing the sorted array--->");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+",");
    }
}
