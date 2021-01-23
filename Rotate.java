public class Rotate {

    static void reverse_array(int[] arr, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void left_rotate(int[] arr, int n, int m) {
        // IF ROTATING FACTOR IS ZERO
        if (m == 0) {
            return;
        }
        // IF ROTATING FACTOR IS GREATER THAN ARRAY LENGTH
        m = m % n;
        reverse_array(arr, 0, m - 1);
        reverse_array(arr, m, n - 1);
        reverse_array(arr, 0, n - 1);
    }

    static void print_array(int[] arr, int n) {
        System.out.println("Rotated array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int size = arr.length;
        int rotation_round = 3;
        left_rotate(arr, size, rotation_round);
        print_array(arr, size);
    }
}
