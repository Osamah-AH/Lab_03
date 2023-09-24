public static void main(String[]args){
        int[] arr = {5, 2, 9, 1, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        }

void selectionSort(int arr[])
{
    int n = arr.length;
    int i, j, min_idx;
    for (i = 0; i < n - 1; i++) {
 
        // Find the minimum element in
        // unsorted array
        min_idx = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx])
                min_idx = j;
        }
 
        // Swap the found minimum element
        // with the first element
        if (min_idx != i)
            swap(arr[min_idx], arr[i]);
    }
}

public static void sort(int[] array) {
        selectionSort(array);
        }