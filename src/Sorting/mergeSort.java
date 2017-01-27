package Sorting;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class mergeSort {
    public static void sort(int[] arr){
        msort(arr,0,arr.length-1);
    }

    public static void msort(int[] arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            msort(arr,low,mid);
            msort(arr,mid+1,high);
            merger(arr,low,mid,high);
        }
    }

    public static void merger(int[] arr,int low,int mid,int high){
        int leftSize=mid-low+1;
        int rightSize=high-mid;

        int[] left=new int[leftSize];
        int[] right=new int[rightSize];

        for(int i=0;i<leftSize;i++){
            left[i]=arr[low+i];

        }

        for(int j=0;j<rightSize;j++){
            right[j]=arr[mid+1+j];
        }


        int i=0;
        int j=0;

        for(int k=low;k<=high;k++){
            if((j>=rightSize) || (i<leftSize && left[i]<right[j])){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
        }

    }
}
