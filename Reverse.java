public class Reverse {
    static void reverse_array(int arr[], int start, int end) {

        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // static void reverse_array_recursive(int[] arr, int start, int end) {
    // if (start >= end) {
    // return;
    // }
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;

    // reverse_array_recursive(arr, start + 1, end - 1);
    // }

    static void print_array(int[] arr, int n) {
        System.out.print("Reversed Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int size = arr.length;

        reverse_array(arr, 0, size - 1);
        // reverse_array_recursive(arr, 0, size - 1);
        print_array(arr, size);
    }
}
