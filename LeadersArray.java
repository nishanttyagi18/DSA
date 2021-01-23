public class LeadersArray {

    static void printLeaders(int[] arr, int n) {
        int max = arr[n - 1];
        System.out.print(max + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 20, 15, 8, 3 };
        int size = arr.length;

        printLeaders(arr, size);

    }
}
