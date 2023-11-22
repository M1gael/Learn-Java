package practice;

public class BubleSort {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0 ; i < n-1 ; i++){
            swapped = false;

            for (int j = 0 ; j < n- i -1 ; j++){
                
                if(arr[j] > arr[j + 1 ]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
        }
    }

    public static void main (String[] args){
        int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting");
        
        for (int i = 0 ; i < arrayToSort.length ; i++){
            System.out.println(arrayToSort[i]);
        }


        bubbleSort(arrayToSort);


        System.out.println("Array after sorting");

        for (int i = 0 ; i < arrayToSort.length ; i++){
            System.out.println(arrayToSort[i]);
        }

    }
}
