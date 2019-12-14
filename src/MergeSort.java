import java.util.Arrays;

public class MergeSort {
    int[] arr;
    MergeSort(int[] arr){
        this.arr = arr;
    }
    public void mergeSort(int[] arr,int start, int end){
        if(start<end){
            int mid = (end+start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public void merge(int[] arr,int start, int mid,int end){
        int lIndex =start;
        int rIndex = mid+1;
        int k=0;
        int[] temp = new int[end-start+1];
        while (lIndex<=mid && rIndex<=end){
            if(arr[lIndex]<arr[rIndex]){
                temp[k] = arr[lIndex];
                k++;
                lIndex++;
            } else {
                temp[k] = arr[rIndex];
                k++;
                rIndex++;
            }
        }
        while (lIndex<=mid){
            temp[k++] = arr[lIndex++];
        }
        while (rIndex<=end){
            temp[k++] = arr[rIndex++];
        }
        for(int i=start; i<=end;i++){
            arr[i] =temp[i-start];
        }
    }

    @Override
    public String toString() {
        return "MergeSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
