public class BinarySearch {
    int[] arr;

    private int search(int[] arr, int ele){
        int start = 0;
        int end = arr.length;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == ele){
                return mid;
            } else if(ele < arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    public void check(int[]arr,int ele){
        int result = search(arr,ele);
        if(result == -1){
            System.out.println("Element is not present");
        } else {
            System.out.println("Element is present at location "+result);
        }
    }
}
