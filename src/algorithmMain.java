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
    }
}
