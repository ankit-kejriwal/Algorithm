import java.util.Arrays;

public class BubbleSort {
    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }
    private void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort(){
        boolean isSorted = false;
        for(int i=0;i<this.arr.length-1;i++){
            isSorted = true;
            for(int j =0;j<arr.length-1-i;j++){
                if(this.arr[j] > this.arr[j+1]){
                    swap(j,j+1);
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
