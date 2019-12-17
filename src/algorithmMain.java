public class algorithmMain {

    public static void main(String[] args){
        int[] arr = {10,30,20,50,40,80};
        //Bubble sort
        BubbleSort bubbleSort = new BubbleSort(arr);
        System.out.println(bubbleSort.toString());
        bubbleSort.sort();
        System.out.println(bubbleSort.toString());

        //Selection sort
        int[] arr1 = {10,4,20,50,40,6};
        SelectinSort selectinSort = new SelectinSort(arr1);
        System.out.println(selectinSort.toString());
        selectinSort.sort();
        System.out.println(selectinSort.toString());

        //Merge sort
        int[] arr2 = {10,4,20,50,40,6};
        MergeSort mergeSort = new MergeSort(arr2);
        System.out.println(mergeSort.toString());
        mergeSort.mergeSort(arr2,0,arr2.length-1);
        System.out.println(mergeSort.toString());

        //Merge sort
        int[] arr3 = {10,4,20,50,40,6};
        QuickSort quickSort = new QuickSort(arr3);
        System.out.println(quickSort.toString());
        quickSort.sort(arr3,0,arr3.length-1);
        System.out.println(quickSort.toString());

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.check(arr3,3);
        binarySearch.check(arr3,40);
        binarySearch.check(arr1,10);
    }
}
