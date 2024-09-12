import java.util.Arrays;

public class T3bt1 {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 9, 2, 1, 4, 3, 0 };
        System.out.println("Mang ban dau la : " + Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("Mang sau khi sap xep la : " + Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
