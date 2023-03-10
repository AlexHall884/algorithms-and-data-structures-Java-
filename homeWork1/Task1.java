package homeWork1;

public class Task1 {
    public static void main(String[] args) {
        
        int[] array = {8, 4, 2, 1, 5, 0};

        int size = array.length;

        Task1 ob = new Task1();
        ob.heapSort(array);

        printArray(array);
        




    }

    public void heapSort(int[] array) {
        int size  = array.length;

        for(int i = size / 2 - 1; i >= 0; i--){
            heapify(array, size, i);
        }

        for(int i = size - 1; i >= 0; i--){
            int buf = array[0];
            array[0] = array[i];
            array[i] = buf;

            heapify(array, i, 0);
        }
    }

    public void heapify(int[] array, int size, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 + i + 2;

        if(left < size && array[left] > array[largest]){
            largest = 1;
        }

        if(right < size && array[right] > array[largest]){
            largest = right;
        }

        if(largest != i){
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, size, largest);
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
