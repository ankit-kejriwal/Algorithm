import java.util.Arrays;

public class SelectinSort {
    int[] arr;
    SelectinSort(int[] arr){
        this.arr = arr;
    }

    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public void sort(){
        int index =0;
        for(int i =0;i<arr.length-1;i++){
            index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index =j;
                }
            }
            swap(i,index);
        }
    }

    @Override
    public String toString() {
        return "SelectinSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
